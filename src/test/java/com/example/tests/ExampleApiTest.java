package com.example.tests;


import com.example.pojo.Posts;
import com.example.pojo2.pojo2;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ExampleApiTest extends BaseTest {

    @Test(dataProvider = "postIds")
    public void testGetEndpoint(int postId, String title) {

        pojo2 response = given()
                .when()
                .get("/posts/" + postId).as(pojo2.class);
//                .statusCode(200)
//                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json")).getClass();
////                .body("id",equalTo(postId))
////                .body("title",equalTo(title));
//        JsonPath jp = new JsonPath(response);
//        Assert.assertEquals(postId,jp.getInt("id"));
//
//        Assert.assertEquals(title,jp.get("title"));*/

        System.out.println(response.getUser().getProfile().getContacts().get(1).getNumber().);
    }

    @DataProvider(name = "postIds")
    public Object[][] createPostData() {
        return new Object[][] {
                { 1,"sunt aut facere repellat provident occaecati excepturi optio reprehenderit" },
                { 2,"qui est esse" },
                { 3,"ea molestias quasi exercitationem repellat qui ipsa sit aut" }
        };
    }


}
