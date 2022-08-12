package testcases;

import helpers.PersonServiceHelper;
import io.restassured.response.Response;
import org.junit.Assert;
import org.testng.annotations.Test;

public class updateUser {
    @Test
    public void PUT(){
        Response response= PersonServiceHelper.updateUser();
        Assert.assertEquals(response.statusCode(),200);
    }
}
