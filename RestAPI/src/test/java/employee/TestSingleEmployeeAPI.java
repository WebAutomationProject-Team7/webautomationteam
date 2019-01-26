package employee;
import base.RestCommonApi;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

import static io.restassured.RestAssured.given;
public class TestSingleEmployeeAPI extends RestCommonApi {
    public static String url="http://info.venturepulse.org:8080/service-webapp/api/SingleEmployeeResources/590a4acd35522970c7956cdf";
    @Test
    public void callSingleEmployeeResources() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Response response = given().when().get(url).then().statusCode(200).extract().response();
        String statusLine = response.getStatusLine();
        int statusCode = response.getStatusCode();
        String body = response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        Assert.assertEquals(statusCode, 200);
    }
}
