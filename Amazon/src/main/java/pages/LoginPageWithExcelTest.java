package pages;

import excelReader.LoginPage;
import excelreader.MyDataReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.File;

public class LoginPageWithExcelTest extends LoginPage {
    LoginPage search=null;
    @BeforeMethod
    public void initialisationOfElements(){
        search = PageFactory.initElements(driver,LoginPage.class);
    }
    @DataProvider(name="DP")
    public Object[][] getTestData() throws Exception{
        File filepath = new File("/Users/zayka/Desktop/webautomationteam/Amazon/src/test/Resources/Excel File.xlsx");
        MyDataReader dr = new MyDataReader();
        dr.setExcelFile(filepath.getAbsolutePath());
        String[][] data = dr.getExcelSheetData("Sheet2");
        return data;
    }
    @Test(dataProvider = "DP")
    public  void testLoginWithEnterFromXlsx(String userID, String password, String errorMessage) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + getClass().getEnclosingMethod().getName());
        String messageText=userLogin(userID,password);
        Assert.assertEquals( messageText,errorMessage);
    }
}

