package api.client.Junit.Post;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.junit.Assert.assertEquals;

public class ApiConfigPost {

    private static String payload = """
                    {
                        "title": "foo",
                        "body": "bar",
                        "userId": 1
                    }
                """;

    public static void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }


    public static void PostNewResource(){

        String requestBody = payload;

        Response response = RestAssured.given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .post("/posts")
                .then()
                .extract().response();

        assertEquals(  201, response.statusCode());
        assertEquals("foo", response.jsonPath().getString("title"));
        assertEquals("bar", response.jsonPath().getString("body"));
        assertEquals(  "1", response.jsonPath().getString("userId"));
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());

    }
}
