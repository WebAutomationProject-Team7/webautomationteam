package homePageTest;
import homePage.InformationDD;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class InformationDDTest extends InformationDD {
    InformationDD informationDD;
    @BeforeMethod
    public void init(){
        informationDD = PageFactory.initElements(driver, InformationDD.class);
    }
    @Test
    public void testInformationMenuItems() {
        String s = String.join(", ",getInformationMenuList());
        Assert.assertEquals("My Account, Claims and Incidents, Tools and Resources, About GEICO, Web and Mobile, Contact Us", s);
    }
}
