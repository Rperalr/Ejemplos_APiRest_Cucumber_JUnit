package api.client.stepdefinitions;


import api.client.Junit.Post.ApiConfigPost;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class PostApiTestSteps {

    private Response response;
    private final String requestBody = """
        {
            "title": "foo",
            "body": "bar",
            "userId": 1
        }
    """;

    @Given("que la API está disponible")
    public void apiDisponible() {
        // Se asume que la API está disponible
        ApiConfigPost.setup();
    }

    @When("envío una solicitud POST con datos válidos")
    public void envioSolicitudPost() {
        response = given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .post("/posts")
                .then()
                .extract().response();
    }

    @Then("recibo una respuesta con código 201")
    public void validoCodigoRespuesta() {
        assertEquals(201, response.statusCode());
    }

    @And("el cuerpo de la respuesta contiene el título enviado")
    public void validoTitulo() {
        assertEquals("foo", response.jsonPath().getString("title"));
    }
}
