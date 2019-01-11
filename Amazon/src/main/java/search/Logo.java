package search;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logo extends CommonApi {
    @FindBy(xpath = "//div[text()='Get to Know Us']")
    public static WebElement getToKnowUsTitle;

    public void clickOnGetToKnow() {
        getToKnowUsTitle.click();
    }
}
