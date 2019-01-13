package search;

import base.CommonApi;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class SearchBox extends CommonApi {

    public SearchBox() {
        PageFactory.initElements(driver, this);
    }
    //public static final String CookBooks = null;
    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    WebElement searchEngine;

    public void searchEngine(String SearchKey) {
        wait.until(ExpectedConditions.visibilityOf(searchEngine));
        searchEngine.click();
        searchEngine.sendKeys(SearchKey, Keys.ENTER);
        searchEngine.clear();


    }

    public void searchWithArrayList() {
        List<String> searchitems=new ArrayList<>();
        searchitems.add("car");
        searchitems.add("ball");
        searchitems.add("balloon");
        searchitems.add("chess book");
        searchitems.add("selenium book");
        searchitems.add("roses");
        searchitems.add("clouds");
        searchitems.add("chocolates");
        for(String key:searchitems){
            searchEngine(key);
        }
    }
}

