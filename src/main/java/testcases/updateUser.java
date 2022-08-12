package testcases;

import constants.EndPoints;
import helpers.PersonServiceHelper;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;
import utils.ConfigManager;
import Payload.payload;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class updateUser {
    @Test
    public void PUT(){
        Response response= PersonServiceHelper.updateUser();
        Assert.assertEquals(response.statusCode(),200);
    }
}
