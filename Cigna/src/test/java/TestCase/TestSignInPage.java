package TestCase;

import base.PageOfApplication;
import excelreader.MyDataReader;
import homePagePageNObject.HomePage;
import homePagePageNObject.SignInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;

public class TestSignInPage extends PageOfApplication {

        SignInPage signInPage;
        HomePage homePage;

    @BeforeMethod
    public void initializationOfElements() {

        signInPage= PageFactory.initElements(driver, SignInPage.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    @DataProvider(name="DP")
    public Object[][] getTestData() throws Exception{
        File filepath = new File(System.getProperty("user.dir") +  "/testData/TestData.xlsx");
        MyDataReader dr = new MyDataReader();
        dr.setExcelFile(filepath.getAbsolutePath());
        String[][] data = dr.getExcelSheetData("Sheet1");
        return data;
    }
    @Test(dataProvider = "DP")
    public  void invalidSignin(String email, String password, String expectedErroMessage) throws InterruptedException {

        homePage.getLogInPage();
        signInPage.userLogin(email,password);
        String expectedText = expectedErroMessage;
        String actulText= expectedErroMessage;
        Assert.assertEquals(actulText, expectedText);
    }
}


