package homePagePageNObject;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import static base.PageOfApplication.convertToString;

public class RegisterPage extends CommonApi {

    @FindBy(xpath = "//*[@id='firstname']")
    public static WebElement firstName;
    @FindBy (xpath = "//*[@id='lastname']")
    public static WebElement lastName;
    @FindBy(xpath ="/html/body/cg-app-root/cg-registration-layout/cg-register/div/ng-component/form/div/div[1]/button")
    public static WebElement next;
    @FindBy(xpath ="//*[@id='month']")
    public WebElement month;
    @FindBy (xpath = "//*[@id=\"day\"]")
    public WebElement day;
    @FindBy (xpath = "//*[@id=\"year\"]")
    public static WebElement dYear;
    @FindBy(xpath ="/html/body/cg-app-root/cg-registration-layout/cg-register/div/ng-component/form/button" )
    public WebElement next2;
    @FindBy(xpath ="//*[@id=\"zipcode\"]")
    public WebElement zipcode;

    public void checkRegistration() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
      firstName.sendKeys("Salma");
        lastName.sendKeys("Alam");
        next.click();
        month.sendKeys("07");
        day.sendKeys("11");
        dYear.sendKeys("1983");
        next2.click();
        zipcode.sendKeys("11423");


    }
}

