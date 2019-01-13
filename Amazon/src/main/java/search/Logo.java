package search;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logo extends CommonApi {
    public Logo(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[text()='Careers']")
    public static WebElement careers;

    public String clickOnCareers() {
        careers.click();
        String url = driver.getCurrentUrl();
        return url;
    }
}
