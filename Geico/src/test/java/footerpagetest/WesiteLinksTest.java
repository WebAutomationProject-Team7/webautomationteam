package footerpagetest;
import footerpage.WebsiteLinks;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WesiteLinksTest extends WebsiteLinks {
    WebsiteLinks websiteLinks;
    @BeforeMethod
    public void init(){websiteLinks= PageFactory.initElements(driver, WebsiteLinks.class);
    }
    @Test
    public static void testClickONPrivacyLink(){
        Assert.assertEquals(clickOnPrivacyLink(), "PRIVACY POLICY");
    }
    @Test
    public static void testClickONLegal(){
        Assert.assertEquals(clickOnLegal(), "https://www.geico.com/legal/");
    }
    @Test
    public  static void testClickONCareer(){
        Assert.assertEquals(clickONCareer(), "https://www.geico.com/careers/");
    }
    @Test
    public  static void testClickONContacts(){
        Assert.assertTrue(clickOnContact());
    }
    @Test
    public  static void testClickONSiteMap(){
        Assert.assertEquals(clickONSiteMap(), "https://www.geico.com/web-and-mobile/sitemap/");
    }
}
