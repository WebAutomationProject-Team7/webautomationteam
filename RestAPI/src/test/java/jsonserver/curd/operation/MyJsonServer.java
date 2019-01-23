package jsonserver.curd.operation;
import base.RestCommonApi;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

import static io.restassured.RestAssured.given;
public class MyJsonServer extends RestCommonApi {
    @Test
    public void postTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id",4);
        jsonObject.put("title", "Mobile Automation ");
        jsonObject.put("author", "Arif");
        jsonObject.put("city", "NYC");
        request.body(jsonObject.toJSONString());
        Response response = request.post("http://localhost:3000/posts");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 201);//created
    }
    @Test
    public void getPost() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Response response = given().when().get("http://localhost:3000/posts").then().statusCode(200).extract().response();
        String statusLine = response.getStatusLine();
        int statusCode = response.getStatusCode();
        String body = response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        Assert.assertEquals(statusCode, 200);//ok
    }
    @Test
    public void deletePost() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        RequestSpecification request = RestAssured.given();
        Response response = request.delete("http://localhost:3000/posts/4");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);//ok
    }
    @Test
    public void putPost() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 1);
        jsonObject.put("title", "Selenium");
        jsonObject.put("author", "Arif mahmud");
        request.body(jsonObject.toJSONString());
        Response response = request.put("http://localhost:3000/posts/1");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);//ok
    }
    @Test
    public void invalidPutPost() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 999);
        jsonObject.put("title", "Selenium");
        jsonObject.put("author", "Arif");
        request.body(jsonObject.toJSONString());
        Response response = request.put("http://localhost:3000/posts/999");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 404);//not found
    }
}
