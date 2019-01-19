package homepagetest;

import homepage.SearchFunctionality;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SearchFunctionalityTest extends SearchFunctionality {
    public String keys = "Property";
    SearchFunctionality search;

    @BeforeMethod
    public void initialisationOfElements() {
        search = PageFactory.initElements(driver, SearchFunctionality.class);
    }
    @Test
    public void testSearchWithEnterKey() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(searchWithENTER(keys), "Site Search");
    }
    @Test
    public void testSearchWithButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(searchUsingButton(keys), "Site Search");
    }


}
