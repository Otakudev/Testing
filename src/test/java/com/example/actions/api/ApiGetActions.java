package com.example.actions.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import com.example.context.TestContext;
import org.testng.Assert;

public class ApiGetActions {
    public void doGetRequest (){
        Response response = RestAssured.get("https://jsonplaceholder.typicode.com/posts");
        TestContext.VALUES.put("GetResponse",response);
    }
    public void validateGetRequest (){
        Response getResponse = (Response) TestContext.VALUES.get("GetResponse");
        Assert.assertEquals(getResponse.getStatusCode(),200);
    }
}
