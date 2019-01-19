package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FooterAmazonPaymentProducts;

public class FooterAmazonPaymentProductsTest extends FooterAmazonPaymentProducts {
    FooterAmazonPaymentProducts footerAmazonPaymentProducts;
    //ExtentReports reports;
    @BeforeMethod
    public void setUp(){
        this.footerAmazonPaymentProducts = new FooterAmazonPaymentProducts();
        //reports = ExtentManager.getInstance();
    }
    @Test
    public String AmazonPaymentProductsSetUp() {
        AmazonRewardsVisaProducts.click();
        String actual = AmazonPaymentProductsSetUp();
        String expected = "EarnRewardsEverywhereYouShop";
        Assert.assertEquals(actual, expected);
        return actual;
    }
    @Test
    public String AmazonStoreCardDisplay(){
        AmazonStoreCard.click();
        String actual = AmazonStoreCardDisplay();
        String expected = "BecomeAnAmazonDotComStoreCardHolder";
        Assert.assertEquals(actual, expected);
        return actual;
    }
    @Test
    public String AmazonBusinessCardNav(){
        AmazonBusinessCard.click();
        String actual = AmazonBusinessCardNav();
        String expected = "AmazonBusinessAmericanExpressCard";
        Assert.assertEquals(actual, expected);
        return actual;
    }
    @Test
    public String AmazonCorporateCreditLineDisplay(){
        AmazonCorporateCreditLine.click();
        String actual = AmazonCorporateCreditLineDisplay();
        String expected = "AmazonDotComCorporateCreditLine";
        Assert.assertEquals(actual, expected);
        return actual;
    }
    @Test
    public String ShopWithPointsNav(){
        ShopWithPoints.click();
        String actual =  ShopWithPointsNav();
        String expected = "UseYourFavoriteRewardsPoints";
        Assert.assertEquals(actual, expected);
        return actual;
    }
    @Test
    public String CreditCardMarketplaceDisplay(){
        CreditCardMarketplace.click();
        String actual = CreditCardMarketplaceDisplay();
        String expected = "CreditAndPaymentCards";
        Assert.assertEquals(actual, expected);
        return actual;
    }
    @Test
    public String ReloadYourBalanceShow(){
        ReloadYourBalance.click();
        String actual =  ReloadYourBalanceShow();
        String expected = "BenefitsOfReloadingYourBalance";
        Assert.assertEquals(actual, expected);
        return actual;
    }
    @Test
    public String AmazonCurrencyConverterSet() throws InterruptedException {
        AmazonCurrencyConverter.click();
        String actual = AmazonCurrencyConverterSet();
        String expected = "ItsEasyToPayInYourLocalCurrency";
        Assert.assertEquals(actual, expected);
        Thread.sleep(20000);

        return actual;
    }

}
