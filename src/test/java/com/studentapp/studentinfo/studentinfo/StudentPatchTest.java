package com.studentapp.studentinfo.studentinfo;

import com.studentapp.model.student.StudentPojo;
import com.studentapp.studentinfo.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.patch;

/**
 * Created by Yatin
 */
public class StudentPatchTest extends TestBase {

    StudentPojo studentPojo = new StudentPojo();

    @Test
    public void patch01() {
        //studentPojo.setFirstName("Vernon");
        //studentPojo.setLastName("Harper");
        studentPojo.setEmail("jaypatel48@gmail.com");
        //studentPojo.setProgramme("IT");
        //studentPojo.setCourses();

        Response response = given().log().all()
                .header("content-type", "application/json")
                .when()
                .body(studentPojo)
                .patch("/1");
        response.then().log().all().statusCode(200);
    }

    @Test
    public void patch02() {
        //studentPojo.setFirstName("Cullen");
        //studentPojo.setLastName("Craig");
        studentPojo.setEmail("amitPatel28@gmail.com");

        Response response = given().log().all()
                .header("content-type", "application/json")
                .when()
                .body(studentPojo)
                .patch("/5");
        response.then().log().all().statusCode(200);


    }

    @Test
    public void patch03() {
        studentPojo.setEmail("amit88@gmail.com");

        Response response = given().log().all()
                .header("content-type", "application/json")
                .when()
                .body(studentPojo)
                .patch("/8");
        response.then().log().all().statusCode(200);
    }

    @Test
    public void patch04() {
        studentPojo.setFirstName("Rajesh");
        studentPojo.setLastName("Rai");
        studentPojo.setEmail("rajesh@yahoo.com");

        Response response = given().log().all()
                .header("content-type", "application/json")
                .when()
                .body(studentPojo)
                .patch("/9");
        response.then().log().all().statusCode(200);

    }

    @Test
    public void patch05() {
        studentPojo.setFirstName("Shah");
        studentPojo.setLastName("Chadwick");
        studentPojo.setEmail("shah@hotmail.com");
        Response response = given().log().all()
                .header("content-type", "application/json")
                .when()
                .body(studentPojo)
                .patch("/12");
        response.then().log().all().statusCode(200);
    }

}
