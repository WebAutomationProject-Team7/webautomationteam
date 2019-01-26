package footerpage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pagebase.ApplicationPageBase;
import reporting.TestLogger;
public class MediaLinks extends ApplicationPageBase {

    public  String clickOnFacbook() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String url=getCurrentURLByCssFromNewWindow(".icon-facebook");
        return url;
    }
    public  String clickOnTwitter() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String url=getCurrentURLByCssFromNewWindow(".icon-twitter ");
        return url;
    }
    public  String clickOnInstagram() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String url=getCurrentURLByCssFromNewWindow(".icon-instagram ");
        return url;
    }
    public  String clickOnGoogle() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String url=getCurrentURLByCssFromNewWindow(".icon-google ");
        return url;
    }
    public  String clickOnYouTube() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".icon-youtube ")));
        String url=getCurrentURLByCssFromNewWindow(".icon-youtube ");
        return url;
    }
}
