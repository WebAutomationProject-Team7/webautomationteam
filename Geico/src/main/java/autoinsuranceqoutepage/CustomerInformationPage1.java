package autoinsuranceqoutepage;
import homePage.QuotesOnProducts;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;

public class CustomerInformationPage1 extends QuotesOnProducts {
    QuotesOnProducts quotesOnProducts;
    @BeforeMethod
    public void init(){
        quotesOnProducts=PageFactory.initElements(driver,QuotesOnProducts.class);
    }
    @FindBy(css = ".skip-collect-intent.link--primary")
    public static WebElement skipButton;
    @FindBy(id = "firstName")
    public static WebElement firstName;
    @FindBy(id = "lastName")
    public static WebElement lastName;
    @FindBy(xpath = "//button[contains(text(),'Next')]")
    public static WebElement submit;
    public  void getInformationPage1QuoteWithZipCode()  {
        autoInsIcon.click();
        zipCodeTextBox.sendKeys("11432");
        getQoute.click();
    }
    public void clickSkip(){
        waitToBeVisible(skipButton);
        skipButton.click();
    }
    public String enterCustomerName(){
        getInformationPage1QuoteWithZipCode();
        clickSkip();
       firstName.sendKeys("Arif");
       lastName.sendKeys("Mahmud",Keys.ENTER);
       //wait.until(ExpectedConditions.elementToBeClickable(submit)).click();
       String title=driver.getTitle();
       return title;
    }
}
