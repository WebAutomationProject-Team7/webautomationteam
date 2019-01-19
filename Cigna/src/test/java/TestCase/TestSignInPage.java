package TestCase;

import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import homePagePageNObject.HomePage;
import homePagePageNObject.SignInPage;
import reporting.TestLogger;

import static base.PageOfApplication.convertToString;

public class TestSignInPage extends SignInPage {


        SignInPage signInPage;
        @BeforeMethod
        public void init(){
            signInPage = PageFactory.initElements(driver, SignInPage.class);}
        @Test
        public void testUserLogin() throws InterruptedException {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            String actualErrorMessage=userLogin("salmaalam@gmail.com", "abcd1234");
            Assert.assertEquals(actualErrorMessage,"Credential is not correct.Verify you ID and Password");
        }
    }
