package com.chelfor.api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

public class PostExampleTest {

    @Test
    public void testPhpPostWithUserInfo() {
        RestAssured.baseURI = "https://api.chelfor.net";

        String jsonPayload = "{\n" +
                "    \"name\": \"Mehmet Yılmaz\",\n" +
                "    \"email\": \"mehmet@example.com\",\n" +
                "    \"username\": \"mehmety\",\n" +
                "    \"password\": \"gizli123\",\n" +
                "    \"role\": \"admin\",\n" +
                "    \"created_at\": \"2025-05-30T14:00:00+03:00\"\n" +
                "}";

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(jsonPayload)
            .when()
                .post("/yazilimtest/test-api.php");

        System.out.println("Durum Kodu: " + response.getStatusCode());
        System.out.println("Yanıt:\n" + response.getBody().asPrettyString());
    }
}
