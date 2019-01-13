package keyWord;

import base.CommonApi;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import pageNobject.HomePage;
import pageNobject.SignInPage;

import java.io.IOException;

public class FeatureClass extends CommonApi {

    SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);

    public void Login() {
        signInPage.enterCredintials();
    }

    public void Regristration() {
        signInPage.registration1();
        signInPage.registration2();
    }

    public void searchProduct() {
        homePage.checkSearchBox();
        System.out.println("Search");
    }

    public void selectAction(String featureName) throws IOException {
        switch (featureName) {
            case "Login":
                Login();
                break;
            case "Regristration":
                Regristration();
                break;
            case "SearchProduct":
                searchProduct();
                break;
            default:
                throw new InvalidArgumentException("Invalid feature choice");
        }


    }
}