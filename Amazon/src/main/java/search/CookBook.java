package search;

import base.CommonApi;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CookBook extends CommonApi {
    public CookBook(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    WebElement searchEngine;


    public void searchEngine(String SearchKey) {
        wait.until(ExpectedConditions.visibilityOf(searchEngine));
        searchEngine.click();
        searchEngine.sendKeys(SearchKey, Keys.ENTER);
        searchEngine.clear();


    }
    public void cookBookClicked() {
    searchEngine.sendKeys("cookbook");



    }
}
