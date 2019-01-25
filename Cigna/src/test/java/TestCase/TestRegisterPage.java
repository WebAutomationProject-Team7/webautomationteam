package TestCase;

import homePagePageNObject.RegisterPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import static base.PageOfApplication.convertToString;

public class TestRegisterPage extends RegisterPage {


    RegisterPage registerPage;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        registerPage = PageFactory.initElements(driver, RegisterPage.class);
        setUrl("https://my.cigna.com/web/public/consumer#name");
    }

    private void setUrl(String s) {
        return;
    }

    @Test
    public void testRegistration() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        registerPage.checkRegistration();
    }
}

