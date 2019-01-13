package test;

import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import search.CookBook;
import search.SearchBox;

public class TestCookBook extends CommonApi {
    CookBook obj;

    @BeforeMethod

    public void init() {
        obj = PageFactory.initElements(driver, CookBook.class);

    }

    @Test
    public void testCookBook() throws InterruptedException {
        obj.cookBookClicked();

    }
}
