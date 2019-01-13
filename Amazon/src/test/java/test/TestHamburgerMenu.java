package test;

import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import search.HamburgerMenu;

public class TestHamburgerMenu extends CommonApi {
    HamburgerMenu obj;

    @BeforeMethod
    public void init() {
        obj = PageFactory.initElements(driver, HamburgerMenu.class);
    }

    @Test
    public void testClickHamburgerMenuTest() throws InterruptedException {
        String actual = obj.clickOnHamburgerMenu();
        //String expect = "https://www.amazon.com/";
       // Assert.assertEquals(actual, expect);
        //Thread.sleep(20000);
    }

}