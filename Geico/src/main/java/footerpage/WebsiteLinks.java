package footerpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagebase.ApplicationPageBase;
import reporting.TestLogger;

public class WebsiteLinks extends ApplicationPageBase {
    @FindBy(css="#footer-links-secondary > ul > li:nth-child(1) > a")
    public static WebElement privacyLink;
    @FindBy(id="header")
    public static WebElement privacyPolicyPopupHeader;
    @FindBy(css="#footer-links-secondary [href='\\/legal\\/']")
    public static WebElement legalLink;
    @FindBy(css=".icon-geico")
    public static WebElement logo;
    @FindBy(linkText = "SITE MAP")
    public static WebElement siteMap;
    //PopUp window handling
    public String clickOnPrivacyLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        privacyLink.click();
        handleNewTab(driver);
        isPopUpWindowDisplayed(driver,"#container");
        return privacyPolicyPopupHeader.getText();
    }
    public  String clickOnLegal(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        legalLink.click();
        String url=driver.getCurrentUrl();
        return url;
    }
    public  String clickONCareer(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//div[@id='footer-links-secondary']/ul//a[@href='/careers/']");
        String url=driver.getCurrentUrl();
        return url;
    }
    public  Boolean clickOnContact(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//div[@id='footer-links-secondary']/ul//a[@href='/contact-us/']");
        boolean display=logo.isDisplayed();
        return display;
    }
    public String clickONSiteMap(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        siteMap.click();
        String url=driver.getCurrentUrl();
        return url;
    }
}
