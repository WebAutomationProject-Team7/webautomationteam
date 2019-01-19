package test;

import com.relevantcodes.extentreports.ExtentReports;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FooterMakeMoneyWithUs;
import reporting.ExtentManager;

public class FooterMakeMoneyWithUsTest extends FooterMakeMoneyWithUs {
    FooterMakeMoneyWithUs footerMakeMoneyWithUs;
    ExtentReports reports;


    @BeforeMethod
    public void setUp(){
        this.footerMakeMoneyWithUs = new FooterMakeMoneyWithUs();
        reports = ExtentManager.getInstance();
    }
    @Test
    public String SellOnAmazonDisplay() {
        SellOnAmazon.click();
        String actual = SellOnAmazonDisplay();
        String expected = "SellOnAmazon";
        Assert.assertEquals(actual, expected);
        //Thread.sleep(20000);
        return actual;
    }
    @Test
    public String SellUndersPrivateBrandsShow() {
        SellUnderPrivateBrands.click();
        String actual = SellUndersPrivateBrandsShow();
        String expected = "JoinTheAmazonFamilyOfBrands";
        Assert.assertEquals(actual, expected);
        return actual;
    }
    @Test
    public String SellOnAmazonHandMadeDisplay() {
        SellOnAmazonHandMade.click();
        String actual = SellOnAmazonHandMadeDisplay() ;
        String expected = "SellOnAmazonHandMade";
        Assert.assertEquals(actual, expected);
        return actual;
    }
    @Test
    public String SellYourServicesOnAmazonShow() {
        SellYourServicesOnAmazon.click();
        String actual = SellYourServicesOnAmazonShow() ;
        String expected = "Selling Services";
        Assert.assertEquals(actual, expected);
        return actual;
    }
    @Test
    public String SellOnAmazonBusinessNav() {
        SellOnAmazonBusiness.click();
        String actual = SellOnAmazonBusinessNav() ;
        String expected = "AmazonBusiness";
        Assert.assertEquals(actual, expected);
        return actual;
    }
    @Test
    public String SellYourAppOnAmazonShow()  {
        SellYourAppOnAmazon.click();
        String actual = SellYourAppOnAmazonShow();
        String expected = "AmazonDeveloperServicesAndTechnologies";
        Assert.assertEquals(actual, expected);
        return actual;
    }
    @Test
    public String BecomeAnAffiliateDisplay() {
        BecomeAnAffiliate.click();
        String actual = BecomeAnAffiliateDisplay() ;
        String expected = "ProfitFromOurExperience";
        Assert.assertEquals(actual, expected);
        return actual;
    }
    @Test
    public String AdvertiseYourProductsShow(){
        AdvertiseYourProducts.click();
        String actual =  AdvertiseYourProductsShow();
        String expected = "AdvertiseWithIntent";
        Assert.assertEquals(actual, expected);
        return actual;
    }
    @Test
    public String SelfPublishWithUsDisplay() throws InterruptedException {
        SelfPublishWithUs.click();
        String actual = SelfPublishWithUsDisplay();
        String expected = "SelfPublishWithUs";
        Assert.assertEquals(actual, expected);
        Thread.sleep(20000);
        return actual;
    }

}
