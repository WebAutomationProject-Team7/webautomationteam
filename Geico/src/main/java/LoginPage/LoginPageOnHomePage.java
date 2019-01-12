package LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import pagebase.ApplicationPageBase;

public class LoginPageOnHomePage extends ApplicationPageBase {
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

    public static void userLogin(){
        login.click();
        user_ID.sendKeys("kjsbckbks");
        password.sendKeys("djbjs");
        rememberMeCheckBox.click();
        loginSubmitButton.click();
    }
}
