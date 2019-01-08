package homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pagebase.ApplicationPageBase;
public class LandingPageBasic extends ApplicationPageBase {
    @FindBy(name = "OnlineOpinion1")
    public static WebElement feedbackFrame;
    @FindBy(xpath = "//label[@for='overall_4']")
    public static WebElement verySatisfiedIcon;
    @FindBy(css = "#header-middle-links > a")
    public static WebElement Logo;
    @FindBy(css = "#header-right-links>ul>li>a>span.icon-geolocation")
    public static WebElement locationIcon;
    @FindBy(xpath = "//div[@id='header-right-links']/ul[1]/li[2]/a[@href='#']")
    public static WebElement login;
    @FindBy(css = "#header-right-links > ul > li:nth-child(3) > a > span")
    public static WebElement searchIcon;
    @FindBy(css = "ul.desktop-links > li:nth-child(2)>a")
    public static WebElement informationList;
    @FindBy(css = "#header-left-links > ul> li > a")
    public static WebElement insuranceList;
    @FindBy(xpath = "//div[@data-side-panel='information']")
    public static WebElement infoDiv;
    @FindBy(xpath = "//div[@data-side-panel='insurance']")
    public static WebElement insuranceDiv;
    @FindBy(xpath = "//div[@data-side-panel='login']")
    public static WebElement loginDiv;
    @FindBy(xpath = "//div[@data-side-panel='location']")
    public static WebElement locationDiv;
    @FindBy(xpath = "//div[@data-side-panel='search']")
    public static WebElement searchDiv;
    @FindBy(id="oo_tab")
    public static WebElement feedbackIcon;
    @FindBy (css = ".large_only")
    public static WebElement heroImage;

    public boolean clickOnInsurance() throws InterruptedException {
        insuranceList.click();
        wait.until(ExpectedConditions.visibilityOf(insuranceDiv));
        return insuranceDiv.isDisplayed();
    }
    public boolean clickOnInformation() throws InterruptedException {
        informationList.click();
        wait.until(ExpectedConditions.visibilityOf(infoDiv));
//        Thread.sleep(2000);
        return infoDiv.isDisplayed();
    }
    public String clickOnGeicoLogo() throws InterruptedException{
        Logo.click();
        String Url = driver.getCurrentUrl();
        return Url;
    }
    public boolean clickOnLocationIcon()throws InterruptedException{
        locationIcon.click();
        wait.until(ExpectedConditions.visibilityOf(locationDiv));
       // Thread.sleep(2000);
        return locationDiv.isDisplayed();
    }
    public boolean clickLogin() throws InterruptedException{
        login.click();
        wait.until(ExpectedConditions.visibilityOf(loginDiv));
        //Thread.sleep(2000);
        return loginDiv.isDisplayed();
    }
    public boolean clickOnSearchIcon()throws InterruptedException{
        searchIcon.click();
        wait.until(ExpectedConditions.visibilityOf(searchDiv));

        return searchDiv.isDisplayed();
    }
    public boolean clickOnFeedBackIcon() throws InterruptedException{
        feedbackIcon.click();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(feedbackFrame));
        return verySatisfiedIcon.isDisplayed();
    }
}
