package  stepdefinitions;

import  api.client.ApiClient;
import io.cucumber.java.en.*;
import  io.restassured.response.Response;
import static  org.junit.Assert.*;

public class  PostSteps  {

    ApiClient  client  =  new ApiClient();
    Response  response;

    @Given("se  prepara  la  solicitud para  crear  un  usuario")
    public  void  prepararSolicitud()  {
        //  No  requiere  lógica adicional
    }

    @When("se envía  la  solicitud  POST al  endpoint  de  creación")
    public  void  enviarPost()  {
        response  =  client.createUser("Juan",  "Developer");
    }

    @Then("la  respuesta debe  tener  código  201")
    public  void  verificarCodigo()  {
        assertEquals(201,  response.getStatusCode());
    }

    @And("el  cuerpo  de  respuesta debe  contener  el  nombre del  usuario")
    public  void verificarCuerpo()  {
        String  name =  response.jsonPath().getString("name");
        assertEquals("Juan",  name);
    }
}