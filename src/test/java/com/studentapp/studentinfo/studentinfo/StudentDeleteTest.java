package com.studentapp.studentinfo.studentinfo;

import com.studentapp.studentinfo.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;


import static io.restassured.RestAssured.given;

/**
 * Created by Yatin
 */
public class StudentDeleteTest extends TestBase {
    @Test
    public void delete01() {
        Response response = given().log().all()
                .when()
                .delete("/12");
        response.then().statusCode(204);
    }

    @Test
    public void delete02() {
        // Delete method not allow using email address
        Response response = given().log().all()
                .when()
                .param("email", "egestas.rhoncus.Proin@massaQuisqueporttitor.org")
                .delete();
        response.then().log().all().statusCode(405);
    }

    @Test
    public void delete03() {
        Response response = given().log().all()
                .when()
                .delete("/10");
        response.then().statusCode(204);
    }

    @Test
    public void delete04() {
        Response response = given().log().all()
                .when()
                .delete("/80");
        response.then().statusCode(204);
    }

    @Test
    public void delete05() {
        Response response = given().log().all()
                .when()
                .delete("/48");
        response.then().statusCode(204);
    }
}
