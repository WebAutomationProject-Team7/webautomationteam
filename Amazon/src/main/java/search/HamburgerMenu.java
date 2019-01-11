package search;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HamburgerMenu extends CommonApi {
    private static final Object HamburgerMenu = null;
    @FindBy(xpath = "//a[@id='nav-hamburger-menu']")
    public static WebElement hamburgerMenu;

    public HamburgerMenu clickOnHamburgerMenu() throws InterruptedException {
        hamburgerMenu.click();
        wait.until(ExpectedConditions.visibilityOf((WebElement) HamburgerMenu));
        return new HamburgerMenu();

    }

}
