package testcases;

import constants.EndPoints;
import org.json.simple.JSONObject;
import org.junit.Test;
import utils.ConfigManager;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class updatePatch {
    @Test
    public void patch(){
        JSONObject obj=new JSONObject();
        obj.put("name","QASIM");
        obj.put("job","QA");
    /*
        ---------------------------------------------------------------------
            Update only a patch of information.
        ---------------------------------------------------------------------     */
        baseURI= ConfigManager.baseUri;
        given().
                body(obj.toJSONString()).
                when()
                .patch(EndPoints.UPDATE_PATCH).
                then().
                statusCode(200).log().all();
    }
}
