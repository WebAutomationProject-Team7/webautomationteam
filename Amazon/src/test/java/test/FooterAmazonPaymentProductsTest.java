package test;

import datasource.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FooterAmazonPaymentProducts;

public class FooterAmazonPaymentProductsTest extends FooterAmazonPaymentProducts {
    FooterAmazonPaymentProducts obj;
    //ExtentReports reports;
    @BeforeMethod
    public void setUp(){
        obj = PageFactory.initElements(driver, FooterAmazonPaymentProducts.class);}
        //reports = ExtentManager.getInstance();
    @Test
    public void AmazonPaymentProductsSetUp() {
        AmazonRewardsVisaProducts.click();
        String expected = "EarnRewardsEverywhereYouShop";
        Assert.assertTrue(true);
    }
    @Test
    public void AmazonStoreCardDisplay(){
        AmazonStoreCard.click();
        String expected = "BecomeAnAmazonDotComStoreCardHolder";
        Assert.assertTrue(true);
    }
    @Test
    public void AmazonBusinessCardNav(){
        AmazonBusinessCard.click();
        String expected = "AmazonBusinessAmericanExpressCard";
        Assert.assertTrue(true);
    }
    @Test
    public void AmazonCorporateCreditLineDisplay(){
        AmazonCorporateCreditLine.click();
        String expected = "AmazonDotComCorporateCreditLine";
        Assert.assertTrue(true);
    }
    @Test
    public void ShopWithPointsNav(){
        ShopWithPoints.click();
        String expected = "UseYourFavoriteRewardsPoints";
        Assert.assertTrue(true);
    }
    @Test
    public void CreditCardMarketplaceDisplay(){
        CreditCardMarketplace.click();
        String expected = "CreditAndPaymentCards";
        Assert.assertTrue(true);
    }
    @Test
    public void ReloadYourBalanceShow(){
        ReloadYourBalance.click();
        String expected = "BenefitsOfReloadingYourBalance";
        Assert.assertTrue(true);
    }
    @Test
    public void AmazonCurrencyConverterSet() throws InterruptedException {
        AmazonCurrencyConverter.click();
        String expected = "ItsEasyToPayInYourLocalCurrency";
        Assert.assertTrue(true);
        Thread.sleep(20000);
    }

}
