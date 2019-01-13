package search;

import base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends CommonApi {
    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//*[@id=\"nav-logo\"]/a[1]/span[1]")
    public static WebElement homePageLogo;

    public void clickLogo(){

    }

}
