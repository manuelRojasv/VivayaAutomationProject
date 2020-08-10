package Page_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhatWeOfferPage {
    WebDriver driver;
    By Page_name=By.xpath("//h1");
    By Anusara_yoga_link=By.linkText("Anusara Yoga");
    By Ashtanga_yoga_link=By.linkText("Ashtanga Yoga");
    By Family_yoga_link=By.linkText("Family Yoga");
    By Hatha_yoga_link=By.linkText("Hatha Yoga");
    By Iyengar_yoga_link=By.linkText("Iyengar Yoga");
    By Yin_yoga_link=By.linkText("Yin Yoga");
    By Jivamukti_yoga_link=By.linkText("Jivamukti Yoga");
    By Katonah_yoga_link=By.linkText("Katonah Yoga");
    By Kula_yoga_link=By.linkText("Kula Yoga");
    By Kundalini_yoga_link=By.linkText("Kundalini Yoga");
    By Nidra_yoga_link=By.linkText("Nidra Yoga");


    public WhatWeOfferPage(WebDriver driver){this.driver = driver;}

    public String Verify_PageName(){
        return driver.findElement(Page_name).getText();
    }
}
