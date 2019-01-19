package homeownersinsurancequotetest;
import homeownersinsurancequotepage.CustomerInformationPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerInformationPageTest extends CustomerInformationPage {
    CustomerInformationPage cus;
    @BeforeMethod
    public void init(){
        cus= PageFactory.initElements(driver, CustomerInformationPage.class);
    }
    @Test
    public void testStreetTipText() throws InterruptedException {
        Assert.assertEquals(clickToolTip(streetTip,streetTipText),"This is the actual address of the home, apartment or condo where you reside, and that you desire to insure.");
    }
    @Test
    public void testCoverageDateTipText()throws InterruptedException{
        Assert.assertEquals(clickToolTip(coverageDateTip,coverageDateTipText),"The effective date of your policy can range from 1-59 days in the future. This is the date your coverage will begin.");
    }
    @Test
    public void testDOB() throws InterruptedException {
        System.out.println(clickToolTip(dateOfBirthTip,dateOfBirthTipText));
    }
    @Test
    public void isDivOneVisible() throws InterruptedException {
        Assert.assertEquals(isDivVisible(div1),true);
    }
    @Test
    public void isDivTwoVisible() throws InterruptedException {
        Assert.assertEquals(isDivVisible(div2),true);
    }
    @Test
    public void isDivThreeVisible() throws InterruptedException {
        Assert.assertEquals(isDivVisible(div3),true);
    }
    @Test
    public void isDivFourVisible() throws InterruptedException {
        Assert.assertEquals(isDivVisible(div4),true);
    }
}
