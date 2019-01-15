package autoinsurancequotetest;

import autoinsuranceqoutepage.CustomerInformationPage1;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerInformationPage1Test extends CustomerInformationPage1 {
    CustomerInformationPage1 customerInformationPage1;
    @BeforeMethod
    public void init(){customerInformationPage1= PageFactory.initElements(driver, CustomerInformationPage1.class);
    }
    @Test
    public void testEnterCustomerName()  {
        enterCustomerName();
        Assert.assertEquals(enterCustomerName(), "Geico");
    }
}
