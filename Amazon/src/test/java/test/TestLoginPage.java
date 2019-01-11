package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import search.LoginPage;

public class TestLoginPage extends LoginPage {
    LoginPage obj;
    @BeforeMethod
    public void init(){
        obj = PageFactory.initElements(driver, LoginPage.class);
    }

    @Test
    public String clickHelloSignIn(){
        String title = clickHelloSignIn();
        return title;
    }
}
