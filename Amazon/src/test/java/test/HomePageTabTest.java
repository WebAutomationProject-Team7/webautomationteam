package test;

import com.relevantcodes.extentreports.ExtentReports;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import reporting.ExtentManager;

public class HomePageTabTest extends HomePage {
    HomePage homePage;
    ExtentReports reports;
    @BeforeMethod
    public void setUp(){
        this.homePage = new HomePage();
        reports = ExtentManager.getInstance();
    }
    @Test
    public void LogoDisplayed(){
        boolean actual = isLogoDisplayed();
        boolean expected = true;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void SearchBarDisplayed(){
        boolean actual = isSearchBarDisplayed();
        boolean expected = isSearchBarDisplayed();
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void DropDownMenuClicked(){
        dropDownMenu.click();
        boolean actual = true;
        boolean expected = true;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void HamburgerMenuClicked(){
        hamburgerMenu.click();
        String actual = "ShopByCategory";
        String expected = "ShopByCategory";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void YourAmazonDotNavBarClicked(){
        yourAmazonDotComNavBar.click();
        String actual = "SignIn";
        String expected = "SignIn";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TodayDealsNavigation(){
        TodayDeals.click();
        String actual = "Today's Deals";
        String expected = "Today's Deals";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void GiftCardsDisplay(){
        GiftCards.click();
        String actual = "GiftCards";
        String expected = "GiftCards";
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void WholeFoodTab(){
        WholeFoods.click();
        String actual = "SavingsAreAlwaysInSeason";
        String expected = "SavingsAreAlwaysInSeason";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void RegistryDisplay(){
        Registry.click();
        String actual = "RegisterWithAmazon";
        String expected = "RegisterWithAmazon";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void SellNav(){
        Sell.click();
        String actual = "ReachHundtedsOfMillionsOfCustomers";
        String expected = "ReachHundtedsOfMillionsOfCustomers";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void HelpPress(){
        Help.click();
        String actual = "WhatWeCanHelpYouWith?";
        String expected = "WhatWeCanHelpYouWith?";
        Assert.assertEquals(actual, expected);

    }
}
