package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import search.Logo;

import java.util.Collections;

public class TestLogo extends Logo {
    Logo obj;
    @BeforeMethod
    public void init(){
        obj = PageFactory.initElements(driver, Logo.class);
    }
    @Test
    public void testClickGetToKnowUs() throws InterruptedException{


    }
}
