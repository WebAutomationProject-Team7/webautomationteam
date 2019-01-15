package test;

import com.relevantcodes.extentreports.ExtentReports;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FooterAmazonPaymentProducts;
import pages.FooterMakeMoneyWithUs;
import reporting.ExtentManager;

public class FooterAmazonPaymentProductsTest extends FooterAmazonPaymentProducts {
    FooterAmazonPaymentProducts footerAmazonPaymentProducts;
    //ExtentReports reports;
    @BeforeMethod
    public void setUp(){
        this.footerAmazonPaymentProducts = new FooterAmazonPaymentProducts();
        //reports = ExtentManager.getInstance();
    }
    @Test
    public void AmazonPaymentProductsSetUp() {
        AmazonRewardsVisaProducts.click();
        String actual = "EarnRewardsEverywhereYouShop";
        String expected = "EarnRewardsEverywhereYouShop";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void AmazonStoreCardDisplay(){
        AmazonStoreCard.click();
        String actual = "BecomeAnAmazonDotComStoreCardHolder";
        String expected = "BecomeAnAmazonDotComStoreCardHolder";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void AmazonBusinessCardNav(){
        AmazonBusinessCard.click();
        String actual = "AmazonBusinessAmericanExpressCard";
        String expected = "AmazonBusinessAmericanExpressCard";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void AmazonCorporateCreditLineDisplay(){
        AmazonCorporateCreditLine.click();
        String actual = "AmazonDotComCorporateCreditLine";
        String expected = "AmazonDotComCorporateCreditLine";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void ShopWithPointsNav(){
        ShopWithPoints.click();
        String actual = "UseYourFavoriteRewardsPoints";
        String expected = "UseYourFavoriteRewardsPoints";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void CreditCardMarketplaceDisplay(){
        CreditCardMarketplace.click();
        String actual = "CreditAndPaymentCards";
        String expected = "CreditAndPaymentCards";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void ReloadYourBalanceShow(){
        ReloadYourBalance.click();
        String actual = "BenefitsOfReloadingYourBalance";
        String expected = "BenefitsOfReloadingYourBalance";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void AmazonCurrencyConverterSet() throws InterruptedException {
        AmazonCurrencyConverter.click();
        String actual = "ItsEasyToPayInYourLocalCurrency";
        String expected = "ItsEasyToPayInYourLocalCurrency";
        Assert.assertEquals(actual, expected);
        Thread.sleep(20000);

    }

}
