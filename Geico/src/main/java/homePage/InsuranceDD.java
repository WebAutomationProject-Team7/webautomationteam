package homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagebase.ApplicationPageBase;
import java.util.ArrayList;
import java.util.List;
public class InsuranceDD extends ApplicationPageBase {
    @FindBy(xpath = "//a[@data-side-panel-trigger='insurance']")
    public static WebElement insurance;
    public static String insurancePath = "//div[@data-side-panel='insurance']";
    public static String insuranceElementsPath = "//div[@data-side-panel='insurance']/ul/li/a/span[2]";

    public List<WebElement> getMenuList(String parentXpath, String childXpath){
        waitToBeVisible(parentXpath);
        List<WebElement> listA = driver.findElements(By.xpath(childXpath));
        return listA;
    }
    public List<String> getInsuranceMenuList(){
        insurance.click();
        List<WebElement> listB = getMenuList(insurancePath,insuranceElementsPath);
        List<String> textB = new ArrayList<>();
        for (WebElement it : listB) {
            textB.add(it.getText());
        }
        return  textB;
    }
}
