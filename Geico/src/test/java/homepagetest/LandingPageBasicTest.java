package homepagetest;
import homepage.LandingPageBasic;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class LandingPageBasicTest extends LandingPageBasic {
    LandingPageBasic landingPageBasic;
    @BeforeMethod
    public void init(){
        landingPageBasic = PageFactory.initElements(driver, LandingPageBasic.class);
    }
    @Test
    public void testClickInsurance() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(clickOnInsurance(),true);
    }
    @Test
    public void testClickInformation() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(clickOnInformation(),true);
    }
    @Test
    public void testClickLocation()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(clickOnLocationIcon(),true);
    }
    @Test
    public void testClickLogin()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertTrue(clickLogin());
    }
    @Test
    public void testClickSearchIcon()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(clickOnSearchIcon(),true);
    }
    @Test
    public void testClickOnGeicoLogo()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(clickOnGeicoLogo(),"https://www.geico.com/");
    }
    @Test
    public void clickOnFeedbackIcon()throws  InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(clickOnFeedBackIcon(),true  );
        System.out.println();
    }
}
