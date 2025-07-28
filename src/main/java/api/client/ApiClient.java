package api.client;

import  io.restassured.response.Response;
import  static  io.restassured.RestAssured.given;

public  class  ApiClient  {
    private  String  baseUrl  = "https://reqres.in/api";

    public  Response createUser(String  name,  String  job) {
        String  payload  = "{  \"name\":  \""  + name  +  "\",  \"job\": \""  +  job  + "\"  }";

        return given()
                .header("Content-Type",  "application/json")
                .body(payload)
                .post(baseUrl);
    }
}