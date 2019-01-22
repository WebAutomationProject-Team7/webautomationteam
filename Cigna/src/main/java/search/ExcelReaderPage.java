package search;

import base.CommonApi;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ExcelReaderPage extends CommonApi {

    public ExcelReaderPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(css="#csng-search-header > search-header-bar > form > div > cigna-typeahead > input")
    WebElement searchOption;
    public void searchFromExcel() throws InterruptedException {
        ExcelReader excelReader = new ExcelReader("/Users/salmaalam/IdeaProjects/webautomationteam/Cigna/TestData/TestData.xlsx");
        int rowcount = excelReader.getRowCount(0);
        searchOption.click();
        for (int i = 0; i < rowcount; i++) {
            String searchItems = excelReader.getData(0, i, 0);
            searchOption.sendKeys(searchItems, Keys.ENTER);
            Thread.sleep(500);
            searchOption.clear();


        }
    }
}



