package testcases;

import helpers.PersonServiceHelper;
import io.restassured.response.Response;
import org.junit.Assert;
import org.testng.annotations.Test;

public class createUser{
    @Test
    public void Post(){
        Response response=PersonServiceHelper.createUser();
        Assert.assertEquals(response.statusCode(),201);
    }
}
