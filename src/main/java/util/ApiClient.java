package util;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ApiClient {

    public static Response get(String endpoint) {
        return given().when().get(endpoint);
    }

    public static Response post(String endpoint, Object body) {
        return given().body(body).when().post(endpoint);
    }

    // Add other methods (put, delete) as needed
}