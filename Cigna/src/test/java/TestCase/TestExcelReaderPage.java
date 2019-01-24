package TestCase;

import base.CommonApi;
import com.relevantcodes.extentreports.ExtentReports;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.ExtentManager;
import search.ExcelReaderPage;

public class TestExcelReaderPage extends CommonApi {

    ExcelReaderPage excelReader;
    ExtentReports reports;
    @BeforeMethod
    public void setUp() {
        this.excelReader = new ExcelReaderPage();
        reports = ExtentManager.getInstance();

    }
    @Test
    public void itemsSearchFromExcelData() throws InterruptedException {
        excelReader.searchFromExcel();
    }
}
