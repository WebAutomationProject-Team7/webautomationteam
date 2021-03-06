package homepage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pagebase.ApplicationPageBase;
import reporting.TestLogger;
import java.util.ArrayList;
import java.util.List;
public class YourPolicyDD extends ApplicationPageBase {

    @FindBy(id = "homepage_manage_select")
    public static WebElement accessYourPolicy;

    public List<String> policyMenuList() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select dropDown = new Select(accessYourPolicy);
        List<WebElement> dropDownList = dropDown.getOptions();
        List<String> dropDownListText = new ArrayList<>();
        for (WebElement it : dropDownList) {
            dropDownListText.add(it.getText());
        }
        return dropDownListText;
    }
}
