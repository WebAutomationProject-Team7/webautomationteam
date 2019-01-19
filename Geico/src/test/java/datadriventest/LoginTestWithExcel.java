package datadriventest;
import excelreader.MyDataReader;
import homepage.LoginFunctionality;
import homepage.SearchFunctionality;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.File;
public class LoginTestWithExcel extends LoginFunctionality {
    SearchFunctionality search=null;
    @BeforeMethod
    public void initialisationOfElements(){
        search = PageFactory.initElements(driver,SearchFunctionality.class);
    }
    @DataProvider(name="DP")
    public Object[][] getTestData() throws Exception{
        File filepath = new File("C:\\Users\\arifq\\eclipse-workspace\\webautomationteam\\Geico\\TestData\\Excelfile.xlsx");
        MyDataReader dr = new MyDataReader();
        dr.setExcelFile(filepath.getAbsolutePath());
        String[][] data = dr.getExcelSheetData("Sheet2");
        return data;
    }
    @Test(dataProvider = "DP")
    public  void testLoginWithEnterFromXlsx(String userID, String password, String errorMessage) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String messageText=userLogin(userID,password);
        Assert.assertEquals( messageText,errorMessage);
    }
}

