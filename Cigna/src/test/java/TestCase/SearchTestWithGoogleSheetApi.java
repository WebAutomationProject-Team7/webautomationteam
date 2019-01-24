package TestCase;

import googlesheetapi.GoogleSheetReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import search.SearchOption;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import static base.PageOfApplication.loadProperties;

public class SearchTestWithGoogleSheetApi extends SearchOption {

    SearchOption search=null;
    @BeforeMethod
    public void initialisationOfElements(){
        search = PageFactory.initElements(driver,SearchOption.class);
    }
    @Test
    public void testSearchWithEnterfromSheet() throws IOException {

        Properties properties=loadProperties();
        String spreadSheetId=properties.getProperty("GOOGLE.spreadsheetId");
        String range=properties.getProperty("GOOGLE.range");
        java.util.List<java.util.List<Object>> getRecords= GoogleSheetReader.getSpreadSheetRecords(spreadSheetId,range );
        for(List<Object> cell:getRecords){
            String messageText=searchWithEnter(cell.get(0).toString());
            String message=cell.get(1).toString();

        }
    }
}


