package datadriventest;
import homepage.SearchFunctionality;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import excelreader.MyDataReader;
import reporting.TestLogger;
import java.io.File;
public class SearchTestWithExcelReader extends SearchFunctionality {
    SearchFunctionality search=null;
    @BeforeMethod
    public void initialisationOfElements(){
         search = PageFactory.initElements(driver,SearchFunctionality.class);
    }
    @DataProvider(name="DP")
    public Object[][] getTestData() throws Exception{
        File filepath = new File("C:\\Users\\arifq\\eclipse-workspace\\webautomationteam\\Geico\\TestData\\Excelfile.xlsx");
        MyDataReader dr = new MyDataReader();
        //Show me where is data file
        dr.setExcelFile(filepath.getAbsolutePath());
        String[][] data = dr.getExcelSheetData("Sheet1");
        return data;
    }
    @Test(dataProvider = "DP")
    public void testSearchWithEnterfromxlsx(String keys, String message){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       String messageText=searchWithENTER(keys);
        Assert.assertEquals( message,messageText);
    }
}
