package test;

import datasource.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePageTab;

import java.util.ArrayList;
import java.util.List;

public class DropDownMenuTest extends HomePageTab {
    HomePageTab obj;

    @BeforeMethod
    public void initialisationOfElements() {
        obj = PageFactory.initElements(driver, HomePageTab.class);
    }

    @Test
    public void DropDownMenuClicked() {
        dropDownMenu.click();
        //WebElement actual = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='searchDropdownBox']")));
        boolean expected = true;
        Assert.assertTrue(true);
    }
    @Test
    public void testDropDownMenu() throws Exception {
        List<String> expectedMessage = new ArrayList<>();
        expectedMessage.add("Movies");
        expectedMessage.add("All Departments");
        expectedMessage.add("Alexa Skills");
        expectedMessage.add("Amazon Devices");
        expectedMessage.add("Amazon Fresh");
        expectedMessage.add("Amazon Warehouse");
        expectedMessage.add("Appliances");

         obj.dropDownMenu.getTagName();
    }
}



