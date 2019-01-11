package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import search.HamburgerMenu;

public class TestHamburgerMenu extends HamburgerMenu {
    HamburgerMenu obj;
    @BeforeMethod
    public void init(){
        obj= PageFactory.initElements(driver,HamburgerMenu.class);
    }
    @Test
    public void clickHamburgerMenuTest()  {
        clickHamburgerMenu();
        //Thread.sleep(20000);

    }

    private void clickHamburgerMenu() {
    }
}
