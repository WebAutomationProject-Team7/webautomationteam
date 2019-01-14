package pagebase;

import base.CommonApi;
import org.apache.maven.surefire.shade.org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import reporting.TestLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
public class ApplicationPageBase extends CommonApi {
    Properties prop=null;
    @FindBy(name = "OnlineOpinion1")
    public static WebElement feedbackFrame;
    @FindBy(id="oo_tab")
    public static WebElement feedbackIcon;
    @FindBy (css = ".large_only")
    public static WebElement heroImage;
    @FindBy(css = "#header-right-links > ul > li:nth-child(3) > a > span")
    public static WebElement searchIcon;

    public static void clearField(WebElement webElement) {
        webElement.clear();
    }
    public void clickSubmit(WebElement element){element.click();}

    public static void navigateBack() {
        driver.navigate().back();
    }

    public void typeOnWebElement(WebElement webElement, String value) {
        webElement.sendKeys(value);
    }
    public void typeOnWebElementAndEnter(WebElement webElement, String value) {
        webElement.sendKeys(value, Keys.ENTER);
    }
    public   void waitToBeVisible(WebElement element){
        element.click();
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitToBeVisible(String xpathLocator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathLocator)));
    }
    public static String getTexttoLog(WebElement webElement, String webElementName) {

        TestLogger.log("Getting Text from " + webElementName);
        String actualText =  webElement.getText();
        TestLogger.log("Actual text: " + actualText);

        return actualText;

    }
    public static void clicktoLog(WebElement webElement, String webElementName){
        TestLogger.log("Click " + webElementName );
        webElement.click();
        TestLogger.log("Clicked " + webElementName);
    }
    public static Properties loadProperties() throws IOException {
        Properties prop = new Properties();
        File filepath = new File("C:\\Users\\arifq\\eclipse-workspace\\webautomationteam\\Geico\\src\\test\\Resources\\secret.properties");
        InputStream ism = new FileInputStream(filepath.getAbsoluteFile());
        prop.load(ism);
        ism.close();
        return prop;
    }
    public static String convertToString(String st){
        String splitString ;
        splitString = StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(st), ' ');
        return splitString;
    }
}
