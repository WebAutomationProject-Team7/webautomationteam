package homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagebase.ApplicationPageBase;
import reporting.TestLogger;
public class LoginFunctionality extends ApplicationPageBase {
    @FindBy(xpath = "//div[@id='header-right-links']/ul[1]/li[2]/a[@href='#']")
    public static WebElement login;
    @FindBy(id="LOGIN_policyNo")
    public static WebElement user_ID;
    @FindBy(id="LOGIN_password")
    public static  WebElement password;
    @FindBy(css=".checkbox")
    public static WebElement rememberMeCheckBox;
    @FindBy(id="manageSubmit")
    public static WebElement loginSubmitButton;
    @FindBy(id="userPassword-msgs")
    public static WebElement loginErrorMessage;
    public  String  userLogin(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        login.click();
        user_ID.sendKeys("wrong@gmail.com");
        password.sendKeys("wrongpassword");
        rememberMeCheckBox.click();
        loginSubmitButton.click();
        navigateBack();
        clearField(user_ID);
        clearField(password);
        return loginErrorMessage.getText();
    }
}
