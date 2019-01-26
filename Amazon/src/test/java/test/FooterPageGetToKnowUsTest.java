package test;

import com.relevantcodes.extentreports.ExtentReports;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FooterMakeMoneyWithUs;
import pages.FooterPageGetToKnowUs;
import reporting.ExtentManager;

public class FooterPageGetToKnowUsTest extends FooterPageGetToKnowUs {
    FooterPageGetToKnowUs obj;
    ExtentReports reports;
    @BeforeMethod
    public void setUp(){
            obj = PageFactory.initElements(driver, FooterPageGetToKnowUs.class);}
        //reports = ExtentManager.getInstance();

    @Test
    public void setCareers(){
        Careers.click();
        String expected = "FindJobs";
        Assert.assertTrue(true);
    }
    @Test
    public void BlogDisplay(){
        Blog.click();
        String expected = "DayOne";
        Assert.assertTrue(true);
    }
    @Test
    public void AboutAmazonShow() {
        AboutAmazon.click();
        String expected = "AmazonFulfillment";
        Assert.assertTrue(true);
    }
    @Test
    public void PressCenterDisplay(){
        PressCenter.click();
        String expected = "PressCenter";
        Assert.assertTrue(true);
    }
    @Test
    public void InvestorRelationsPress(){
        InvestorRelations.click();
        String expected = "InvestorRelations";
        Assert.assertTrue(true);
    }
    @Test
    public void AmazonDevicesDisplay(){
        AmazonDevices.click();
        String expected = "AmazonDevices";
        Assert.assertTrue(true);
    }
}
