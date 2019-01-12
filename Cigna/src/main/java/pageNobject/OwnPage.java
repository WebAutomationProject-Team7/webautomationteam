package pageNobject;

import base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class OwnPage extends CommonApi {

    public OwnPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#includes-content > div.d-none.d-lg-block > nav:nth-child(2) > div > a > svg")
    public WebElement logo;
    @FindBy(xpath = "//div[@id=\"includes-content\"]/div/nav[2]/div/ul/li[2]/a")
    public WebElement loginPage;
    @FindBy(xpath = "//div[@id='includes-content']/div[1]/nav[1]/div/ul/li[2]/a")
    public WebElement contactUs;
    @FindBy(css = "#includes-content > div.d-none.d-lg-block > nav.navbar.global-nav.universal-navigation.navbar-expand-lg.navbar-white.bg-white.pt-lg-0 > div > ul > li:nth-child(1) > a")
    public WebElement cignaInternationnal;
    @FindBy(css = "#includes-content > div.d-none.d-lg-block > nav:nth-child(2) > div > ul > li:nth-child(2) > a")
    public WebElement logintomyCigna;
    @FindBy(xpath = "//div[@id='includes-content']/div[1]/nav[3]/div/ul/li[1]/a")
    public WebElement individualFamilies;
    @FindBy(xpath = "//div[@id=\"includes-content\"]/div/nav[3]/div/ul/li[2]/a")
    public WebElement employersNbrokers;
    @FindBy(xpath = "//div[@id='includes-content']/div/nav[3]/div/ul/li[3]/a")
    public WebElement healthCareProviders;
    @FindBy(xpath = "//div[@id=\"includes-content\"]/div/nav[2]/div/ul/li[1]/a")
    public WebElement findDoctors;
    @FindBy(name = "query")
    public WebElement searchButton;
    @FindBy(css = "a[class='link-action mb-m link-external']")
    public WebElement shopMedicalPlanes;
    @FindBy(xpath = "//div[@id='1524743177700']/div/div/div[2]/div/p[3]/a")
    public WebElement shopDentalPlans;
    @FindBy(xpath = "//div[@id=\"1524743178566\"]/div/div[1]/div/div/div[1]/div[2]/a")
    public WebElement healthInsuranceTab;
    @FindBy(xpath = "//div[@id='1524743178566']/div/div[1]/div/div/div[2]/div[2]/a")
    public WebElement medicareProducts;
    @FindBy(xpath = "//div[@id=\"1524743178566\"]/div/div[1]/div/div/div[3]/div[2]/a")
    public WebElement medicareSupplementInsurance;
    @FindBy(xpath = "//div[@id='1524743178566']/div/div[1]/div/div/div[4]/div[2]/a")
    public WebElement dentalInsurance;
    @FindBy(xpath = "//div[@id='1524743178566']/div/div[1]/div/div/div[5]/div[2]/a")
    public WebElement otherInsurance;
    @FindBy(xpath = "//div[@id='1524743178566']/div/div[1]/div/div/div[6]/div[2]/a")
    public WebElement internationalCoverage;
    @FindBy(xpath = "//div[@id='1524743178566']/div/div[3]/div/div/div[1]/div[2]/h4/a")
    public WebElement employeePlanNPolicy;
    @FindBy(xpath = "//div[@id='1524743178566']/div/div[3]/div/div/div[2]/div[2]/h4/a")
    public WebElement employerGroupSolutions;
    @FindBy(xpath = "//div[@id='1524996545295']/div/div[2]/div/a")
    public WebElement learnMoreAboutconnection;
    @FindBy(xpath = "//div[@id='oo_tab']")
    public static WebElement feedback;

    public String checkContactUs() {
        contactUs.click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
    public String cignaInternational() {
        cignaInternationnal.click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
    public boolean logoDisplayed() {
        boolean logoDisplayed = logo.isDisplayed();
        return logoDisplayed;
    }
    public String loginUrl() throws InterruptedException {
        logintomyCigna.click();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        for (String loginTab : driver.getWindowHandles()) {
            driver.switchTo().window(loginTab);
        }
        System.out.println(driver.getTitle());
        String url = driver.getCurrentUrl();
        return url;
    }
    public String contactUs() {
        String text = contactUs.getText();
        System.out.println(contactUs.getText());
        return text;
    }
    public String checkIndividualFamilies() {
        individualFamilies.click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
    public String checkEmployerNbrokers() {
        employersNbrokers.click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
    public String checkHealthCareProvider() {
        healthCareProviders.click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
    public String checkFindDoctors() {
        findDoctors.click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
    public String checkLoginPage() {
        loginPage.click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
    public String checkSearchBox() {
        searchButton.sendKeys("Medical Claim Form");
        searchButton.submit();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
    public String checkMedicalPlanBox() {
        shopMedicalPlanes.click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
    public String checkShopDentalPlans() {
        shopDentalPlans.click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
    public String checkHealthInsuranceTab() {
        healthInsuranceTab.click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
    public String checkMedicareProducts() {
        medicareProducts.click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
    public String checkMedicareSupplementInsurance() {
        medicareSupplementInsurance.click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
    public String checkDentalInsurance() {
        dentalInsurance.click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
    public String checkOtherInsurance() {
        otherInsurance.click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
    public String checkInternationalCoverage() {
        internationalCoverage.click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
    public String checkEmployeePlanNPolicy() {
        employeePlanNPolicy.click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
    public String checkEmployerGroupSolutions() {
        employerGroupSolutions.click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
    public String checkLearnMoreAboutConnection() {
        learnMoreAboutconnection.click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;

    }



    }





