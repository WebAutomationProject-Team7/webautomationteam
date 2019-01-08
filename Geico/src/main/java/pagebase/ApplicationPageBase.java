package pagebase;

import base.CommonApi;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplicationPageBase extends CommonApi {

    @FindBy(name = "OnlineOpinion1")
    public static WebElement feedbackFrame;
    @FindBy(id="oo_tab")
    public static WebElement feedbackIcon;
    @FindBy (css = ".large_only")
    public static WebElement heroImage;
    @FindBy(css = "#header-right-links > ul > li:nth-child(3) > a > span")
    public static WebElement searchIcon;

    public void clearField(WebElement webElement) {
        webElement.clear();
    }

    public void clickSubmit(WebElement element){element.click();}

    public void navigateBack() {
        driver.navigate().back();
    }

    public void typeOnWebElement(WebElement webElement, String value) {
        webElement.sendKeys(value);
    }

    public void typeOnWebElementAndEnter(WebElement webElement, String value) {
        webElement.sendKeys(value, Keys.ENTER);
    }
}
