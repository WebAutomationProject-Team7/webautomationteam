package test;

import com.relevantcodes.extentreports.ExtentReports;
import datasource.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FooterMakeMoneyWithUs;
import reporting.ExtentManager;

public class FooterMakeMoneyWithUsTest extends FooterMakeMoneyWithUs {
    FooterMakeMoneyWithUs obj;
    ExtentReports reports;
    @BeforeMethod
    public void setUp(){
        obj = PageFactory.initElements(driver, FooterMakeMoneyWithUs.class);}

    @Test
    public void SellOnAmazonDisplay() {
        SellOnAmazon.click();
        String expected = "SellOnAmazon";
        Assert.assertTrue(true);
        //Thread.sleep(20000);
    }
    @Test
    public void SellUndersPrivateBrandsShow() {
        SellUnderPrivateBrands.click();
        String expected = "JoinTheAmazonFamilyOfBrands";
        Assert.assertTrue(true);
    }
    @Test
    public void SellOnAmazonHandMadeDisplay() {
        SellOnAmazonHandMade.click();
        String expected = "SellOnAmazonHandMade";
        Assert.assertTrue(true);
    }
    @Test
    public void SellYourServicesOnAmazonShow() {
        SellYourServicesOnAmazon.click();
        String expected = "Selling Services";
        Assert.assertTrue(true);
    }
    @Test
    public void SellOnAmazonBusinessNav() {
        SellOnAmazonBusiness.click();
        String expected = "AmazonBusiness";
        Assert.assertTrue(true);
    }
    @Test
    public void SellYourAppOnAmazonShow()  {
        SellYourAppOnAmazon.click();
        String expected = "AmazonDeveloperServicesAndTechnologies";
        Assert.assertTrue(true);

    }
    @Test
    public void BecomeAnAffiliateDisplay() {
        BecomeAnAffiliate.click();
        String expected = "ProfitFromOurExperience";
        Assert.assertTrue(true);
    }
    @Test
    public void AdvertiseYourProductsShow(){
        AdvertiseYourProducts.click();
        String expected = "AdvertiseWithIntent";
        Assert.assertTrue(true);
    }
    @Test
    public void SelfPublishWithUsDisplay() throws InterruptedException {
        SelfPublishWithUs.click();
        String expected = "SelfPublishWithUs";
        Assert.assertTrue(true);
        Thread.sleep(20000);
    }

}
