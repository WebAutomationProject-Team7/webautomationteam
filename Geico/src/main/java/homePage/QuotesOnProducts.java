package homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pagebase.ApplicationPageBase;

import java.util.*;

public class QuotesOnProducts extends ApplicationPageBase {
    @FindBy(css = ".icon-motorcycle")
    public static WebElement motorCycleInsIcon;
    @FindBy(css = ".icon-boat-ins")
    public static WebElement boatInsIcon;
    @FindBy(css = ".icon-umbrella-ins")
    public static WebElement umbrellaInsIcon;
    @FindBy(css = ".icon-rv-ins")
    public static WebElement rvInsIcon;
    @FindBy(css = "#home > div > span")
    public static WebElement homeOwnersInsIcon;
    @FindBy(css = ".icon-renters-ins")
    public static WebElement rentersInsIcon;
    @FindBy(css = ".icon-condo-ins")
    public static WebElement condoInsIcon;


    @FindBy(css = ".icon-auto-collector-ins")
    public static WebElement collectorAutoIcon;
    @FindBy(css = ".icon.icon-mobile-home-ins")
    public static WebElement mobileHomeInsIcon;
    @FindBy(css = ".icon-flood-ins")
    public static WebElement floodInsIcon;
    @FindBy(css = ".icon-commercial-ins")
    public static WebElement commercialAutoIcon;
    @FindBy(css = "#general > div > span")
    public static WebElement generalLiabilityIcon;
    @FindBy(css = ".icon-professional-liability")
    public static WebElement professionalLiabilityIcon;
    @FindBy(css = "#businessowners > div > span")
    public static WebElement businessOwnersIcon;
    @FindBy(xpath = "//div[@id='workerscompensation']//span")
    public static WebElement workersCompensationIcon;

    @FindBy(className = "icon icon-life-ins")
    public static WebElement lifeInsIcon;
    @FindBy(css = ".icon.icon-car-sharing")
    public static WebElement rideSharingIcon;
    @FindBy(css = ".icon.icon-travel")
    public static WebElement travelInsIcon;
    @FindBy(css = ".icon.icon-overseas-ins")
    public static WebElement overseasInsIcon;
    @FindBy(css = ".icon.icon-id-protection-ins")
    public static WebElement identityProtectionIcon;
    @FindBy(css = ".icon.icon-pet-ins")
    public static WebElement petInsIcon;
    @FindBy(css = ".icon.icon-collectibles-ins")
    public static WebElement jewelryInsIcon;
    @FindBy(css = "#landlord>.circle>.icon.icon-homeowner-ins")
    public static WebElement landlordInsIcon;
    @FindBy(css = "#mexicoAuto>.circle>.icon.icon-vehicle")
    public static WebElement mexicoAutoIcon;

    @FindBy(css = "#submitButton")
    public static WebElement getQoute;
    @FindBy(id = "zip")
    public static WebElement zipCodeTextBox;
    @FindBy(className = "icon-chevron-right")
    public static WebElement arrow1;
    @FindBy(css = ".chevron.icon-chevron-right.highlighted")
    public static WebElement arrow2;
    @FindBy(css = ".chevron.icon-chevron-right.highlighted")
    public static WebElement arrow3;
    @FindBy(id = "validationSummary")
    public static WebElement errorMsg;
    @FindBy(xpath = "//div[@id='form-contents']//h1")
    public static WebElement umbrellaMessage;
    @FindBy(xpath = "//div[@id='inputcontent']//h1[.='Under Construction']")
    public static WebElement rvMessage;
    @FindBy(xpath = "//div[@id='form-contents']//h1[.='Classic Car Insurance']")
    public static WebElement collectorAutoMessage;
    @FindBy(xpath = "//div[@id='form-contents']//h1")
    public static WebElement mobileHMessage;
    @FindBy(xpath = "/html//label[@id='ContentPlaceHolder1_lblBusinessTypeCustomer']")
    public static WebElement commAutoMessage;

    public String getQuoteWithNoZipP1(WebElement insuranceProduct, WebElement message) {
        insuranceProduct.click();
        getQoute.click();
        String s = message.getText();

        return s;
    }

    public String getQuoteWithNoZipP2(WebElement insuranceProduct, WebElement message) {
        arrow1.click();
        insuranceProduct.click();
        getQoute.click();
        String s = message.getText();

        return s;
    }

    public WebElement moveTomodalforFlood() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("wrapper"))));
        WebElement floddMessage = driver.findElement(By.xpath("/html//div[@id='external_disclaimer_quote_modal']//p[.='You are about to leave geico.com']"));
        return floddMessage;

    }


}

