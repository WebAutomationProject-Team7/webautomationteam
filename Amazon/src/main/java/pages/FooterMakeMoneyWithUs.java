package pages;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterMakeMoneyWithUs extends CommonApi {
    public FooterMakeMoneyWithUs(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id='navFooter']/div[1]/div/div[3]/ul/li[1]/a")
    public static WebElement SellOnAmazon;
    public void setSellOnAmazon(WebElement SellOnAmazon){
        SellOnAmazon.click();
    }
    @FindBy(xpath = "//*[@id='navFooter']/div[1]/div/div[3]/ul/li[2]/a")
    public static WebElement SellUnderPrivateBrands;
    public void setSellUnderPrivateBrands(WebElement SellUnderPrivateBrands){
        SellUnderPrivateBrands.click();
    }
    @FindBy (xpath = "//*[@id='navFooter']/div[1]/div/div[3]/ul/li[3]/a")
    public static WebElement SellOnAmazonHandMade;
    public void setSellOnAmazonHandMade (WebElement SellOnAmazonHandMade){
        SellOnAmazonHandMade.click();
    }
    @FindBy(xpath = "//*[@id='navFooter']/div[1]/div/div[3]/ul/li[4]/a")
    public static WebElement SellYourServicesOnAmazon;
    public void setSellYourServicesOnAmazon(WebElement SellYourServicesOnAmazon){
        SellYourServicesOnAmazon.click();
    }
    @FindBy(xpath = "//*[@id='navFooter']/div[1]/div/div[3]/ul/li[5]/a")
    public static WebElement SellOnAmazonBusiness;
    public void setSellOnAmazonBusiness(WebElement SellOnAmazonBusiness){
        SellOnAmazonBusiness.click();
    }
    @FindBy(xpath = "//*[@id='navFooter']/div[1]/div/div[3]/ul/li[6]/a")
    public static WebElement SellYourAppOnAmazon;
    public void setSellYourAppOnAmazon (WebElement SellYourAppOnAmazon ){
        SellYourAppOnAmazon.click();
    }
    @FindBy(xpath = "//*[@id='navFooter']/div[1]/div/div[3]/ul/li[7]/a")
    public static WebElement BecomeAnAffiliate;
    public void setBecomeAnAffiliate(WebElement BecomeAnAffiliate){
        BecomeAnAffiliate.click();
    }
    @FindBy(xpath = "//*[@id='navFooter']/div[1]/div/div[3]/ul/li[8]/a")
    public static WebElement AdvertiseYourProducts;
    public void setAdvertiseYourProducts(WebElement AdvertiseYourProducts){
        AdvertiseYourProducts.click();
    }
    @FindBy(xpath = "//*[@id='navFooter']/div[1]/div/div[3]/ul/li[9]/a")
    public static WebElement SelfPublishWithUs;
    public void setSelfPublishWithUs(WebElement SelfPublishWithUs){
        SelfPublishWithUs.click();
    }


}
