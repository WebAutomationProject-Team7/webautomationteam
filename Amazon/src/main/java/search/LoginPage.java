package search;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonApi {
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "//span[text()='Hello. Sign in']")
    public static WebElement HelloSignIn;


    public void clickHelloSignIn() {

    }
}
