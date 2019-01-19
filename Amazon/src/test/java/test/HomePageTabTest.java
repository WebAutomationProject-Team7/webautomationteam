package test;

import com.relevantcodes.extentreports.ExtentReports;
import database.ConnectToSqlDB;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePageTab;
import reporting.ExtentManager;

import java.io.IOException;
import java.sql.SQLException;

public class HomePageTabTest extends HomePageTab {

    HomePageTab homePage;
    ExtentReports reports;

    @BeforeMethod
    public void setUp() {
        this.homePage = new HomePageTab();
        reports = ExtentManager.getInstance();
    }

    @Test
    public void LogoDisplayed() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, IOException {
        ConnectToSqlDB connect = new ConnectToSqlDB();
        connect.connectToSqlDatabase();
        boolean actual = isLogoDisplayed();
        boolean expected = true;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void SearchBarDisplayed() {
        boolean actual = isSearchBarDisplayed();
        boolean expected = isSearchBarDisplayed();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public boolean DropDownMenuClicked() {
        dropDownMenu.click();
        boolean actual = DropDownMenuClicked();
        boolean expected = true;
        Assert.assertEquals(actual, expected);
        return actual;
    }

    @Test
    public String HamburgerMenuClicked() {
        hamburgerMenu.click();
        String actual = HamburgerMenuClicked();
        String expected = "ShopByCategory";
        Assert.assertEquals(actual, expected);
        return actual;
    }

    @Test
    public String YourAmazonDotNavBarClicked() {
        yourAmazonDotComNavBar.click();
        String actual = YourAmazonDotNavBarClicked();
        String expected = "SignIn";
        Assert.assertEquals(actual, expected);
        return actual;
    }

    @Test
    public String TodayDealsNavigation() {
        TodayDeals.click();
        String actual = TodayDealsNavigation();
        String expected = "Today's Deals";
        Assert.assertEquals(actual, expected);
        return actual;
    }

    @Test
    public String GiftCardsDisplay() {
        GiftCards.click();
        String actual = GiftCardsDisplay();
        String expected = "GiftCards";
        Assert.assertEquals(actual, expected);

        return actual;
    }

    @Test
    public String WholeFoodTab() {
        WholeFoods.click();
        String actual = WholeFoodTab();
        String expected = "SavingsAreAlwaysInSeason";
        Assert.assertEquals(actual, expected);
        return actual;
    }

    @Test
    public String RegistryDisplay() {
        Registry.click();
        String actual = RegistryDisplay();
        String expected = "RegisterWithAmazon";
        Assert.assertEquals(actual, expected);
        return actual;
    }

    @Test
    public String SellNav() {
        Sell.click();
        String actual = SellNav();
        String expected = "ReachHundtedsOfMillionsOfCustomers";
        Assert.assertEquals(actual, expected);
        return actual;
    }

    @Test
    public String HelpPress() {
        Help.click();
        String actual = HelpPress();
        String expected = "WhatWeCanHelpYouWith?";
        Assert.assertEquals(actual, expected);

        return actual;
    }
}

