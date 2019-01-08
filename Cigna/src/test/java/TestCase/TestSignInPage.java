package TestCase;

import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageNobject.OwnPage;
import pageNobject.SignInPage;

public class TestSignInPage extends CommonApi {


        OwnPage objOfOwnPage;
        SignInPage objOfSignInPage;

        @BeforeMethod
        public void initilizationOfObject() {
            objOfOwnPage = PageFactory.initElements(driver, OwnPage.class);
            objOfSignInPage = PageFactory.initElements(driver, SignInPage.class);
        }

        @Test(priority = 1, enabled = true)
        public void loginButton() {
            objOfOwnPage.clickLoginButton();
            String actualErrorMsg = objOfSignInPage.enterCredintials();
            String expectedResult = "The ID and password combination you entered does not match our records.";
            Assert.assertTrue(actualErrorMsg.contains(expectedResult));
        }

        @Test(priority = 1, enabled = true)
        public void regrister1() {
            //PersonalPage pg = PageFactory.initElements(driver, PersonalPage.class);
            objOfOwnPage.clickLoginButton();
            //LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
            objOfSignInPage.howToRegrister();
            objOfSignInPage.registration1();
            objOfSignInPage.registration2();
        }
    }

