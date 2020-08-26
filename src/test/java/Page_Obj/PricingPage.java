package Page_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PricingPage {
    WebDriver driver;
    By Pricing_page=By.xpath("//h2[contains(.,'Memberships')]");
    By Try_now_link=By.cssSelector(".textUp:nth-child(1)");
    By Subscribe_Monthly_link=By.cssSelector(".recommended .btn");
    By Subscribe_Annually_link=By.cssSelector(".box-shadow > .membership-timebased-list-item-content > .btn");
    By Buy_now_1_link=By.cssSelector(".p1-class > .btn");
    By Buy_now_5_pack=By.cssSelector(".p5-pack > .btn");
    By Buy_now_10_pack=By.cssSelector(".p10-pack > .btn");
    By View_all_events_link=By.cssSelector(".slick-current > .other-offerings-item > .btn");
    By Find_guide_link=By.cssSelector(".col-sm-6:nth-child(2) > .other-offerings-item > .btn");
    By Page_name=By.xpath("//h1");
    By Free_trial_name=By.xpath("//h2[contains(.,'Try 14 days of FREE unlimited yoga classes')]");



    public PricingPage(WebDriver driver){this.driver = driver;}

    public String Verify_PageName(){
        return driver.findElement(Pricing_page).getText();
    }

    public void Press_TryNow(){driver.findElement(Try_now_link).click();}
    public void Press_SubscribeMonthly(){driver.findElement(Subscribe_Monthly_link).click();}
    public void Press_SubscribeAnnually(){driver.findElement(Subscribe_Annually_link).click();}
    public void Press_BuyNow1(){driver.findElement(Buy_now_1_link).click();}
    public void Press_BuyNow5(){driver.findElement(Buy_now_5_pack).click();}
    public void Press_BuyNow10(){driver.findElement(Buy_now_10_pack).click();}
    public void Press_ViewAllEvents(){driver.findElement(View_all_events_link).click();}
    public void Press_FindGuide(){driver.findElement(Find_guide_link).click();}

    public String Verify_PagesName(){return driver.findElement(Page_name).getText();}
    public String Verify_FreeTrialName(){return driver.findElement(Free_trial_name).getText();}
}
