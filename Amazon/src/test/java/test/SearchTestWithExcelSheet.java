package test;

import datasource.SearchPage;
import excelreader.MyDataReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.File;

public class SearchTestWithExcelSheet extends SearchPage {
    SearchPage obj;

    @BeforeMethod
    public void initialisationOfElements() {
        obj = PageFactory.initElements(driver, SearchPage.class);
    }

    @DataProvider(name = "DP")
    public Object[][] getTestData() throws Exception {
        File filepath = new File("/Users/zayka/Desktop/webautomationteam_1/Amazon/src/test/Resources/excelReader.xlsx");
        MyDataReader dr = new MyDataReader();
        dr.setExcelFile(filepath.getAbsolutePath());
        String[][] data = dr.getExcelSheetData("Sheet1");
        return data;
    }

    @Test(dataProvider = "DP")
    public void testSearchWithENTERFromXlsx(String keys, String messages){
        String messageText=searchWithENTER(keys);
        Assert.assertEquals(keys,messages);
    }

}
