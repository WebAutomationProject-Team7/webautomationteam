package pages;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterAmazonPaymentProducts extends CommonApi {
    public FooterAmazonPaymentProducts(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id='navFooter']/div[1]/div/div[5]/ul/li[1]/a")
    public static WebElement AmazonRewardsVisaProducts;
    public void setAmazonRewardsVisaProducts(WebElement AmazonRewardsVisaProducts){
        AmazonRewardsVisaProducts.click();
    }
    @FindBy(xpath = "//*[@id='navFooter']/div[1]/div/div[5]/ul/li[2]/a")
    public static WebElement AmazonStoreCard;
    public void setAmazonStoreCard(WebElement AmazonStoreCard){
        AmazonStoreCard.click();
    }
    @FindBy(xpath = "//*[@id='navFooter']/div[1]/div/div[5]/ul/li[3]/a")
    public static WebElement AmazonBusinessCard;
    public void setAmazonBusinessCard(WebElement AmazonBusinessCard ){
        AmazonBusinessCard.click();
    }
    @FindBy(xpath = "//*[@id='navFooter']/div[1]/div/div[5]/ul/li[4]/a")
    public static WebElement AmazonCorporateCreditLine;
    public void setAmazonCorporateCreditLine(WebElement AmazonCorporateCreditLine){
        AmazonCorporateCreditLine.click();
    }
    @FindBy(xpath = "//*[@id='navFooter']/div[1]/div/div[5]/ul/li[5]/a")
    public static WebElement ShopWithPoints;
    public void setShopWithPoints(WebElement ShopWithPoints){
        ShopWithPoints.click();
    }
    @FindBy(xpath = "//*[@id='navFooter']/div[1]/div/div[5]/ul/li[6]/a")
    public static WebElement CreditCardMarketplace;
    public void setCreditCardMarketplace(WebElement CreditCardMarketplace){
        CreditCardMarketplace.click();
    }
    @FindBy(xpath = "//*[@id='navFooter']/div[1]/div/div[5]/ul/li[7]/a")
    public static WebElement ReloadYourBalance;
    public void setReloadYourBalance(WebElement ReloadYourBalance){
        ReloadYourBalance.click();
    }
    @FindBy(xpath = "//*[@id='navFooter']/div[1]/div/div[5]/ul/li[8]/a")
    public static WebElement AmazonCurrencyConverter;
    public void setAmazonCurrencyConverter(WebElement AmazonCurrencyConverter){
        AmazonCurrencyConverter.click();
    }

}
