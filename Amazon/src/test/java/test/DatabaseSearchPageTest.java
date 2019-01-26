package test;

import datasource.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DatabaseSearchPageTest extends SearchPage {
    SearchPage obj;
    @BeforeMethod
    public void initialisationOfElements() {
        obj = PageFactory.initElements(driver,SearchPage.class);}

    @Test
    public void testSearchWithENTERfromDatabase() throws Exception{
        List<String> expectedMessage = new ArrayList<>();
        expectedMessage.add("Customers ultimately bought");
        expectedMessage.add("Beverages: Bottled Beverages, Water & Drink");
        expectedMessage.add("Sunglasses");
        expectedMessage.add("Movies");
        expectedMessage.add("Discover all things Alexa can do for you");
        expectedMessage.add("Speaker");
        expectedMessage.add("Orange");

        obj.searchFromDatabase();

        //Assert.assertEquals( obj.searchFromDatabase(),expectedMessage);
    }
}

