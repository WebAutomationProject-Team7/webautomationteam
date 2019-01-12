package loginpagetest;
import LoginPage.LoginPageOnHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageOnHomePageTest extends LoginPageOnHomePage {
    LoginPageOnHomePage loginPageOnHomePage;
    @BeforeMethod
    public void init(){loginPageOnHomePage= PageFactory.initElements(driver, LoginPageOnHomePage.class);}

    @Test
    public void testUserLogin(){
    userLogin();
    }
}
