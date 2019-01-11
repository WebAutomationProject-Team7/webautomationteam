package TestCase;

import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageNobject.OwnPage;
import pageNobject.SignInPage;

public class TestOwnPage extends CommonApi {

    OwnPage ownPage;
    SignInPage signInPage;

    @BeforeMethod
    public void initilizationOfObject() {
       ownPage = PageFactory.initElements(driver,OwnPage.class);
       signInPage = PageFactory.initElements(driver, SignInPage.class);
    }


     @Test
   public void contactUsButton(){
        String actual= ownPage.checkContactUs();
       String expect= "https://www.cigna.com/about-us/contact-us/";
         Assert.assertEquals(actual,expect);
     }

    @Test
    public void cignaInternational(){
        String actual = ownPage.cignaInternational();
        String expect = "https://www.cigna.com/international/";
        Assert.assertEquals(actual,expect);
    }
        @Test
        public void logoDisplayed(){
        boolean actual = ownPage.logoDisplayed();
        Assert.assertTrue(actual);
    }
    @Test
    public void yTubeLinkTest() throws InterruptedException {
        String actual = ownPage.loginUrl();
        String expected = "https://my.cigna.com/web/public/guest";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void contactUs(){
        String actual = ownPage.contactUs();
        String expect = "Contact Us";
        Assert.assertEquals(actual,expect);

    }

    @Test

    public void checkIndividualFamilies(){
        String actual=ownPage.checkIndividualFamilies();
        String expect ="https://www.cigna.com/individuals-families/";
        Assert.assertEquals(actual,expect);
    }

    @Test
    public void checkEmployeeNbroker(){
        String actual = ownPage.checkEmployerNbrokers();
        String expect = "https://www.cigna.com/employers-brokers/";
        Assert.assertEquals(actual,expect);
    }

    @Test
    public void checkHealthCareProviders(){
        String actual = ownPage.checkHealthCareProvider();
        String expect = "https://www.cigna.com/health-care-providers/";
        Assert.assertEquals(actual,expect);
    }

}

