package datadriventest;
import homePage.SearchFunctionality;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;
public class SearchTestWithEnterFromDatabase extends SearchFunctionality {
    SearchFunctionality search ;
    @BeforeMethod
    public void initialisationOfElements() {
        search = PageFactory.initElements(driver, SearchFunctionality.class);
    }
    @Test
    public void testSearchWithEnterfromDatabase() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> expectedMessage=new ArrayList<>();
        expectedMessage.add("Site Search");
        expectedMessage.add("Site Search");
        expectedMessage.add("Site Search");
        expectedMessage.add("Site Search");
        Assert.assertEquals( search.searchfromdatabase(),expectedMessage);
    }
    @Test
    public void negetivetestSearchWithEnterfromDatabase() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> expectedMessage=new ArrayList<>();
        expectedMessage.add("Site Search.");
        expectedMessage.add("Site Search.");
        expectedMessage.add("Site Search.");
        expectedMessage.add("Site Search.");
        Assert.assertEquals(search.searchfromdatabase(), expectedMessage);
    }
}