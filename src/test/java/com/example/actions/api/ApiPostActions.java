package com.example.actions.api;

import com.example.context.TestContext;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ApiPostActions {
    public void createPost(){
        

    }
    public void sendPostRequest(){
        Response response = RestAssured.post("https://jsonplaceholder.typicode.com/posts");
        TestContext.VALUES.put("GetResponse",response);

    }
    public void checkStatusCode(){
        Response getResponse = (Response) TestContext.VALUES.get("GetResponse");
        Assert.assertEquals(getResponse.getStatusCode(),200);

    }
    public void checkProperBody(){
        Map<String, Object> postContent = new HashMap<>();
        postContent.put("userId", postContent);
        given().contentType(ContentType.JSON)
                .with().body(postContent)
                .then().statusCode(200);

    }
}
