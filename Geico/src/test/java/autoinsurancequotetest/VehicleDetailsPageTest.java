package autoinsurancequotetest;
import autoinsuranceqoutepage.VehicleDetailsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class VehicleDetailsPageTest extends VehicleDetailsPage{
    VehicleDetailsPage vehicleDetailsPage;
    @BeforeMethod
    public void init(){vehicleDetailsPage= PageFactory.initElements(driver, VehicleDetailsPage.class);
    }
    @Test
    public void testEnterVehicleDetailsPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(enterVehicleDetails(),"GEICO");
    }
    @Test
    public void testClickOnRadioButtonForOwnershipType(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(clickOnRadioButtonForOwnershipType(),"GEICO");
    }
    @Test
    public void testClickOnRadioButtonOrimaryUse(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(clickOnRadioButtonForimaryUse(),"GEICO");
    }
}
