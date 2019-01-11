package pageNobject;

import base.CommonApi;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class OwnPage extends CommonApi {
    public OwnPage(){
        PageFactory.initElements (driver,this);
    }
    @FindBy(css = "#includes-content > div.d-none.d-lg-block > nav:nth-child(2) > div > a > svg")
    WebElement logo;


    @FindBy(xpath = "//div[@id='includes-content']/div[1]/nav[1]/div/ul/li[2]/a")
    public WebElement  contactUs;
    @FindBy(xpath = "//*[@id='1438512008499']/div/div[4]/div/nav[1]/div/ul[2]/li[2]/a")
    public WebElement aboutUs;
    @FindBy(css = "#includes-content > div.d-none.d-lg-block > nav.navbar.global-nav.universal-navigation.navbar-expand-lg.navbar-white.bg-white.pt-lg-0 > div > ul > li:nth-child(1) > a")
    public WebElement cignaInternationnal;
    @FindBy(xpath = "//*[@id='oo_no_thanks']")//*[@id="oo_no_thanks"]
    WebElement noThanks;
    @FindBy(css = "#includes-content > div.d-none.d-lg-block > nav:nth-child(2) > div > ul > li:nth-child(2) > a")
    WebElement logintomyCigna;


    public String checkContactUs() {
        contactUs.click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
    public String cignaInternational() {
        cignaInternationnal.click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
    public boolean logoDisplayed(){
        boolean logoDisplayed = logo.isDisplayed();
        return logoDisplayed;
    }
    public String loginUrl() throws InterruptedException {
        logintomyCigna.click ();
        Thread.sleep (2000);
        System.out.println (driver.getTitle ());
        for(String loginTab:driver.getWindowHandles ()){
            driver.switchTo ().window (loginTab);
        }
        System.out.println (driver.getTitle ());
        String url = driver.getCurrentUrl ();
        return url;
    }
    public String contactUs(){
        String text = contactUs.getText();
        System.out.println(contactUs.getText());
        return text;
    }




}


