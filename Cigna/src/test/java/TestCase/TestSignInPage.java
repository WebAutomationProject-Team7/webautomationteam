package TestCase;

import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageNobject.HomePage;
import pageNobject.SignInPage;

public class TestSignInPage extends CommonApi {


        HomePage ownPage;
        SignInPage signInPage;

        @BeforeMethod
        public void initilizationOfObject() {
            ownPage = PageFactory.initElements(driver, HomePage.class);
            signInPage = PageFactory.initElements(driver, SignInPage.class);
        }

        @Test(priority = 1, enabled = true)
        public void loginButton() {
            String actualErrorMsg = signInPage.enterCredintials();
            String expectedResult = "The ID and password combination you entered does not match our records.";
            Assert.assertTrue(actualErrorMsg.contains(expectedResult));
        }
        @Test(priority = 1, enabled = true)
        public void regrister1() {
            ownPage.checkContactUs();
            signInPage.howToRegrister();
            signInPage.registration1();
            signInPage.registration2();
        }
    }

