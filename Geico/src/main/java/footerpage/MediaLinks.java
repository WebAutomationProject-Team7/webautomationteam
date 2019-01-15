package footerpage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pagebase.ApplicationPageBase;
public class MediaLinks extends ApplicationPageBase {

    public  String clickOnFacbook() throws InterruptedException {
        String url=getCurrentURLByCssFromNewWindow(".icon-facebook");
        return url;
    }
    public  String clickOnTwitter() throws InterruptedException {
        String url=getCurrentURLByCssFromNewWindow(".icon-twitter ");
        return url;
    }
    public  String clickOnInstagram() throws InterruptedException {
        String url=getCurrentURLByCssFromNewWindow(".icon-instagram ");
        return url;
    }
    public  String clickOnGoogle() throws InterruptedException {
        String url=getCurrentURLByCssFromNewWindow(".icon-google ");
        return url;
    }
    public  String clickOnYouTube() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".icon-youtube ")));
        String url=getCurrentURLByCssFromNewWindow(".icon-youtube ");
        return url;
    }
}
