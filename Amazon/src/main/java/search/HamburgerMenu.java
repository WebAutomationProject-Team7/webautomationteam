package search;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HamburgerMenu extends CommonApi {

    @FindBy(xpath = "//a[@id='nav-hamburger-menu']")
    public static WebElement hamburgerMenu;

    public String clickOnHamburgerMenu()  {
        hamburgerMenu.click();
        String url = driver.getCurrentUrl();
        return url;

    }

    public void HamburgerMenuClicked() {


    }
}
