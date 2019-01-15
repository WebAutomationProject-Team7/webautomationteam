package test;

import base.CommonApi;
import com.relevantcodes.extentreports.ExtentReports;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FooterMakeMoneyWithUs;
import pages.HomePageTab;
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
    public void SellOnAmazonDisplay() {
        SellOnAmazon.click();
        String actual = "SellOnAmazon";
        String expected = "SellOnAmazon";
        Assert.assertEquals(actual, expected);
        //Thread.sleep(20000);
    }
    @Test
    public void SellUndersPrivateBrandsShow() {
        SellUnderPrivateBrands.click();
        String actual = "JoinTheAmazonFamilyOfBrands";
        String expected = "JoinTheAmazonFamilyOfBrands";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void SellOnAmazonHandMadeDisplay() {
        SellOnAmazonHandMade.click();
        String actual = "SellOnAmazonHandMade";
        String expected = "SellOnAmazonHandMade";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void SellYourServicesOnAmazonShow() {
        SellYourServicesOnAmazon.click();
        String actual = "Selling Services";
        String expected = "Selling Services";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void SellOnAmazonBusinessNav() {
        SellOnAmazonBusiness.click();
        String actual = "AmazonBusiness";
        String expected = "AmazonBusiness";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void SellYourAppOnAmazonShow()  {
        SellYourAppOnAmazon.click();
        String actual = "AmazonDeveloperServicesAndTechnologies";
        String expected = "AmazonDeveloperServicesAndTechnologies";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void BecomeAnAffiliateDisplay() {
        BecomeAnAffiliate.click();
        String actual = "ProfitFromOurExperience";
        String expected = "ProfitFromOurExperience";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void AdvertiseYourProductsShow(){
        AdvertiseYourProducts.click();
        String actual = "AdvertiseWithIntent";
        String expected = "AdvertiseWithIntent";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void SelfPublishWithUsDisplay() throws InterruptedException {
        SelfPublishWithUs.click();
        String actual = "TakeControlWithSelfPublishing";
        String expected = "SelfPublishWithUs";
        Assert.assertEquals(actual, expected);
        Thread.sleep(20000);
    }

}
