package autoinsurancequotetest;
import autoinsuranceqoutepage.YourAddressPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
public class YourAddressPageTest extends YourAddressPage {
    YourAddressPage yourAddressPage;
    @BeforeMethod
    public void init(){yourAddressPage= PageFactory.initElements(driver, YourAddressPage.class);
    }
    @Test
    public void testEnterCustomerAddress()  {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(enterCustomerAddress(), "GEICO");
    }
}
