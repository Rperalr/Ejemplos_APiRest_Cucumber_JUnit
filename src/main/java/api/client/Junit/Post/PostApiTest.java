package api.client.Junit.Post;


import io.cucumber.java.BeforeAll;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class PostApiTest {


    private ApiConfigPost ApiConfigPost;

    @Test
    public void testSuccessfulPost() {
        this.ApiConfigPost.setup();
        this.ApiConfigPost.PostNewResource();
    }
}
