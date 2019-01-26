package footerpagetest;
import footerpage.WebsiteLinks;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
public class WebsiteLinksTest extends WebsiteLinks {
    WebsiteLinks websiteLinks;

    @BeforeMethod
    public void init() {
        websiteLinks = PageFactory.initElements(driver, WebsiteLinks.class);
    }
    @Test
    public void testClickONPrivacyLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(clickOnPrivacyLink(), "PRIVACY POLICY");
    }
    @Test
    public void testClickONLegal() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(clickOnLegal(), "https://www.geico.com/legal/");
    }
    @Test
    public void testClickONCareer()
    {  TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       Assert.assertEquals(clickONCareer(), "https://www.geico.com/careers/");
    }
    @Test
    public void testClickONContacts(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertTrue(clickOnContact());
    }
    @Test
    public void testClickONSiteMap(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(clickONSiteMap(), "https://www.geico.com/web-and-mobile/sitemap/");
    }
}
