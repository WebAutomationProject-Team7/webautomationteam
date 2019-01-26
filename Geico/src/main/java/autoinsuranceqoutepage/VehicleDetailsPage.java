package autoinsuranceqoutepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
public class VehicleDetailsPage extends YourAddressPage{
    @FindBy (css=".requiredYear")
    public static WebElement modelYear;
    @FindBy (css=".requiredMake")
    public static WebElement make;
    @FindBy (css="#vehicleModel")
    public static WebElement model;
    public String  enterVehicleDetails(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        enterCustomerAddress();
        selectOptionByVisibleText(modelYear,"2015");
        selectOptionByVisibleText(make,"Acura");
        selectOptionByVisibleText(model, "MDX");
        clickNext();
        clickNext();
        return driver.getTitle();
    }
    public String clickOnRadioButtonForOwnershipType(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        enterVehicleDetails();
        clickByCss("#vehicleOwned0");
        clickNext();
        return driver.getTitle();
    }
    public String clickOnRadioButtonForimaryUse(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnRadioButtonForOwnershipType();
        driver.findElement(By.partialLinkText("Pleasure")).click();
        clickNext();
        clickNext();
        clickByXpath("//button[#'btnSubmit']");
        return driver.getTitle();
    }
}
