package testcases;

import helpers.PersonServiceHelper;
import io.restassured.response.Response;
import org.junit.Assert;
import org.testng.annotations.Test;

public class deleteUser {
    @Test
    public void Delete(){
        Response response= PersonServiceHelper.deleteUser();
        Assert.assertEquals(response.statusCode(),204);
    }
}
