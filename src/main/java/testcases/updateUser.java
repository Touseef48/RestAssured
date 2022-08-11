package testcases;

import constants.EndPoints;
import org.json.simple.JSONObject;
import org.junit.Test;
import utils.ConfigManager;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class updateUser {
    @Test
    public void PUT(){
        JSONObject req=new JSONObject();
        req.put("name","Waseem");
        req.put("job","QA");
    /*
        ---------------------------------------------------------------------
            Update all information of the created employee by id.
        ---------------------------------------------------------------------     */
        baseURI= ConfigManager.baseURI;
        given().
                body(req.toJSONString()).
                when()
                .put(EndPoints.UPDATE_USERS).
                then().
                statusCode(200).log().all();
    }
}
