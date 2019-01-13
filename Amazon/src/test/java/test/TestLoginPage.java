package test;

import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import search.LoginPage;

public class TestLoginPage extends CommonApi {
    LoginPage obj;

    @BeforeMethod
    public void init() {
        obj = PageFactory.initElements(driver, LoginPage.class);
    }

    @Test
    public void testClickHelloSignIn() {
        obj.clickHelloSignIn();
    }
}