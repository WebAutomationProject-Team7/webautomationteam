package pages;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.awt.Event.ENTER;

public class HomePageTab extends CommonApi {

    public HomePageTab() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='nav-logo']/a[1]/span[1]")
    public static WebElement homePageLogo;
    public boolean isLogoDisplayed() {
        boolean logoDisplayed = homePageLogo.isDisplayed();
        return logoDisplayed;

    }

    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    public  WebElement homePageSearchBar;
    public boolean isSearchBarDisplayed() {
        boolean searchBarDisplayed = homePageSearchBar.isDisplayed();
        return searchBarDisplayed;
    }

    @FindBy(xpath = "//*[@id='searchDropdownBox']")
    public static WebElement dropDownMenu;
    public void setDropDownMenu(WebElement dropDownMenu) {
        dropDownMenu.click();
       dropDownMenu.getTagName();

    }
    @FindBy(xpath = "//*[@id='nav-hamburger-menu']/i")
    public static WebElement hamburgerMenu;
    public void setHamburgerMenu(WebElement hamburgerMenu){
        hamburgerMenu.click();

    }
    @FindBy(xpath = "//a[@id='nav-your-amazon']")
    public static WebElement yourAmazonDotComNavBar;
    public void setYourAmazonDotComNavBar(WebElement yourAmazonDotComNavBar){
        yourAmazonDotComNavBar.click();
    }
    @FindBy(xpath = "//*[@id='nav-xshop']/a[2]")
    public static WebElement todayDeals;
    public void setTodayDeals(WebElement todayDeals){
        todayDeals.click();

    }
    @FindBy(xpath = "//*[@id='nav-xshop']/a[3]")
    public static WebElement giftCards;
    public void setGiftCards(WebElement giftCards){
        giftCards.click();
    }
    @FindBy(xpath = "//*[@id='nav-xshop']/a[4]")
    public static WebElement wholeFoods;
    public void setWholeFoods(WebElement wholeFoods){
        wholeFoods.click();
    }
    @FindBy(xpath ="//*[@id='nav-xshop']/a[5]")
    public static WebElement registry;
    public void setRegistry(WebElement registry){
        registry.click();
    }
    @FindBy(xpath = "//*[@id='nav-xshop']/a[6]")
    public static WebElement sell;
    public void setSell(WebElement sell){
        sell.click();
    }
    @FindBy(xpath = "//*[@id='nav-xshop']/a[7]")
    public static WebElement help;
    public void setHelp(WebElement help){
        help.click();

    }
}




