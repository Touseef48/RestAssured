package testcases;

import constants.EndPoints;
import helpers.PersonServiceHelper;
import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import model.Person;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import utils.ConfigManager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GETUsers {
    @Test
    public  void test01(){
        Response response=get("https://reqres.in/api/users?page=2");
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        /*
        ---------------------------------------------------------------------
            Getting total number of pages and total records from the response
        ---------------------------------------------------------------------     */
        ResponseBody body=response.getBody();
        String New=body.asString();
        JsonPath jp = new JsonPath( New );
        String value = jp.getString( "total_pages" );
        String records= jp.getString("per_page");
        System.out.println("Total Number of pages is: "+value);
        System.out.println("Total records from Response is: "+records);

        int statusCode=response.getStatusCode();
        Assert.assertEquals(statusCode,200);
    }

    @Test
    public void test02(){
        baseURI= ConfigManager.baseURI;
            given()
                .get(EndPoints.GET_ALL_USERS).
                    then().
                statusCode(200).body("total_pages",equalTo(2)).
                    log().all();
    }
}
