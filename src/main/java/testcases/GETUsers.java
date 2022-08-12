package testcases;

import helpers.PersonServiceHelper;
import io.restassured.response.Response;
import org.junit.Assert;
import org.testng.annotations.Test;

public class GETUsers {

    @Test
    public void test02()
    {
        Response response=PersonServiceHelper.GetAllPerson();
        Assert.assertEquals(response.statusCode(),200);
    }
}
