package com.example.tests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

import static io.restassured.filter.log.RequestLoggingFilter.logRequestTo;
import static io.restassured.filter.log.ResponseLoggingFilter.logResponseTo;

public class BaseTest {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
//        RestAssured.filters(logRequestTo(System.out), logResponseTo(System.out));
    }
}
