package testcases;

import constants.EndPoints;
import helpers.PersonServiceHelper;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;
import utils.ConfigManager;
import Payload.payload;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class createUser{
    @Test
    public void Post(){
        Response response=PersonServiceHelper.createUser();
        Assert.assertEquals(response.statusCode(),201);
    }
}
