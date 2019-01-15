package homePageTest;
import homePage.YourPolicyDD;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class YourPolicyDDTest extends YourPolicyDD {
    YourPolicyDD yourPolicyDD;
    @BeforeMethod
    public void init(){
        yourPolicyDD = PageFactory.initElements(driver,YourPolicyDD.class);
    }
    @Test
    public void displayItemfromYourPolicyDD(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String s = String.join(",",policyMenuList());
        System.out.println(s);
        Assert.assertEquals("Auto,Motorcycle,ATV,Homeowners,Renters,Condo,Mobile Home,Boat/PWC,RV,Life,Umbrella,Identity Protection,Landlord,Flood,Travel,Overseas,Business Owners,General Liability,Professional Liability,Workers' Compensation,Commercial Auto,Rideshare,Collector Auto,Pet,Jewelry,Mexico Auto",s);

    }
}
