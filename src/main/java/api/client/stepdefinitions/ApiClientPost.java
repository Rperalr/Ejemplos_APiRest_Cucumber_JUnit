package api.client.stepdefinitions;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class ApiClientPost {

    public static Response postUser(String name, String job) {
        return given()
                .baseUri("https://reqres.in")
                .basePath("/api/users")
                .header("Content-Type", "application/json")
                .body("{\"name\": \"" + name + "\", \"job\": \"" + job + "\"}")
                .when()
                .post();
    }
}

