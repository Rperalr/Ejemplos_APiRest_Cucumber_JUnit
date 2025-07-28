package api.client.Junit.Delete;

import io.restassured.response.Response;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestDeleteController {

    @Test
    public void testDeleteUser() {

        DeleteController client = new DeleteController();

        int userId = 20;
        Response response = client.deleteUser(userId);

        // Verifica que el código de respuesta sea 200
        assertEquals(200, response.getStatusCode());
        System.out.println(response.getStatusCode());

    }
}
