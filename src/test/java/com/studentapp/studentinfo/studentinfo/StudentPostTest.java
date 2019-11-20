package com.studentapp.studentinfo.studentinfo;

import com.studentapp.model.student.StudentPojo;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

/**
 * Created by Yatin
 */
public class StudentPostTest {
    StudentPojo studentPojo = new StudentPojo();
    List<String> courses = new ArrayList<>();

    @Test
    public void createNewStudent() {
        List<String> courses = new ArrayList<>();//6
        courses.add("Java");//7
        courses.add("C++");//8
        StudentPojo studentPojo = new StudentPojo();// Object Created
        studentPojo.setFirstName("Jay");
        studentPojo.setLastName("Patel");
        studentPojo.setEmail("jaypatel8@gmail.com");
        studentPojo.setProgramme("IT");
        studentPojo.setCourses(courses);

        Response response = given() //1
                .header("content-type", "application/json")//2
                .when()//3
                .body(studentPojo)//4
                .post();//5
        response.then().log().all().statusCode(201);
    }


    // POST request 10 for week 16
    @Test
    public void post01() {
        studentPojo.setFirstName("Raj");
        studentPojo.setLastName("Mathur");
        studentPojo.setEmail("mathurraj@hotmail.com");
        studentPojo.setProgramme("IT");
        courses.add("DB");
        courses.add("SQL");
        studentPojo.setCourses(courses);

        Response response = given().log().all()
                .header("content-type", "application/json")
                .when()
                .body(studentPojo)
                .post();
        response.then().log().all().statusCode(201);
    }

    @Test
    public void post02() {
        studentPojo.setFirstName("Vijay");
        studentPojo.setLastName("Patel");
        studentPojo.setEmail("PatelVij@gmail.com");
        studentPojo.setProgramme("IT");
        courses.add("DB");
        courses.add("SQL");
        studentPojo.setCourses(courses);

        Response response = given().log().all()
                .header("content-type", "application/json")
                .when()
                .body(studentPojo)
                .post();
        response.then().log().all().statusCode(201);
    }

    @Test
    public void post03() {
        studentPojo.setFirstName("Kajal");
        studentPojo.setLastName("Sharma");
        studentPojo.setEmail("Sharma18@gmail.com");
        studentPojo.setProgramme("Finance");
        courses.add("account");
        courses.add("maths");
        studentPojo.setCourses(courses);

        Response response = given().log().all()
                .header("content-type", "application/json")
                .when()
                .body(studentPojo)
                .post();
        response.then().log().all().statusCode(201);

    }

    @Test
    public void post04() {
        studentPojo.setFirstName("Nila");
        studentPojo.setLastName("Shah");
        studentPojo.setEmail("shahnila@gmail.com");
        studentPojo.setProgramme("History");
        courses.add("Geo");
        courses.add("");
        studentPojo.setCourses(courses);

        Response response = given().log().all()
                .header("content-type", "application/json")
                .when()
                .body(studentPojo)
                .post();
        response.then().log().all().statusCode(201);

    }

    @Test
    public void post05() {
        studentPojo.setFirstName("jay");
        studentPojo.setLastName("Dhavan");
        studentPojo.setEmail("dhavanjay@gmail.com");
        studentPojo.setProgramme("Finance");
        courses.add("account");
        courses.add("maths");
        studentPojo.setCourses(courses);

        Response response = given().log().all()
                .header("content-type", "application/json")
                .when()
                .body(studentPojo)
                .post();
        response.then().log().all().statusCode(201);

    }


}
