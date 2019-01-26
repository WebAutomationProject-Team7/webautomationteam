package cnn;
import base.RestCommonApi;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;
import static io.restassured.RestAssured.given;
public class TestCnnNewsApi extends RestCommonApi {
    public static String url="https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=3a953102a1d7462f80e0e8572592afdd";
    @Test
    public void callCnnApi() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Response response = given().when().get(url).then().statusCode(200).extract().response();
        String statusLine = response.getStatusLine();
        int statusCode = response.getStatusCode();
        String body = response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        Assert.assertEquals(statusCode, 200);//ok
    }
    @Test
    public void badCallCnnNewsApi() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Response response ;
        int statusCode = 0;
        try {
            response = given().when().get(url+"hjhjhjh");
            statusCode = response.getStatusCode();
        } catch (Exception ex) {
        }
        Assert.assertEquals(statusCode, 401);//Unauthorized
    }
    @Test
    public void testResponseTotalResults() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        JsonPath jsonPathEvaluator = given().when().get(url).jsonPath();
        int id = jsonPathEvaluator.get("totalResults");
        Assert.assertEquals(id, 10); }
    @Test
    public void testResponseStatus() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        JsonPath jsonPathEvaluator = given().when().get(url).jsonPath();
        String status = jsonPathEvaluator.get("status");
        Assert.assertEquals(status, "ok");
    }
}
