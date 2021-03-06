package homepagetest;
import homepage.LoginFunctionality;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
public class LoginFunctionalityTest extends LoginFunctionality {
    LoginFunctionality loginPageOnHomePage;
    @BeforeMethod
    public void init(){loginPageOnHomePage= PageFactory.initElements(driver, LoginFunctionality.class);}
    @Test
    public void testUserLogin() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actualErrorMessage=userLogin("wrong@gmail.com", "1234");
        Assert.assertEquals(actualErrorMessage,"The login credentials you entered do not match our records. Please verify your entry and try again or click ‘Forgot User ID/Password?’ below.");
    }
}
