package api.client.Junit.Post;


import  io.restassured.response.Response;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public  class  CreateUserTest {

    @Test
    public void  testCrearUsuarioConPost()  {
        //Instancia de Clase = Object
        CreateUserApi api  =  new  CreateUserApi();
        //  Enviar  la  solicitud POST
        Response  response  = api.createUser(
                api.endpoint(),
                api.headers(),
                api.jsonPayload());
        assertEquals(201,  response.getStatusCode());
        assertTrue(response.getBody().asString().equals("Ana"));
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asString());
    }

    @Test
    public void  testCrearUsuarioConPost1()  {
        //Instancia de Clase = Object
        CreateUserApi api  =  new  CreateUserApi();
        //  Enviar  la  solicitud POST
        Response  response  = api.createUser1();

        assertEquals(201,  response.getStatusCode());
        assertTrue(response.getBody().asString().equals("Ana"));
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asString());

    }
}