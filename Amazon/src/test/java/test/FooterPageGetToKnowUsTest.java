package test;

import com.relevantcodes.extentreports.ExtentReports;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FooterPageGetToKnowUs;
import reporting.ExtentManager;

public class FooterPageGetToKnowUsTest extends FooterPageGetToKnowUs {
    FooterPageGetToKnowUs footerPage;
    ExtentReports reports;
    @BeforeMethod
    public void setUp(){
        this.footerPage = new FooterPageGetToKnowUs();
        reports = ExtentManager.getInstance();
    }
    @Test
    public void setCareers(){
        Careers.click();
        String actual = "FindJobs";
        String expected = "FindJobs";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void BlogDisplay(){
        Blog.click();
        String actual = "DayOne";
        String expected = "DayOne";
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void AboutAmazonShow(){
        AboutAmazon.click();
        String actual = "AmazonFulfillment";
        String expected = "AmazonFulfillment";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void PressCenterDisplay(){
        PressCenter.click();
        String actual = "PressCenter";
        String expected = "PressCenter";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void InvestorRelationsPress(){
        InvestorRelations.click();
        String actual = "InvestorRelations";
        String expected = "InvestorRelations";
    }
    @Test
    public void AmazonDevicesDisplay(){
        AmazonDevices.click();
        String actual = "AmazonDevices";
        String expected = "AmazonDevices";
    }
}
