package test;

import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import search.HomePage;

public class TestHomePage extends CommonApi {
    HomePage obj;
    @BeforeMethod
    public void init(){
        obj = PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void testClickLogo(){
        obj.clickLogo();

    }
}

