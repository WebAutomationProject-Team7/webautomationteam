package homePageTest;

import homePage.QuotesOnProducts;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class QuotesOnProductsTest extends QuotesOnProducts{
    QuotesOnProducts quotesOnProducts;

    @BeforeMethod
    public void init(){ quotesOnProducts = PageFactory.initElements(driver, QuotesOnProducts.class);
    }
    @Test
    public void getQuoteHomeownersWithNoZip()throws InterruptedException{
        Assert.assertEquals("Please enter valid Zip Code",getQuoteWithNoZipP1(homeOwnersInsIcon,errorMsg));
    }
    @Test
    public void getQuoteRentersWithNoZip()throws InterruptedException{
        Assert.assertEquals("Please enter valid Zip Code",getQuoteWithNoZipP1(rentersInsIcon,errorMsg));
    }
    @Test
    public void getQuoteCondoWithNoZip()throws InterruptedException{
        Assert.assertEquals("Please enter valid Zip Code",getQuoteWithNoZipP1(condoInsIcon,errorMsg));
    }
    @Test//potential bug
    public void getQuoteMotorCycleWithNoZip()throws InterruptedException{
        Assert.assertEquals("Please enter valid Zip Code",getQuoteWithNoZipP1(motorCycleInsIcon,errorMsg));
    }
    @Test
    public void getQuoteBoatWithNoZip()throws InterruptedException{
        Assert.assertEquals("Please enter valid Zip Code",getQuoteWithNoZipP1(boatInsIcon,errorMsg));
    }
    @Test
    public void getQuoteUmbrellaWithNoZip()throws InterruptedException{
        Assert.assertEquals("Don't risk losing everything. Get extra protection from accidents and lawsuits.",getQuoteWithNoZipP1(umbrellaInsIcon,umbrellaMessage));
    }
    @Test
    public void getQuoteRvWithNoZip()throws InterruptedException{
        Assert.assertEquals("Under Construction",getQuoteWithNoZipP1(rvInsIcon,rvMessage));
    }
    @Test
    public void getQuoteCollectorAutoWithNoZip()throws InterruptedException{
        Assert.assertEquals("Classic Car Insurance",getQuoteWithNoZipP2(collectorAutoIcon,collectorAutoMessage));
    }
    @Test
    public void getQuoteMobileHomeWithNoZip()throws InterruptedException{
        Assert.assertEquals("Protect your property with\n" +
                "mobile home insurance.",getQuoteWithNoZipP2(mobileHomeInsIcon,mobileHMessage));
    }
    @Test
    public void getQuoteFloodWithNoZip()throws InterruptedException{
        Assert.assertEquals("",getQuoteWithNoZipP2(floodInsIcon, moveTomodalforFlood()));

    }
    @Test
    public void getQuoteCommAutoWithNoZip()throws InterruptedException{
        Assert.assertEquals("Which of the following best describes your type of business?",getQuoteWithNoZipP2(commercialAutoIcon,commAutoMessage));
    }
}
