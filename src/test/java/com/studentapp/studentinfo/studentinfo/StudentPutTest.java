package com.studentapp.studentinfo.studentinfo;

import com.studentapp.model.student.StudentPojo;
import com.studentapp.studentinfo.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

/**
 * Created by Yatin
 */
public class StudentPutTest extends TestBase {
    StudentPojo studentPojo = new StudentPojo();
    List<String> courses = new ArrayList<>();//6
    //courses.add("Java");//7
    //courses.add("C++");//8

    @Test
    public void put01() {
        studentPojo.setFirstName("Shah");
        studentPojo.setLastName("Nayan");
        studentPojo.setEmail("shahnayan@hotmail.com");
        studentPojo.setProgramme("IT");
        courses.add("Java");
        courses.add("GitHub");
        studentPojo.setCourses(courses);
        Response response = given().log().all()
                .header("content-type", "application/json")
                .when()
                .body(studentPojo)
                .put("/76");
        response.then().log().all().statusCode(201);
    }

    @Test
    public void put02() {
        studentPojo.setFirstName("Shah");
        studentPojo.setLastName("jay");
        studentPojo.setEmail("shah86@hotmail.com");
        studentPojo.setProgramme("Computer");
        courses.add("PHP");
        courses.add("Git");
        studentPojo.setCourses(courses);
        Response response = given().log().all()
                .header("content-type", "application/json")
                .when()
                .body(studentPojo)
                .put("/30");
        response.then().log().all().statusCode(201);
    }

    @Test
    public void put03() {
        studentPojo.setFirstName("Patel");
        studentPojo.setLastName("Praful");
        studentPojo.setEmail("patel204@gmail.com");
        studentPojo.setProgramme("Maths");
        courses.add("");
        courses.add("");
        studentPojo.setCourses(courses);
        Response response = given().log().all()
                .header("content-type", "application/json")
                .when()
                .body(studentPojo)
                .put("/56");
        response.then().log().all().statusCode(201);
    }

    @Test
    public void put04() {
        studentPojo.setFirstName("Pratik");
        studentPojo.setLastName("Mehta");
        studentPojo.setEmail("PMehta17@hotmail.com");
        studentPojo.setProgramme("IT");
        courses.add("Java");
        courses.add("GitHub");
        studentPojo.setCourses(courses);
        Response response = given().log().all()
                .header("content-type", "application/json")
                .when()
                .body(studentPojo)
                .put("/80");
        response.then().log().all().statusCode(201);
    }

    @Test
    public void put05() {
        studentPojo.setFirstName("Vyas");
        studentPojo.setLastName("Pranav");
        studentPojo.setEmail("pranav@yahoo.com");
        studentPojo.setProgramme("Arts");
        courses.add("fineArts");
        courses.add("commercial");
        studentPojo.setCourses(courses);
        Response response = given().log().all()
                .header("content-type", "application/json")
                .when()
                .body(studentPojo)
                .put("/15");
        response.then().log().all().statusCode(201);
    }


}
