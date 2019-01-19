package datadriventest;

import googlesheetapi.GoogleSheetReader;
import homepage.LoginFunctionality;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class LoginTestWithGoogleSheetApi extends LoginFunctionality {
    LoginFunctionality loginFunctionality=null;
    @BeforeMethod
    public void initialisationOfElements(){
        loginFunctionality = PageFactory.initElements(driver,LoginFunctionality.class);
    }
    @Test
    public void testSearchWithEnterfromSheet() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Properties properties=loadProperties();
        String spreadSheetId=properties.getProperty("GOOGLE.Login.spreadsheetId");
        String range=properties.getProperty("GOOGLE.Login.range");
        List<List<Object>> getRecords= GoogleSheetReader.getSpreadSheetRecords(spreadSheetId,range );
        for(List cell:getRecords){
            String messageText=userLogin(cell.get(0).toString(),cell.get(1).toString());
            String message=cell.get(2).toString();
            navigateBack();

            Assert.assertEquals( message,messageText);
        }
    }
}
