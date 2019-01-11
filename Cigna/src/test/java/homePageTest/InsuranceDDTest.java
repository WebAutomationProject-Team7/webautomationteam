package homePageTest;
import homePage.InsuranceDD;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InsuranceDDTest extends InsuranceDD {
    InsuranceDD insuranceDD;
    @BeforeMethod
    public void init(){
        insuranceDD = PageFactory.initElements(driver, InsuranceDD.class);
    }
    @Test
    public void testInformationMenuItems() {
        String s = String.join(", ",getInsuranceMenuList());
        System.out.println(s);
        Assert.assertEquals("Vehicle Insurance, Property Insurance, Business Insurance, Additional Insurance", s);
    }

}
