package testcases;

import constants.EndPoints;
import helpers.PersonServiceHelper;
import io.restassured.response.Response;
import org.junit.Assert;
import org.testng.annotations.Test;
import utils.ConfigManager;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

public class deleteUser {
    @Test
    public void Delete(){
        Response response= PersonServiceHelper.deleteUser();
        Assert.assertEquals(response.statusCode(),204);
    }
}
