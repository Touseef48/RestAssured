package helpers;

import Payload.payload;
import config.applicationConfigReader;
import constants.EndPoints;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.junit.Assert;
import utils.ConfigManager;
import config.configProperties;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;


public class PersonServiceHelper {
    public static String baseURL=configProperties.BaseURl;
    public static String id;

public static Response GetAllPerson(){
    baseURI=baseURL;
    Response response =given()
            .get(EndPoints.GET_ALL_USERS).
            then().
            statusCode(200).
            log().all().extract().response();
    /*
    ---------------------------------------------------------------------
            Getting total number of pages and total records from the response
    ---------------------------------------------------------------------     */
    ResponseBody body=response.getBody();
    String New=body.asString();
    JsonPath jp = new JsonPath( New );
    String value = jp.getString( "total_pages" );
    String records= jp.getString("per_page");
    System.out.println("Total Number of pages is: "+value);
    System.out.println("Total records from Response is: "+records);

    int statusCode=response.getStatusCode();
    Assert.assertEquals(statusCode,200);

    return response;
}

    public static Response createUser(){
    /*
        ---------------------------------------------------------------------
                Creating New User using POST Request and getting assigned ID:
        ---------------------------------------------------------------------     */
        baseURI= baseURL;
        Response response=given().
                header("Content-type", "application/json")
                .and()
                .body(payload.userCreds())
                .when()
                .post(EndPoints.CREATE_USERS)
                .then()
                .log().all().extract().response();

        ResponseBody body=response.getBody();
        String res=body.asString();
        JsonPath jp = new JsonPath( res );
        id= jp.getString("id");
        System.out.println("Assigned ID is: "+id);

        return (response);
    }

    public static Response updateUser(){
        /*
        ---------------------------------------------------------------------
            Update all information of the created employee by id.
        ---------------------------------------------------------------------     */
        baseURI= baseURL;
        Response response=given().
                header("Content-type", "application/json")
                .and().
                body(payload.updateUserCreds()).
                when()
                .put(EndPoints.UPDATE_USERS).
                then().
                statusCode(200).log().all().extract().response();

        return (response);
    }


    public static Response updatePatch(){
        /*
        ---------------------------------------------------------------------
            Update only a patch of information.
        ---------------------------------------------------------------------     */
        baseURI= baseURL;
        Response response=given().
                header("Content-type", "application/json")
                .and().
                body(payload.updatePatchCreds()).
                when()
                .patch(EndPoints.UPDATE_PATCH).
                then().
                statusCode(200).log().all().extract().response();

        return (response);
    }

    public static Response deleteUser(){
        /*
        ---------------------------------------------------------------------
            Delete the updated employee.

        ---------------------------------------------------------------------     */
        baseURI= baseURL;
        Response response=when()
                .delete(EndPoints.DELETE_USER).
                then().
                statusCode(204).log().all().extract().response();

        return (response);
    }
}
