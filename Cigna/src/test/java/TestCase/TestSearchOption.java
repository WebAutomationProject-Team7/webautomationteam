package TestCase;

import database.ConnectToSqlDB;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import search.SearchOption;
import search.SearchOptionClass;

public class TestSearchOption extends SearchOption {

    public String keys = "Property";
    SearchOptionClass search;
    private String searchWithENTER(String keys) {
        return keys;

    }
    private String convertToString(String name) {
        return name;
    }

    @BeforeMethod
    public void initialisationOfElements(){
        search = PageFactory.initElements(driver,SearchOptionClass.class);
    }
    @Test
    public void testSearchWithEnterKey() throws Exception{
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    ConnectToSqlDB connect = new ConnectToSqlDB();
    ConnectToSqlDB.connectToSqlDatabase();

}
    @Test
    public void testSearchWithButton()throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ConnectToSqlDB connect = new ConnectToSqlDB();
        connect.connectToSqlDatabase();

    }



}











