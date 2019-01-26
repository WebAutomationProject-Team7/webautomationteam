package test;

import base.CommonApi;
import datasource.SearchPage;
import googlesheetapi.GoogleSheetReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import static database.ConnectToSqlDB.loadProperties;

public class SearchTestWithGoogleSheetAPI extends CommonApi {
    SearchPage searchPage;
    @BeforeMethod
    public void initialisationOfElements(){ searchPage = PageFactory.initElements(driver, SearchPage.class);
    }
    @Test
    public void testSearchWithENTERfromSheet() throws IOException {
        Properties properties=loadProperties();
        String spreadSheetId=properties.getProperty("GOOGLE.spreadsheetId");
        String range=properties.getProperty("GOOGLE.range");
        List<List<Object>> getRecords= GoogleSheetReader.getSpreadSheetRecords(spreadSheetId,range);
        for(List cell:getRecords){
            String keys = searchPage.searchWithENTER(cell.get(0).toString());
            String messages =cell.get(1).toString();
           Assert.assertEquals(keys,messages);

        }
    }
}

