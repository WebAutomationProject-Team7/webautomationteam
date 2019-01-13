package search;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class OrderBar extends CommonApi {
    public OrderBar(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id='navFooter']/div[1]/div/div[7]/ul/li[2]/a")
    WebElement orderBar;

public void clickYourOrders(){

}
}
