package homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagebase.ApplicationPageBase;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;
public class InformationDD extends ApplicationPageBase {
    @FindBy(css = "ul.desktop-links > li:nth-child(2)>a")
    public static WebElement information;
    public static String informationPath = "//div[@data-side-panel='information']";
    public static String infoElementsPath = "//div[@data-side-panel='information']/ul/li/a/span[2]";

    public List<WebElement> getMenuList(String parentXpath, String childXpath){
        waitToBeVisible(parentXpath);
        List<WebElement> listA = driver.findElements(By.xpath(childXpath));
        return listA;
    }
    public List<String> getInformationMenuList(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        information.click();
        List<WebElement> listB = getMenuList(informationPath,infoElementsPath);
        List<String> text = new ArrayList<>();
        for (WebElement it : listB) {
           text.add(it.getText());
        }
        return  text;
    }
}
