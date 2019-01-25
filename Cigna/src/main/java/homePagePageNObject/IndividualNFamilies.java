package homePagePageNObject;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndividualNFamilies extends CommonApi {

    @FindBy(xpath = "//*[@id=\"includes-content\"]/div/nav[3]/div/ul/li[1]/a")
    public WebElement mainOption;
    @FindBy(xpath = "//*[@id=\"1522290402525\"]/div/div/div[2]/div/p[2]/a")
    public WebElement underStandingInsurance;
    @FindBy(xpath ="//*[@id=\"1522290402535\"]/div/div[2]/div/div[1]/div/ul/li[1]/a")
    public WebElement healthInsurance;


    public void checkMainOption(){
        mainOption.click();
    }

    public void checkInsurance(){
        underStandingInsurance.click();
    }

    public void checkHealthInsurance(){
        healthInsurance.click();
    }

}




