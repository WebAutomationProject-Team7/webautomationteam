package datadriventest;

import homePage.LoginFunctionality;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
    public class LoginTestWithDataBase extends LoginFunctionality{
        LoginFunctionality loginFunctionality;
    @BeforeMethod
    public void initialisationOfElements() {
        loginFunctionality = PageFactory.initElements(driver, LoginFunctionality.class);
    }
    @Test
    public void testLoginWithMessageFromDatabase() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals( userLogin("abcd@gmail.com","1234"),searchfromdatabase());
    }

}
