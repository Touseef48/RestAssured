package testcases;

import constants.EndPoints;
import org.junit.Test;
import utils.ConfigManager;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

public class deleteUser {
    @Test
    public void Delete(){

         /*
        ---------------------------------------------------------------------
            Delete the updated employee.

        ---------------------------------------------------------------------     */
        baseURI= ConfigManager.baseUri;
        when()
                .delete(EndPoints.DELETE_USER).
                then().
                statusCode(204).log().all();
    }
}
