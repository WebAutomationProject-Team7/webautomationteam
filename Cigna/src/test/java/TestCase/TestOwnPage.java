package TestCase;

import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageNobject.OwnPage;
import pageNobject.SignInPage;

public class TestOwnPage extends CommonApi {

    OwnPage objOfOwnPage;
    SignInPage objOfSignInPage;

    @BeforeMethod
    public void initilizationOfObject() {
        objOfOwnPage = PageFactory.initElements(driver, OwnPage.class);
        objOfSignInPage = PageFactory.initElements(driver, SignInPage.class);
    }

    @Test(priority = 1, enabled = true)
    public void testFindDoctor() {
        objOfOwnPage.clickFindDoctor();
        //System.out.println("Test case pass: ");
    }
    @Test(priority = 2, enabled = true)
    public void testIndividualFamilyPlan() {
        objOfOwnPage.individualFamilyPlan();
    }
    @Test(priority = 3, enabled = true)
    public void testSearchBar() {
        objOfOwnPage.searchBar();
    }
    @Test(priority = 4, enabled = true)
    public void testCignaMedicare() {
        objOfOwnPage.cignaMedicare();
    }
    @Test(priority = 5, enabled = true)
    public void testInternationalIndividualPlan() {
        objOfOwnPage.internationalIndividualPlan();
    }
    @Test(priority = 6, enabled = true)
    public void testOfferCignaThroughWork() {
        objOfOwnPage.offerCignaThroWork();
    }
    @Test(priority = 7, enabled = true)
    public void testHealthWellness() {
        objOfOwnPage.healthNWellness();
    }
    @Test(priority = 8, enabled = true)
    public void testMainLogo() {
        objOfOwnPage.mLogo();
    }
    @Test(priority = 9, enabled = true)
    public void testMoreInformation() {
        objOfOwnPage.moreI();
    }
    @Test(priority = 10, enabled = true)
    public void testViewDetails() {
        objOfOwnPage.viewDet();
    }
    @Test(priority = 11, enabled = true)
    public void testSeeVideo() {
        objOfOwnPage.seeV();
    }
    @Test(priority = 12, enabled = true)
    public void testHearWhatYouNeed() {
        objOfOwnPage.hearWhatYouNeed();
    }
    @Test(priority = 13, enabled = true)
    public void testDownloadAPP() {
        objOfOwnPage.downloadApps();
    }
    @Test(priority = 14, enabled = true)
    public void testListenNow() {
        objOfOwnPage.listenN();
    }
    @Test(priority = 15, enabled = true)
    public void testReadMore() {
        objOfOwnPage.readMore();
    }
    @Test(priority = 16, enabled = true)
    public void testNews() {
        objOfOwnPage.newsL();
    }
    @Test(priority = 17, enabled = true)
    public void testInvestors() {
        objOfOwnPage.investorsL();
    }
    @Test(priority = 18, enabled = true)
    public void testCoperate() {
        objOfOwnPage.coperateL();
    }
    @Test(priority = 19, enabled = true)
    public void testFindADoctor() {
        objOfOwnPage.findADoctorL();
    }
    @Test(priority = 20, enabled = true)
    public void testInformedOnReport() {
        objOfOwnPage.informedOnReportL();
    }
    @Test(priority = 21, enabled = true)
    public void testMopileApp() {
        objOfOwnPage.mobileApp();
    }
    @Test(priority = 22, enabled = true)
    public void testContactAs() {
        objOfOwnPage.contactAsLink();
    }
    @Test(priority = 23, enabled = true)
    public void testFeedback() {
        objOfOwnPage.feedbackL();
    }
    @Test(priority = 24, enabled = true)
    public void testLinkedin() {
        objOfOwnPage.linkedin();
    }
    @Test(priority = 25, enabled = true)
    public void testFacebook() {
        objOfOwnPage.facebookLink();
    }
    @Test(priority = 26, enabled = true)
    public void testTwitter() {
        objOfOwnPage.twitterL();
    }
    @Test(priority = 27, enabled = true)
    public void testYoutube() {
        objOfOwnPage.youtubeL();
    }
    @Test(priority = 28, enabled = true)
    public void testGoogle() {
        objOfOwnPage.googleLink();
    }
    @Test(priority = 29, enabled = true)
    public void testPinIntrest() {
        objOfOwnPage.pinintrestLink();
    }
    @Test(priority = 30, enabled = true)
    public void testWeibo() {
        objOfOwnPage.weiboLink();
    }
    @Test(priority = 31, enabled = true)
    public void testInstragram() {
        objOfOwnPage.instagramL();
    }
    @Test(priority = 32, enabled = true)
    public void testViewAll() {
        objOfOwnPage.viewAllLink();
    }
    @Test(priority = 33, enabled = true)
    public void testNorton() {
        objOfOwnPage.nortonLink();
    }
    @Test(priority = 34, enabled = true)
    public void testFeedbackSideLink() {
        objOfOwnPage.feedbackSideLink();
    }
    @Test(priority = 35, enabled = true)
    public void testSign() {
        objOfOwnPage.sign();
    }
}

