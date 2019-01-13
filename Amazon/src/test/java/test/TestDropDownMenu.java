package test;

import base.CommonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import search.DropDownMenu;

import static search.DropDownMenu.PrimeVideo;

public class TestDropDownMenu extends CommonApi {
    DropDownMenu obj;
    @BeforeMethod
    public void init(){
        obj=PageFactory.initElements(driver, DropDownMenu.class);
    }
    @Test
    public void testSelectPrimeVideo() throws InterruptedException{
        obj.selectPrimeVideo();

    }

}
