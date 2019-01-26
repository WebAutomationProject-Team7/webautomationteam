package excelReader;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

public class LoginPage extends CommonApi {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='nav-link-accountList']/span[1]")
    public static WebElement signIn;
    @FindBy(xpath = "//*[@id='ap_email']")
    public static WebElement user_ID;
    @FindBy(xpath = "//*[@id='ap_password']")
    public static WebElement password;
    @FindBy(xpath = "//*[@id='signInSubmit']")
    public static WebElement signInBox;
    @FindBy(xpath = "//*[@id='auth-error-message-box']/div/h4")
    public static WebElement loginErrorMessage;

    public String userLogin(String userIDKey, String passwordKey) throws InterruptedException {

//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));
        signIn.click();
        user_ID.sendKeys(userIDKey);
        password.sendKeys(passwordKey);
        signIn.click();
        return loginErrorMessage.getText();

    }

}
