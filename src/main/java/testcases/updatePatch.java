package testcases;

import helpers.PersonServiceHelper;
import io.restassured.response.Response;
import org.junit.Assert;
import org.testng.annotations.Test;

public class updatePatch {
    @Test
    public void patch(){
        Response response= PersonServiceHelper.updatePatch();
        Assert.assertEquals(response.statusCode(),200);
    }
}
