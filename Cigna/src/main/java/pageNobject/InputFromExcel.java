package pageNobject;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class InputFromExcel extends CommonApi {

    @FindBy(xpath = ".//*[@id='csng-search-header']/search-header-bar/form/cigna-typeahead/div/input")
    public static WebElement searchBox;
    @FindBy(css = ".csng-search-key>strong")
    public static WebElement resultText;

}


