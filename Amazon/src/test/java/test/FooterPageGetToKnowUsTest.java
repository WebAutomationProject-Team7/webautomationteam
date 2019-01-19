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
    public String setCareers(){
        Careers.click();
        String actual = setCareers();
        String expected = "FindJobs";
        Assert.assertEquals(actual, expected);
        return actual;
    }
    @Test
    public String BlogDisplay(){
        Blog.click();
        String actual = BlogDisplay();
        String expected = "DayOne";
        Assert.assertEquals(actual, expected);

        return actual;
    }
    @Test
    public String AboutAmazonShow(){
        AboutAmazon.click();
        String actual = AboutAmazonShow();
        String expected = "AmazonFulfillment";
        Assert.assertEquals(actual, expected);
        return actual;
    }
    @Test
    public String PressCenterDisplay(){
        PressCenter.click();
        String actual = PressCenterDisplay();
        String expected = "PressCenter";
        Assert.assertEquals(actual, expected);
        return actual;
    }
    @Test
    public String InvestorRelationsPress(){
        InvestorRelations.click();
        String actual = InvestorRelationsPress();
        String expected = "InvestorRelations";
        return actual;
    }
    @Test
    public String AmazonDevicesDisplay(){
        AmazonDevices.click();
        String actual = AmazonDevicesDisplay();
        String expected = "AmazonDevices";
        return actual;
    }
}
