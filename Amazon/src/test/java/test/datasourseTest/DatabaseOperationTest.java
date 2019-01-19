package test.datasourseTest;

import base.CommonApi;
import datasource.DatabaseOperation;
import datasource.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;

public class DatabaseOperationTest extends CommonApi {
    @Test
    public void searchItems()throws Exception, IOException, SQLException, ClassNotFoundException {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchItemsAndSubmitButton();
    }

}


