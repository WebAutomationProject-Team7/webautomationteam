package homeownersinsurancequotepage;
import homepage.QuotesOnProducts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import reporting.TestLogger;

public class CustomerInformationPage extends QuotesOnProducts {
    QuotesOnProducts quotesOnProducts;
    @BeforeMethod
    public void init(){
        quotesOnProducts= PageFactory.initElements(driver,QuotesOnProducts.class);
    }
    @FindBy(xpath = "//label[@for='CustomerInformationViewData_CD004aMovedRecently_True']")
    public static WebElement radioButton2Yes;
    @FindBy(id = "CD005PriorAddressStreet")
    public static WebElement div1;
    @FindBy(id = "CD006PriorAddressZip")
    public static WebElement div2;
    @FindBy(id = "CD007PriorAddressCity")
    public static WebElement div3;
    @FindBy(id = "CD008PriorAddressState")
    public static WebElement div4;
    @FindBy(name = "submitButton")
    public static WebElement continueButton;
    @FindBy(xpath = "//a[@data-tooltip-view='HelpText-NIP013PIPropertyStreetAddress']")
    public static WebElement streetTip;
    @FindBy(xpath = "//div[@id='HelpText-NIP013PIPropertyStreetAddress']//div[@id='HelpTextDiv']/p")
    public static WebElement streetTipText;
    @FindBy(xpath = "//a[@data-tooltip-view='HelpText-CD010HomesitePolicyEffectiveDate']")
    public static WebElement coverageDateTip;
    @FindBy(xpath = "//div[@id='HelpText-CD010HomesitePolicyEffectiveDate']//div[@id='HelpTextDiv']/p")
    public static WebElement coverageDateTipText;
    @FindBy(xpath = "//a[@data-tooltip-view='HelpText-CD003DateOfBirth']")
    public static WebElement dateOfBirthTip;
    @FindBy(xpath = "//div[@id='HelpText-CD003DateOfBirth']//div[@id='HelpTextDiv']/p")
    public static WebElement dateOfBirthTipText;
    public void clickRadioButton(){
        radioButton2Yes.click();
    }
    public void clickOnHomeOwnersInsurance() throws InterruptedException {
        homeOwnersInsIcon.click();
        sendZipCodeKeys("11435");
    }
    public String clickToolTip(WebElement toolKit, WebElement toolKitText ) throws InterruptedException {
        clickOnHomeOwnersInsurance();
        toolKit.click();
        waitToBeVisible(toolKitText);
        return toolKitText.getText();
    }
    public boolean isDivVisible(WebElement element) throws InterruptedException {
        clickOnHomeOwnersInsurance();
        clickRadioButton();
        waitToBeVisible(element);
        return element.isDisplayed();
    }
}
