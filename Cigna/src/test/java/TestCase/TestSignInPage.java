package TestCase;

import homePagePageNObject.SignInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
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
        String actualErrorMessage = login("ihanadiat@gmail.com", "abcd");
        Assert.assertEquals(actualErrorMessage,"The ID and password combination you entered does not match our records");
    }
}

