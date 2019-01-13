package test;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import search.OrderBar;

public class TestOrderBar extends CommonApi {
    OrderBar obj;

    @BeforeMethod
    public void init(){
        obj= PageFactory.initElements(driver, OrderBar.class);
    }

    @Test
    public void testClickYourOrders(){
        obj.clickYourOrders();

    }
}
