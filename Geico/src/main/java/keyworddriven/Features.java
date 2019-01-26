package keyworddriven;
import excelreader.MyDataReader;
import homepage.*;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import pagebase.ApplicationPageBase;
import java.io.File;
import java.io.IOException;
import static homepage.Feedback.satisfiedIcon;
public class Features extends ApplicationPageBase {
    SearchFunctionality searchFunctionality;
    LoginFunctionality loginFunctionality;
    Feedback feedback;
    InformationDD informationDD;
    InsuranceDD insuranceDD;
    @BeforeMethod
    public void init(){
        searchFunctionality= PageFactory.initElements(driver, SearchFunctionality.class);
        loginFunctionality= PageFactory.initElements(driver, LoginFunctionality.class);
        feedback= PageFactory.initElements(driver, Feedback.class);
        informationDD= PageFactory.initElements(driver, InformationDD.class);
        insuranceDD= PageFactory.initElements(driver, InsuranceDD.class);
    }
    public void search() {
        searchFunctionality.searchUsingButton("Property");
    }
    public void login() throws InterruptedException {
        loginFunctionality.userLogin("abc@gmail.com", "1234");
    }
    public void customerFeedBack(){
    feedback.getThankYouForFeedbackMessageHeader(satisfiedIcon);
    }
    public void informationDropDown(){
        informationDD.getInformationMenuList();
    }
    public void insuranceDropDown(){
        insuranceDD.getInsuranceMenuList();
    }
    public String selectFeature(String featureName) throws IOException, InterruptedException {
        switch (featureName) {
            case "Login":
                login();
                break;
            case "Search":
                search();
                break;
            case "Customer Feedback":
                customerFeedBack();
                break;
            case "Information Menu":
                informationDropDown();
                break;
            case "Insurance Menu":
                insuranceDropDown();
                break;
                default:
                throw new InvalidArgumentException("Invalid feature choice");
        }return driver.getTitle();
    }
    @DataProvider(name="DP")
    public Object[][] getTestData() throws Exception{
        File filepath = new File("C:\\Users\\arifq\\eclipse-workspace\\webautomationteam\\Geico\\TestData\\FeatureKeyword.xlsx");
        MyDataReader dr = new MyDataReader();
        dr.setExcelFile(filepath.getAbsolutePath());
        String[][] data = dr.getExcelSheetData("Sheet1");
        return data;
    }
}
