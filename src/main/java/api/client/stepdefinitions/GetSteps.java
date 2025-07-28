package api.client.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.junit.Assert.assertEquals;

public class GetSteps {
    @Given("que el usuario pueda tener acceso a la url {string}")
    public Response que_el_usuario_pueda_tener_acceso_a_la_url(String string) {
        // Write code here that turns the phrase above into concrete actions
        Response response = RestAssured
                .given()
                .when().get(string)
                .then().extract().response();
        return response;

    }
    @Then("la respuesta que se espera es un codigo de {string}")
    public void la_respuesta_que_se_espera_es_un_codigo_de(String string) {
        // Write code here that turns the phrase above into concrete actions
        Response response = que_el_usuario_pueda_tener_acceso_a_la_url(string);
        assertEquals("El código respuesta es:"
                + response.getStatusCode() ,string, response.getStatusCode());
        System.out.println("El código respuesta es:"
                + response.getStatusCode());
        throw new io.cucumber.java.PendingException();
    }


}
