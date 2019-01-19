package TestCase;

import database.ConnectToSqlDB;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import search.SearchOption;
import search.SearchOptionClass;

public class TestSearchOption extends SearchOption {


    public String keys = "Property";
    SearchOptionClass search;
    @BeforeMethod
    public void initialisationOfElements(){
        search = PageFactory.initElements(driver,SearchOptionClass.class);
    }
@Test
    public void testSearchWithEnterKey() throws Exception{
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    ConnectToSqlDB con = new ConnectToSqlDB();
    ConnectToSqlDB.connectToSqlDatabase();

}

    private String searchWithENTER(String keys) {
        return keys;

    }

    private String convertToString(String name) {
        return name;
    }

    @Test
    public void testSearchWithButton()throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ConnectToSqlDB con = new ConnectToSqlDB();
        con.connectToSqlDatabase();

    }



}











