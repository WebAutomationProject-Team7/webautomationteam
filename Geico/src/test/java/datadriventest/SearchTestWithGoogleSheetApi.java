package datadriventest;

import homePage.SearchFunctionality;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class SearchTestWithGoogleSheetApi extends SearchFunctionality {
    SearchFunctionality search=null;
    @BeforeMethod
    public void initialisationOfElements(){
        search = PageFactory.initElements(driver,SearchFunctionality.class);
    }
}
