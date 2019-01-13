package TestCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageNobject.HomePage;
import pageNobject.SignInPage;

public class TestHomePage extends HomePage {

    HomePage homePage;
    SignInPage signInPage;

    @BeforeMethod
    public void initilizationOfObject() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        signInPage = PageFactory.initElements(driver, SignInPage.class);
    }


    @Test
    public void contactUsButton() {
        String actual = homePage.checkContactUs();
        String expect = "https://www.cigna.com/about-us/contact-us/";
        Assert.assertEquals(actual, expect);
    }

    @Test
    public void cignaInternationalTab() {
        String actual = homePage.cignaInternational();
        String expect = "https://www.cigna.com/international/";
        Assert.assertEquals(actual, expect);
    }

    @Test
    public void logoDisplayedcheck() {
        boolean actual = homePage.logoDisplayed();
        Assert.assertTrue(actual);
    }

    @Test
    public void yTubeLinkTest() throws InterruptedException {
        String actual = homePage.loginUrl();
        String expected = "https://my.cigna.com/web/public/guest";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void contactUstab() {
        String actual = homePage.contactUs();
        String expect = "Contact Us";
        Assert.assertEquals(actual, expect);

    }

    @Test

    public void checkIndividualFamiliesTab() {
        String actual = homePage.checkIndividualFamilies();
        String expect = "https://www.cigna.com/individuals-families/";
        Assert.assertEquals(actual, expect);
    }

    @Test
    public void checkEmployeeNbroker() {
        String actual = homePage.checkEmployerNbrokers();
        String expect = "https://www.cigna.com/employers-brokers/";
        Assert.assertEquals(actual, expect);
    }

    @Test
    public void checkHealthCareProviders() {
        String actual = homePage.checkHealthCareProvider();
        String expect = "https://www.cigna.com/health-care-providers/";
        Assert.assertEquals(actual, expect);
    }

    @Test
    public void checkFindDoctorsTab() {
        String actual = homePage.checkFindDoctors();
        String expect = "https://www.cigna.com/hcpdirectory/";
        Assert.assertEquals(actual, expect);
    }


    @Test
    public void checkLoginPageTab() {
        String actual = homePage.checkLoginPage();
        String expect = "https://my.cigna.com/web/public/guest/";

    }

    @Test
    public void checkSearchBoxTab() {
        String actual = homePage.checkSearchBox();
        String expect = "https://www.cigna.com/search?query=medical%20claim%20form";

    }

    @Test

    public void checkMedicalPlanTab() {
        String actual = homePage.checkMedicalPlanBox();
        String expect = "https://www.cigna.com/medicare/supplemental/?campaign_ID=CSBORG";

    }
@Test
    public void checkShopDentalPlanTab() {
        String actual = homePage.checkShopDentalPlans();
        String expect = "https://www.cigna.com/individuals-families/plans-services/dental-insurance-plans/";
        Assert.assertEquals(actual, expect);


    }
@Test
    public void checkHealthInsuranceTab() {
        String actual = homePage.checkHealthInsurance();
        String expect = "https://www.cigna.com/individuals-families/plans-services/health-insurance-plans/";
        Assert.assertEquals(actual, expect);


    }
@Test
    public void checkMedicareProductsTab() {
        String actual = homePage.checkMedicareProducts();
        String expect = "https://www.cigna.com/medicare/";

    }

@Test
    public void checkMedicareSupplementInsuranceTab() {
        String actual = homePage.checkMedicareSupplementInsurance();
        String expect = "https://www.cigna.com/individuals-families/plans-services/supplemental/";


    }
@Test
    public void checkDentalInsuranceTab() {
        String actual = homePage.checkDentalInsurance();
        String expect = "https://www.cigna.com/individuals-families/plans-services/dental-insurance-plans/";
        Assert.assertEquals(actual, expect);

    }
@Test
    public void checkOtherInsuranceTab() {
        String actual = homePage.checkOtherInsurance();
        String expect = "https://www.cigna.com/individuals-families/plans-services/supplemental/";
        Assert.assertEquals(actual, expect);

    }
@Test
    public void checkInternationalCoverageTab() {
        String actual = homePage.checkInternationalCoverage();
        String expect = "https://www.cigna.com/international/";
        Assert.assertEquals(actual, expect);

    }
@Test
    public void checkEmployeePlanNPolicyTab() {
        String actual = homePage.checkEmployeePlanNPolicy();
        String expect = "https://www.cigna.com/individuals-families/plans-services/plans-through-employer/#filter=plantype/medical-plans";


    }
@Test
    public void checkEmployerGroupSolutionsTab() {
        String actual = homePage.checkEmployerGroupSolutions();
        String expect = "https://www.cigna.com/employers-brokers/plans-services/#filter=plantype/medical-plans/group/all-group-sizes";
        Assert.assertEquals(actual, expect);

    }
@Test
    public void checkLearnMoreAboutConnectionTab() {
        String actual = homePage.checkLearnMoreAboutConnection();
        String expect = "https://www.cigna.com/takecontrol/";
        Assert.assertEquals(actual, expect);


    }
}























