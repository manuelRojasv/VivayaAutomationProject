package Page_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopBar {
    WebDriver driver;
    By Schedule_link= By.xpath("//a[contains(text(),'Schedule')]");
    By Guides_link=By.xpath("//a[contains(text(),'Guides')]");
    By What_we_offer_link=By.xpath("//a[contains(text(),'What we Offer')]");
    By Pricing_link=By.xpath("//a[contains(text(),'Pricing')]");
    By Become_guide_link=By.xpath("//a[contains(text(),'Become a Guide')]");

    public TopBar(WebDriver driver) { this.driver = driver; }

    public void Press_ScheduleLink(){ driver.findElement(Schedule_link).click(); }
    public void Press_GuidesLink(){driver.findElement(Guides_link).click();}
    public void Press_WhatWeOfferLink(){driver.findElement(What_we_offer_link).click();}
    public void Press_PricingLink(){driver.findElement(Pricing_link).click();}
    public void Press_BecomeGuideLink(){driver.findElement(Become_guide_link).click();}
}
