package autoinsuranceqoutepage;

import reporting.TestLogger;

public class YourAddressPage extends YourInfoPage{
    public String enterCustomerAddress(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        enterCustomerDOB();
        typeByCss("#street","17527 wexford road");
        typeByCss("#apt","7B");
        clickNext();
        return driver.getTitle();
    }


}
