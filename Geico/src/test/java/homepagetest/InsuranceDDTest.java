package homepagetest;
import homepage.InsuranceDD;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class InsuranceDDTest extends InsuranceDD {
    InsuranceDD insuranceDD;
    @BeforeMethod
    public void init(){
        insuranceDD = PageFactory.initElements(driver, InsuranceDD.class);
    }
    @Test
    public void testInformationMenuItems() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String s = String.join(", ",getInsuranceMenuList());
        Assert.assertEquals(s,"Vehicle Insurance, Property Insurance, Business Insurance, Additional Insurance");
    }

}
