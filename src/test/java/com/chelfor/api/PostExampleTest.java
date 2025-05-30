package com.chelfor.api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

public class PostExampleTest {

    @Test
    public void testPostRequest() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        String requestBody = "{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }";

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
            .when()
                .post("/posts");

        // Konsola detaylı bilgi yazdır
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body:\n" + response.getBody().asPrettyString());

        // Başarı kontrolü
        assertEquals("Status code should be 201", 201, response.getStatusCode());
        assertEquals("Title should be 'foo'", "foo", response.jsonPath().getString("title"));
        assertEquals("Body should be 'bar'", "bar", response.jsonPath().getString("body"));
        assertEquals("userId should be 1", 1, (int) response.jsonPath().getInt("userId"));
    }
}
