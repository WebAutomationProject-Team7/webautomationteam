package TestCase;

import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageNobject.OwnPage;
import pageNobject.SignInPage;

public class TestOwnPage extends OwnPage {

    OwnPage ownPage;
    SignInPage signInPage;

    @BeforeMethod
    public void initilizationOfObject() {
        ownPage = PageFactory.initElements(driver, OwnPage.class);
        signInPage = PageFactory.initElements(driver, SignInPage.class);
    }


    @Test
    public void contactUsButton() {
        String actual = ownPage.checkContactUs();
        String expect = "https://www.cigna.com/about-us/contact-us/";
        Assert.assertEquals(actual, expect);
    }

    @Test
    public void cignaInternationalTab() {
        String actual = ownPage.cignaInternational();
        String expect = "https://www.cigna.com/international/";
        Assert.assertEquals(actual, expect);
    }

    @Test
    public void logoDisplayedcheck() {
        boolean actual = ownPage.logoDisplayed();
        Assert.assertTrue(actual);
    }

    @Test
    public void yTubeLinkTest() throws InterruptedException {
        String actual = ownPage.loginUrl();
        String expected = "https://my.cigna.com/web/public/guest";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void contactUstab() {
        String actual = ownPage.contactUs();
        String expect = "Contact Us";
        Assert.assertEquals(actual, expect);

    }

    @Test

    public void checkIndividualFamiliesTab() {
        String actual = ownPage.checkIndividualFamilies();
        String expect = "https://www.cigna.com/individuals-families/";
        Assert.assertEquals(actual, expect);
    }

    @Test
    public void checkEmployeeNbroker() {
        String actual = ownPage.checkEmployerNbrokers();
        String expect = "https://www.cigna.com/employers-brokers/";
        Assert.assertEquals(actual, expect);
    }

    @Test
    public void checkHealthCareProviders() {
        String actual = ownPage.checkHealthCareProvider();
        String expect = "https://www.cigna.com/health-care-providers/";
        Assert.assertEquals(actual, expect);
    }

    @Test
    public void checkFindDoctorsTab() {
        String actual = ownPage.checkFindDoctors();
        String expect = "https://www.cigna.com/hcpdirectory/";
        Assert.assertEquals(actual, expect);
    }


    @Test
    public void checkLoginPageTab() {
        String actual = ownPage.checkLoginPage();
        String expect = "https://my.cigna.com/web/public/guest/";

    }

    @Test
    public void checkSearchBoxTab() {
        String actual = ownPage.checkSearchBox();
        String expect = "https://www.cigna.com/search?query=medical%20claim%20form";

    }

    @Test

    public void checkMedicalPlanTab() {
        String actual = ownPage.checkMedicalPlanBox();
        String expect = "https://www.cigna.com/medicare/supplemental/?campaign_ID=CSBORG";

    }
@Test
    public void checkShopDentalPlanTab() {
        String actual = ownPage.checkShopDentalPlans();
        String expect = "https://www.cigna.com/individuals-families/plans-services/dental-insurance-plans/";
        Assert.assertEquals(actual, expect);


    }
@Test
    public void checkHealthInsuranceTab() {
        String actual = ownPage.checkHealthInsurance();
        String expect = "https://www.cigna.com/individuals-families/plans-services/health-insurance-plans/";
        Assert.assertEquals(actual, expect);


    }
@Test
    public void checkMedicareProductsTab() {
        String actual = ownPage.checkMedicareProducts();
        String expect = "https://www.cigna.com/medicare/";

    }

@Test
    public void checkMedicareSupplementInsuranceTab() {
        String actual = ownPage.checkMedicareSupplementInsurance();
        String expect = "https://www.cigna.com/individuals-families/plans-services/supplemental/";


    }
@Test
    public void checkDentalInsuranceTab() {
        String actual = ownPage.checkDentalInsurance();
        String expect = "https://www.cigna.com/individuals-families/plans-services/dental-insurance-plans/";
        Assert.assertEquals(actual, expect);

    }
@Test
    public void checkOtherInsuranceTab() {
        String actual = ownPage.checkOtherInsurance();
        String expect = "https://www.cigna.com/individuals-families/plans-services/supplemental/";
        Assert.assertEquals(actual, expect);

    }
@Test
    public void checkInternationalCoverageTab() {
        String actual = ownPage.checkInternationalCoverage();
        String expect = "https://www.cigna.com/international/";
        Assert.assertEquals(actual, expect);

    }
@Test
    public void checkEmployeePlanNPolicyTab() {
        String actual = ownPage.checkEmployeePlanNPolicy();
        String expect = "https://www.cigna.com/individuals-families/plans-services/plans-through-employer/#filter=plantype/medical-plans";


    }
@Test
    public void checkEmployerGroupSolutionsTab() {
        String actual = ownPage.checkEmployerGroupSolutions();
        String expect = "https://www.cigna.com/employers-brokers/plans-services/#filter=plantype/medical-plans/group/all-group-sizes";
        Assert.assertEquals(actual, expect);

    }
@Test
    public void checkLearnMoreAboutConnectionTab() {
        String actual = ownPage.checkLearnMoreAboutConnection();
        String expect = "https://www.cigna.com/takecontrol/";
        Assert.assertEquals(actual, expect);


    }
}























