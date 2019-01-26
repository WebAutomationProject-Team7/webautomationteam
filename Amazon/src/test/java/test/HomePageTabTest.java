package test;

import com.relevantcodes.extentreports.ExtentReports;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
     homePage.isLogoDisplayed();
        boolean actual = isLogoDisplayed();
        boolean expected = true;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void SearchBarDisplayed() {
        homePage.isSearchBarDisplayed();
        boolean actual = isSearchBarDisplayed();
        boolean expected = true;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testDropDownMenu() throws Exception {
        dropDownMenu.click();
        WebElement actual = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='searchDropdownBox']")));
        boolean expected = dropDownMenu.isDisplayed();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testHamburgerMenu() {
        hamburgerMenu.click();
        WebElement actual = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='nav-hamburger-menu']/i")));
        String expected  = "Shop By Category";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void YourAmazonDotNavBarClicked() {
        yourAmazonDotComNavBar.click();
        WebElement actual = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='nav-your-amazon']")));
        String expected = "SignIn";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void TodayDealsNavigation() {
        todayDeals.click();
        WebElement actual = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='nav-xshop']/a[2]")));
        String expected = "Today's Deals";
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void GiftCardsDisplay() {
        giftCards.click();
        WebElement actual = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='nav-xshop']/a[3]")));
        String expected = "GiftCards";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void WholeFoodTab() {
       wholeFoods.click();
        WebElement actual = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='nav-xshop']/a[4]")));
        String expected = "SavingsAreAlwaysInSeason";
         Assert.assertEquals(actual, expected);
    }

    @Test
    public void RegistryDisplay() {
        registry.click();
        WebElement actual = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='nav-xshop']/a[5]")));
        String expected = "RegisterWithAmazon";
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void SellNav() {
        sell.click();
        WebElement actual = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='nav-xshop']/a[6]")));
        String expected = "ReachHundtedsOfMillionsOfCustomers";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void HelpPress() {
        help.click();
        WebElement actual = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='nav-xshop']/a[7]")));
        String expected = "WhatWeCanHelpYouWith?";
        Assert.assertEquals(actual, expected);

    }
}

