package api.client.Junit.Put;

import io.restassured.response.Response;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestPutController {

    @Test
    public void testUpdateUser() {

        PutController client = new PutController();

        int userId = 18;
        String newName = "Roberto Peralta";
        Response response = client.updateUser(userId, newName);

        // Verifica que el código de respuesta sea 200
        assertEquals(200, response.getStatusCode());
        // Verifica que el nombre se haya actualizado (simulado en jsonplaceholder)
        String responseBody = response.getBody().asString();
        assertTrue(responseBody.contains(newName));

        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asString());
    }
}
