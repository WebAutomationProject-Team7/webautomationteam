package datasource;

import base.CommonApi;
import database.ConnectToSqlDB;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;



public class SearchPage extends CommonApi {

        @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
        public static WebElement searchInputWebElement;

        @FindBy(xpath = "//*[@id='nav-search']/form/div[2]/div/input")
        public static WebElement submitButtonWebElement;

    public String searchWithENTER (String searchKeys) {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        //}.getClass().getEnclosingMethod().getName()));
        //clearField(searchTextBox);
        searchInputWebElement.clear();
        searchInputWebElement.sendKeys(searchKeys, Keys.ENTER);
           return driver.getTitle();
    }

        public String searchUsingButton (String searchKeys) {
//            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
//            }.getClass().getEnclosingMethod().getName()));
            searchInputWebElement.sendKeys(searchKeys); //webelements
            submitButtonWebElement.click();
            return driver.getTitle();
        }

    List<String> keyList = new ArrayList<String>();
    List<String> messageList=new ArrayList<>();
    public List<String> getSearchKeys() {
        keyList.add("bicycle");
        keyList.add("juice");
        keyList.add("sunglasses");
        keyList.add("movies");
        keyList.add("Alexa");
        keyList.add("speaker");
        keyList.add("orange");
        return keyList;

    }
    public List<String> searchFromDatabase() throws Exception {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ConnectToSqlDB con=new ConnectToSqlDB();
        getSearchKeys();
        con.insertDataFromArrayListToSqlTable(keyList,"SearchItem","SearchKeys");
        List<String> data = con.readDataBase("SearchItem","SearchKeys");
        for (String key:data){ String messageText=searchWithENTER(key);
            messageList.add(messageText);
            //navigateBack();
        }
        return messageList;
    }
}



