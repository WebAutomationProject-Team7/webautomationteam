package footerpagetest;
import footerpage.MediaLinks;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class MediaLinksTest extends MediaLinks {
    MediaLinks mediaLinks;
    @BeforeMethod
    public void init(){
        mediaLinks= PageFactory.initElements(driver,MediaLinks.class);
    }
    @Test
    public  void testFacebookLink() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String  actual=clickOnFacbook();
        Assert.assertEquals(actual,"https://www.facebook.com/geico");
    }
    @Test
    public  void testTwitterLink() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String  actual=clickOnTwitter();
        Assert.assertEquals(actual,"https://twitter.com/geico");
    }
    @Test
    public  void testInstagramLink() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String  actual=clickOnInstagram();
        Assert.assertEquals(actual,"https://www.instagram.com/geico/");
    }
    @Test
    public  void testGoogleLink() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String  actual=clickOnGoogle();
        Assert.assertEquals(actual,"https://plus.google.com/+geico");
    }
    @Test
    public  void testYouTubeLink() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String  actual=clickOnYouTube();
        Assert.assertEquals(actual,"https://www.youtube.com/user/GEICO");
    }
}
