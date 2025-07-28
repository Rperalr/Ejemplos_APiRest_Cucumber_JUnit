package com.example.api;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import org.json.JSONObject;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

public class PutSteps {

    private Response response;
    private int userId;

    @Given("que tengo un usuario con ID {int}")
    public void que_tengo_un_usuario_con_id(Integer id) {
        this.userId = id;
    }

    @When("actualizo su nombre a {string}")
    public void actualizo_su_nombre_a(String nuevoNombre) {
        JSONObject body = new JSONObject();
        body.put("name", nuevoNombre);

        response = given()
                .header("Content-Type", "application/json")
                .body(body.toString())
                .when()
                .put("https://jsonplaceholder.typicode.com/users/" + userId);
    }

    @Then("la respuesta debe tener código {int}")
    public void la_respuesta_debe_tener_codigo(Integer codigoEsperado) {
        assertEquals(codigoEsperado.intValue(), response.getStatusCode());
    }
}
