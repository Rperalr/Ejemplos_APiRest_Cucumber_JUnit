package api.client.stepdefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import static org.junit.Assert.*;

public class PostApiSteps {

    private Response response;

    @Given("la API está disponible")
    public void laApiEstaDisponible() {
        // Aquí podrías hacer un ping o simplemente asumir que está disponible
    }

    @When("envío una solicitud POST con datos válidos")
    public void envioSolicitudPost() {
        response = ApiClientPost.postUser("Juan", "Developer");
    }

    @Then("la respuesta debe tener código {int}")
    public void validarCodigoRespuesta(int statusCode) {
        assertEquals(statusCode, response.getStatusCode());
    }

    @And("el cuerpo de la respuesta debe contener el nombre {string}")
    public void validarNombreEnRespuesta(String nombreEsperado) {
        String nombre = response.jsonPath().getString("name");
        assertEquals(nombreEsperado, nombre);
    }
}
