package homePagePageNObject;

import base.CommonApi;
import database.ConnectToSqlDB;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

import static base.PageOfApplication.convertToString;
import static base.PageOfApplication.navigateBack;

public class SignInPage extends CommonApi {

    @FindBy(xpath ="//div[@id='c1353257994291']/div[1]/ul/li[1]/a")
    public static WebElement register;
    @FindBy(id="username")
    public static WebElement userId;
    @FindBy(id="password")
    public static  WebElement password;
    @FindBy(css="#userForm > fieldset:nth-child(3) > div > span > button")
    public static WebElement login;
    @FindBy(css="#c1289878640341 > div > p")
    public static WebElement loginErrorMessage;
    public  String  userLogin(String userIDKey, String  passwordKey) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        register.click();
        userId.sendKeys(userIDKey);
        password.sendKeys(passwordKey);
        login.click();
        return loginErrorMessage.getText();
    }
    public String searchFromDatabase() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ConnectToSqlDB con=new ConnectToSqlDB();
        List<String> messageList=new ArrayList<>();
        List<String> data = con.readDataBase("SignIn","Feedback");
        for (String key:data){ messageList.add(key);navigateBack();
        }
        return messageList.get(0);
    }

    public void getErroMessage() {
        return;
    }
}





