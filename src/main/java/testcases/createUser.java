package testcases;

import constants.EndPoints;
import helpers.PersonServiceHelper;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.json.simple.JSONObject;
import org.junit.Test;
import utils.ConfigManager;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class createUser {
    public static String id;
    @Test
    public void Post(){
        Map<String,Object> map=new HashMap<String,Object>();
        JSONObject request=new JSONObject();
        request.put("name","ALI");
        request.put("job","QA");
    /*
        ---------------------------------------------------------------------
            Creating New User using POST Request and getting assigned ID:
        ---------------------------------------------------------------------     */
        baseURI= ConfigManager.baseURI;
        System.out.println(baseURI);
        Response response=given().
                body(request.toJSONString()).
                when()
                .post(EndPoints.CREATE_USERS).
                then().
                statusCode(201).extract().response();

        ResponseBody body=response.getBody();
        String res=body.asString();
        JsonPath jp = new JsonPath( res );
        id= jp.getString("id");
        System.out.println("Assigned ID is: "+id);
    }
}
