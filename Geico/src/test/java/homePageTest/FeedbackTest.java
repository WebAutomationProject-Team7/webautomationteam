package homePageTest;
import homePage.Feedback;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class FeedbackTest extends Feedback {
    Feedback objFeedback;
    @BeforeMethod
    public void init() {
        objFeedback = PageFactory.initElements(driver, Feedback.class);
    }
    @AfterMethod
    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }
    @Test
    public void testVeryDissatisfiedHeaderMessage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(getActualThankYouHeader(), getThankYouForFeedbackMessageHeader(veryDissatisfiedIcon));
    }
    @Test
    public void testVeryDissatisfiedBodyMessage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(getActualThankYouBody(), getThankYouForFeedbackMessageBody(veryDissatisfiedIcon));
    }
    @Test
    public void testDissatisfiedHeaderMessage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(getActualThankYouHeader(), getThankYouForFeedbackMessageHeader(dissatisfiedIcon));
    }
    @Test
    public void testDissatisfiedBodyMessage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(getActualThankYouBody(), getThankYouForFeedbackMessageBody(dissatisfiedIcon));
    }
    @Test
    public void testSomewhatSatisfiedHeaderMessage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(getActualThankYouHeader(), getThankYouForFeedbackMessageHeader(somewhatSatisfiedIcon));
    }
    @Test
    public void testSomewhatSatisfiedBodyMessage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(getActualThankYouBody(), getThankYouForFeedbackMessageBody(somewhatSatisfiedIcon));
    }
    @Test
    public void testSatisfiedHeaderMessage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(getActualThankYouHeader(), getThankYouForFeedbackMessageHeader(satisfiedIcon));
    }
    @Test
    public void testSatisfiedBodyMessage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(getActualThankYouBody(), getThankYouForFeedbackMessageBody(satisfiedIcon));
    }
    @Test
    public void testVerySatisfiedHeaderMessage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(getActualThankYouHeader(), getThankYouForFeedbackMessageHeader(verySatisfiedIcon));
    }
    @Test
    public void testVerySatisfiedBodyMessage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(getActualThankYouBody(), getThankYouForFeedbackMessageBody(verySatisfiedIcon));
    }
}