package search;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelReader {

    XSSFWorkbook dp;
    XSSFSheet ExcelData;
    public ExcelReader(String xlfilepath){
        try{
            File src = new File(xlfilepath);
            FileInputStream fis =new FileInputStream(src);
            dp = new XSSFWorkbook(fis);
            ExcelData = dp.getSheetAt(0);
            dp.close();
        }catch (Exception e){
            System.out.println(e.getMessage()); } }
    public String getData(int sheetnumber,int rownumber,int colnumber)
    { ExcelData = dp.getSheetAt(sheetnumber);
        String data = ExcelData.getRow(rownumber).getCell(colnumber).getStringCellValue();
        return data; }
    public int getRowCount(int sheetNumber){
        int row=  dp.getSheetAt(sheetNumber).getLastRowNum();
        row = row +1;
        return row; }}




