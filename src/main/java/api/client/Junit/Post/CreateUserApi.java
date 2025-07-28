package api.client.Junit.Post;

import  io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.HashMap;
import  java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public  class  CreateUserApi  {
    private  String  baseUrl  = "https://jsonplaceholder.typicode.com/users/";  //  URL  de ejemplo


    public  Response createUser
            (String  baseUrl,  Map<String,
                    String> headers,  String  payload)  {
        return  RestAssured.given()
                            .headers(headers)
                            .body(payload)
                            .post(baseUrl);
    }

    public  Response createUser1()  {
        return  RestAssured.given()
                            .headers(headers())
                            .body(jsonPayload())
                            .post(endpoint());
    }

    public String endpoint()  {
            //  Endpoint  relativo
            String endpoint  =  baseUrl;

        return endpoint;
    }
    public Map<String, String> headers()  {
        //  Headers  dinámicos
        Map<String,  String>  headers  = new HashMap<>();
        headers.put("Content-Type",  "application/json");
        headers.put("Authorization",  "Bearer  tu_token_aquí");

        return headers;
    }
    public String jsonPayload()  {
        //  Payload  del  cuerpo
        String  jsonPayload  =  "{\"name\": \"Ana\",  " +
                                 "\"job\":  \"Engineer\"}";

        return jsonPayload;
    }
}