package homePagePageNObject;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import static base.PageOfApplication.convertToString;

public class SignInPage extends CommonApi {

    @FindBy(xpath ="//*[@id=\"includes-content\"]/div[1]/nav[2]/div/ul/li[2]/a")
    public static WebElement loginCigna ;
    @FindBy(xpath="//*[@id='username']")
    public static WebElement userId;
    @FindBy(css="#password")
    public static  WebElement password;
    @FindBy(xpath ="//*[@id='userForm']/fieldset[2]/div/span/button")
    public static WebElement login;
    @FindBy(css="#c1289878640341 > div > p")
    public static WebElement loginErrorMessage;

    public  String  login(String userIDKey, String  passwordKey) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        loginCigna.click();
        userId.sendKeys(userIDKey);
        password.sendKeys(passwordKey);
        login.click();
        return loginErrorMessage.getText();
    }
   /* public String searchFromDatabase() throws Exception {
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
    }*/
}





