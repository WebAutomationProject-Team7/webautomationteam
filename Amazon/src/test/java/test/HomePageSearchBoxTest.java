package test;

import base.CommonApi;
import com.relevantcodes.extentreports.ExtentReports;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePageSearchBox;
import reporting.ExtentManager;

public class HomePageSearchBoxTest extends HomePageSearchBox {
    HomePageSearchBox homePageDropDown;
    ExtentReports reports;
    @BeforeMethod
    public void setUp() {
        this.homePageDropDown = new HomePageSearchBox();
        reports = ExtentManager.getInstance();
    }
    @Test
    public void SearchBoxCheck(){
        homePageDropDown.searhWithArrayList();

    }


}
