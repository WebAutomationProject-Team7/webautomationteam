package pages;

import base.CommonApi;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class HomePageSearchBox extends CommonApi {
    public HomePageSearchBox() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    public static WebElement SearchBox;
    public void SearchBox(String SendKeys) {
        wait.until(ExpectedConditions.visibilityOf(SearchBox));
        SearchBox.click();
        SearchBox.sendKeys(SendKeys, Keys.ENTER);
        SearchBox.clear();
    }

    public void searhWithArrayList() {
        List<String> searchItems = new ArrayList<>();
        searchItems.add("Alexa Skills");
        searchItems.add("Amazon Devices");
        searchItems.add("Amazon Fresh");
        searchItems.add("Amazon Warehouse");
        searchItems.add("Appliances");
        searchItems.add("Apps&Games");
        searchItems.add("Arts&Crafts&Sewing");
        searchItems.add("AutomotiveParts&Accessories");
        searchItems.add("Baby");
        searchItems.add("Beauty&PersonalCare");
        searchItems.add("Books");
        searchItems.add("CD&Vinyl");
        searchItems.add("CellPhones&Jewelry");
        searchItems.add("Women");
        searchItems.add("Men");
        searchItems.add("Girls");
        searchItems.add("Boys");
        searchItems.add("Baby");
        searchItems.add("Collectibles&FineArt");
        searchItems.add("Computers");
        searchItems.add("Courses");
        searchItems.add("Credit&PaymentCards");
        searchItems.add("DigitalMusic");
        searchItems.add("Electronics");
        searchItems.add("Garden&Outdoor");
        searchItems.add("GiftCards");
        for (String key:searchItems) {
           SearchBox(key);

        }
    }
}

