package test;

import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import search.Logo;
import search.SearchBox;

public class TestSearchBox extends CommonApi {
    SearchBox obj;
    @BeforeMethod
    public void init(){
        obj = PageFactory.initElements(driver, SearchBox.class) ;

        }

    @Test
    public void searchItems() throws InterruptedException {
        obj.searchWithArrayList();

    }
    @Test
    public void searchItems1() throws InterruptedException{

    }
}



