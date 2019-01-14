package pages;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPageGetToKnowUs extends CommonApi {
    public FooterPageGetToKnowUs(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id='navFooter']/div[1]/div/div[1]/ul/li[1]/a")
    public static WebElement Careers;
    public void setCareers (WebElement Careers){
        FooterPageGetToKnowUs.Careers = Careers;
        Careers.click();
    }
    @FindBy(xpath = "//*[@id='navFooter']/div[1]/div/div[1]/ul/li[2]/a")
    public static WebElement Blog;
    public void setBlog (WebElement Blog){
        FooterPageGetToKnowUs.Blog = Blog;
        Blog.click();
    }
    @FindBy(xpath = "//*[@id='navFooter']/div[1]/div/div[1]/ul/li[3]/a")
    public static WebElement AboutAmazon;
    public void setAboutAmazon (WebElement AboutAmazon){
        FooterPageGetToKnowUs.AboutAmazon = AboutAmazon;
        AboutAmazon.click();
    }
    @FindBy(xpath = "//*[@id='navFooter']/div[1]/div/div[1]/ul/li[4]/a")
    public static WebElement PressCenter;
    public void setPressCenter (WebElement PressCenter){
        FooterPageGetToKnowUs.PressCenter = PressCenter;
        PressCenter.click();
    }
    @FindBy(xpath = "//*[@id='navFooter']/div[1]/div/div[1]/ul/li[5]/a")
    public static WebElement InvestorRelations;
    public void setInvestorRelations (WebElement InvestorRelations){
        FooterPageGetToKnowUs.InvestorRelations = InvestorRelations;
        InvestorRelations.click();
    }
    @FindBy(xpath = "//*[@id='navFooter']/div[1]/div/div[1]/ul/li[6]/a")
    public static WebElement AmazonDevices;
    public void setAmazonDevices(WebElement AmazonDevices){
        FooterPageGetToKnowUs.AmazonDevices = AmazonDevices;
        AmazonDevices.click();
    }


}
