package api.client.Junit.Put;
import io.restassured.response.Response;
import org.json.JSONObject;

import static io.restassured.RestAssured.*;

public class PutController {

    public Response updateUser(int userId, String newName) {
        JSONObject body = new JSONObject();
        body.put("name", newName);

        return given()
                .header("Content-Type", "application/json")
                .body(body.toString())
                .when()
                .put("https://jsonplaceholder.typicode.com/users/" + userId);
    }
}
