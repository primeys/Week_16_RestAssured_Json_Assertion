package com.studentapp.studentinfo.studentinfo;

import com.studentapp.studentinfo.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.Validatable;
import io.restassured.response.ValidatableResponse;
import org.codehaus.groovy.control.io.ReaderSource;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by Yatin
 */
public class StudentGetTest extends TestBase {

    @Test
    public void getAllStudentInformation() {
        //Method 1
        Response response = given().log().all()
                .when()
                .get("/list");

        response.then().log().ifValidationFails().statusCode(200);

        //to print output of
        //System.out.println(response.prettyPrint());

//    //Method 2
//    ValidatableResponse response1 = given()
//            .when()
//            .get("/list")
//            .then()
//            .statusCode(200);
    }

    @Test
    public void getSingleStudentInformation() {
        Response response = given()
                .when()
                .get("/103");
        response.then().statusCode(200);
        System.out.println(response.prettyPrint());

    }

    @Test
    public void getSingleInfoWithParamater() {
        Response response = given()
                .param("programme", "Financial Analysis")
                .param("limit", 2)
                .when()
                .get("/list");
        response.then().log().all().statusCode(200);
        System.out.println(response.prettyPrint());

    }

    // Work 10 Test for GET Method

    @Test
    public void get001() {
        Response response = given()
                .when()
                .get("/9");
        response.then().log().all().statusCode(200);
        // System.out.println(response.prettyPrint());
    }

    @Test
    public void get002() {
        Response response = given()
                .when()
                .get("/list");
        response.then().log().all().statusCode(200);
    }

    @Test
    public void get003() {
        Response response = given()
                .param("programme", "Law")
                .when()
                .get("/list");
        response.then().log().all().statusCode(200);
    }

    @Test
    public void get004() {
        Response response = given().log().all()
                .param("lastName", "Alden")
                .when()
                .get("/list");
        response.then().log().ifValidationFails().statusCode(200);
    }

    @Test
    public void get005() {
        Response response = given().log().all()
                .param("programme", "Financial Analysis")
                .param("limit", 4)
                .when()
                .get("/list");
        response.then().statusCode(200);
    }

    @Test
    public void get006() {
        Response response = given().log().all()
                .when()
                .get("/52");
        response.then().statusCode(200);
    }

    @Test
    public void get007() {
        Response response = given().log().all()
                .param("programme", "Disaster Management")
                .when()
                .get("list");
        response.then().statusCode(200);
    }

    @Test
    public void get008() {
        Response response = given().log().all()
                .param("email", ".edu")
                .when()
                .get("/list");
        response.then().statusCode(200);
    }

    @Test
    public void get009() {
        Response response = given().log().all()
                .when()
                .get("/105");
        response.then().log().all().statusCode(404);
    }

    @Test
    public void get010() {
        Response response = given().log().all()
                .param("programme", "Medicine")
                .param("limit", 3)
                .when()
                .get("list");
        response.then().log().all().statusCode(200);
    }


}
