package homePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pagebase.ApplicationPageBase;
public class SearchFunctionality extends ApplicationPageBase {
    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[6]/form/input")
    public static WebElement searchTextBox;
    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[6]/form/button")
    public static WebElement searchSubmitButton;
    @FindBy(xpath = "//a[@class='search']")
    public static WebElement searchIcon;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/h1[1]")
    public static WebElement searchResultHeadline;
    public   void waitToBeVisible(){
        searchIcon.click();
        wait.until(ExpectedConditions.visibilityOf(searchTextBox));
    }
    public String searchWithENTER(String searchKeys){
        waitToBeVisible();
        clearField(searchTextBox);
        searchTextBox.sendKeys(searchKeys, Keys.ENTER);
        return searchResultHeadline.getText();

    }
    public String searchUsingButton(String searchKeys){
        waitToBeVisible();
        clearField(searchTextBox);
        searchTextBox.sendKeys(searchKeys);
        searchSubmitButton.click();
        return searchResultHeadline.getText();
    }

}
