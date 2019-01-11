package search;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonApi {
    @FindBy (xpath = "//span[text()='Hello. Sign in']")
    public static WebElement HelloSignIn;


    public String clickHelloSignIn() {

        return driver.getTitle();
    }
}
