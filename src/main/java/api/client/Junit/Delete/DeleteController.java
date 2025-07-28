package api.client.Junit.Delete;

import io.restassured.response.Response;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class DeleteController {

    public Response deleteUser(int userId) {
        JSONObject body = new JSONObject();
        body.put("userId", userId);

        return given()
                .header("Content-Type", "application/json")
                .body(body.toString())
                .when()
                .delete("https://jsonplaceholder.typicode.com/users/" + userId);
    }
}
