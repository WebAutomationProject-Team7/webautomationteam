package datasource;

import base.CommonApi;
import database.ConnectToSqlDB;

import javax.smartcardio.CommandAPDU;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseOperation extends CommonApi {

    static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

    public static void insertDataIntoDB(){
        List<String> list = getItemValue();
        connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertStringDataFromArrayListToSqlTable(list,"ItemList","items");
    }

    public static List<String> getItemValue(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Alexa Skills");
        itemsList.add("Selenium Book");
        itemsList.add("Amazon Devices");
        itemsList.add("Sunglasses");
        itemsList.add("Toothpaste");
        itemsList.add("Chocolate");
        itemsList.add("Chess set");
        itemsList.add("Whole Foods");

        return itemsList;
    }

    public List<String> getItemsListFromDB()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("ItemList", "items");
        return list;
    }


    public static void main(String[] args) throws Exception, IOException, SQLException, ClassNotFoundException {
        //ConnectToSqlDB.connectToSqlDatabase();
        //insertDataIntoDB();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("ItemList","items");
        for(String st:list){
            System.out.println(st);
        }
    }
}