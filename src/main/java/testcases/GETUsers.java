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
import org.testng.annotations.Test;
import utils.ConfigManager;
import helpers.PersonServiceHelper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GETUsers {

    @Test
    public void test02()
    {
        Response response=PersonServiceHelper.GetAllPerson();
        Assert.assertEquals(response.statusCode(),200);
    }
}
