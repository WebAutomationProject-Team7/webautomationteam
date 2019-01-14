package homePage;
import database.ConnectToSqlDB;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagebase.ApplicationPageBase;
import reporting.TestLogger;
import java.util.ArrayList;
import java.util.List;

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
    public  String  userLogin(String userIDKey, String  passwordKey) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        login.click();
        user_ID.sendKeys(userIDKey);
        password.sendKeys(passwordKey);
        rememberMeCheckBox.click();
        loginSubmitButton.click();
        return loginErrorMessage.getText();
    }
    public String searchfromdatabase() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ConnectToSqlDB con=new ConnectToSqlDB();
        List<String> messageList=new ArrayList<>();
        List<String> data = con.readDataBase("Login","ErrorMessage");
        for (String key:data){ messageList.add(key);navigateBack();
        }
        return messageList.get(0);
    }

}
