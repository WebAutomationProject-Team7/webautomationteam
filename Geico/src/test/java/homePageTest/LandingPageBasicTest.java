package homePageTest;
import homePage.LandingPageBasic;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class LandingPageBasicTest extends LandingPageBasic {
    LandingPageBasic landingPageBasic;
    @BeforeMethod
    public void init(){
        landingPageBasic = PageFactory.initElements(driver, LandingPageBasic.class);
    }
    @Test
    public void testClickInsurance() throws InterruptedException {
        Assert.assertEquals(true,clickOnInsurance());
    }
    @Test
    public void testClickInformation() throws InterruptedException {
        Assert.assertEquals(true,clickOnInformation());
    }
    @Test
    public void testClickLocation()throws InterruptedException {
        Assert.assertEquals(true,clickOnLocationIcon());
    }
    @Test
    public void testClickLogin()throws InterruptedException{
        Assert.assertTrue(clickLogin());
    }
    @Test
    public void testClickSearchIcon()throws InterruptedException{
        Assert.assertEquals(true,clickOnSearchIcon());
    }
    @Test
    public void testClickOnGeicoLogo()throws InterruptedException{
        Assert.assertEquals("https://www.geico.com/",clickOnGeicoLogo());
    }
    @Test
    public void clickOnFeedbackIcon()throws  InterruptedException{
        Assert.assertEquals(true , clickOnFeedBackIcon() );
        System.out.println();
    }
}
