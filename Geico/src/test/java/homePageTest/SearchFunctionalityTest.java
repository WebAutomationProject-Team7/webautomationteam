package homePageTest;
import homePage.SearchFunctionality;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import xlsxreader.MyDataReader;

import java.io.File;

public class SearchFunctionalityTest extends SearchFunctionality {
    public String keys = "Property";
    SearchFunctionality search;
    @BeforeMethod
    public void initialisationOfElements(){
        search = PageFactory.initElements(driver,SearchFunctionality.class);
    }

    @Test
    public void testSearchWithEnterKey(){
        Assert.assertEquals("Site Search", searchWithENTER(keys));
         }
     @Test
    public void testSearchWithButton() {
        Assert.assertEquals("Site Search", searchUsingButton(keys));
    }


}
