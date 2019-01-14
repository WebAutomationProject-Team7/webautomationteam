package pages;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonApi {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='nav-logo']/a[1]/span[1]")
    public static WebElement homePageLogo;

    public boolean isLogoDisplayed() {
        boolean logoDisplayed = homePageLogo.isDisplayed();
        return logoDisplayed;

    }

    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    public static WebElement homePageSearchBar;

    public boolean isSearchBarDisplayed() {
        boolean searchBarDisplayed = homePageSearchBar.isDisplayed();
        return searchBarDisplayed;
    }

    @FindBy(xpath = "//select[@id='searchDropdownBox']")
    public static WebElement dropDownMenu;

    public static void setDropDownMenu(WebElement dropDownMenu) {
        HomePage.dropDownMenu = dropDownMenu;
        dropDownMenu.click();
    }
    @FindBy(xpath = "//a[@id='nav-hamburger-menu']")
    public static WebElement hamburgerMenu;

    public static void setHamburgerMenu(WebElement hamburgerMenu){
        HomePage.hamburgerMenu = hamburgerMenu;
        hamburgerMenu.click();

    }
    @FindBy(xpath = "//a[@id='nav-your-amazon']")
    public static WebElement yourAmazonDotComNavBar;

    public static void setYourAmazonDotComNavBar(WebElement yourAmazonDotComNavBar){
        HomePage.yourAmazonDotComNavBar = yourAmazonDotComNavBar;
        yourAmazonDotComNavBar.click();
    }
    @FindBy(xpath = "//*[@id='nav-xshop']/a[2]")
    public static WebElement TodayDeals;

    public static void setTodayDeals(WebElement TodayDeals){
        HomePage.TodayDeals = TodayDeals;
        TodayDeals.click();

    }
    @FindBy(xpath = "//*[@id='nav-xshop']/a[3]")
    public static WebElement GiftCards;

    public static void setGiftCards(WebElement GiftCards){
        HomePage.GiftCards = GiftCards;
        GiftCards.click();
    }
    @FindBy(xpath = "//*[@id='nav-xshop']/a[4]")
    public static WebElement WholeFoods;

    public static void setWholeFoods(WebElement WholeFoods){
        HomePage.WholeFoods = WholeFoods;
        WholeFoods.click();
    }
    @FindBy(xpath ="//*[@id='nav-xshop']/a[5]")
    public static WebElement Registry;

    public static void setRegistry(WebElement Registry){
        HomePage.Registry = Registry;
        Registry.click();
    }
    @FindBy(xpath = "//*[@id='nav-xshop']/a[6]")
    public static WebElement Sell;

    public void setSell(WebElement Sell){
        HomePage.Sell = Sell;
        Sell.click();
    }
    @FindBy(xpath = "//*[@id='nav-xshop']/a[7]")
    public static WebElement Help;

    public void setHelp(WebElement Help){
        HomePage.Help = Help;
        Help.click();

    }


}




