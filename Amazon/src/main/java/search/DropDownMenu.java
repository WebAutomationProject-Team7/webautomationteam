package search;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownMenu extends CommonApi {
    public DropDownMenu(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='hmenu-content']/ul[1]/li[2]/div")
    public static WebElement PrimeVideo;

    public void selectPrimeVideo() {

    }
}
