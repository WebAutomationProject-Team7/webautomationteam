package autoinsurancequotetest;
import autoinsuranceqoutepage.YourInfoPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class YourInfoPageTest extends YourInfoPage {
    YourInfoPage customerInformationPage1;
    @BeforeMethod
    public void init(){customerInformationPage1= PageFactory.initElements(driver, YourInfoPage.class);
    }
    @Test
    public void testEnterCustomerName()  {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(enterCustomerName("arif", "mahmud"), "GEICO");
    }
    @Test
    public void testEnterCustomerNameWithEmptySpace()  {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(enterCustomerNameWithEmptySpace(), "Enter your First Name.");
    }
    @Test
    public void testEnterCustomerDOB()  {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(enterCustomerDOB(), "GEICO");
    }
    @Test
    public void testEnterCustomerAddress()  {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(enterCustomerAddress(), "GEICO");
    }

}
