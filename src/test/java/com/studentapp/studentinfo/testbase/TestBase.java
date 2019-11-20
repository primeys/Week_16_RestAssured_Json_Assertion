package com.studentapp.studentinfo.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created by Yatin
 */
public class TestBase {

    @BeforeClass
    public static void inIT() {
        RestAssured.baseURI = "http://localhost:8080";
        RestAssured.basePath = "/student";
    }
}
