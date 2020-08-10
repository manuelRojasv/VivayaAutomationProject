package Page_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BottomBar {
    WebDriver driver;
    By About_link =By.linkText("About");
    By Become_a_guide_link=By.linkText("Become a Guide");
    By Workshops_link=By.linkText("Workshops");
    By Blog_link=By.linkText("Blog");
    By Contact_link=By.linkText("Contact");
    By Privacy_policy_link=By.linkText("Privacy Policy");
    By Terms_conditions_link=By.linkText("Terms & Conditions");
    By About_page=By.xpath("//div[@id='banner']");
    By Page_name=By.xpath("//h1");

    public BottomBar(WebDriver driver) { this.driver = driver; }

    public void Press_AboutLink(){ driver.findElement(About_link).click(); }
    public void Press_BecomeGuideLink(){ driver.findElement(Become_a_guide_link).click(); }
    public void Press_WorkshopsLink(){ driver.findElement(Workshops_link).click(); }
    public void Press_BlogLink(){ driver.findElement(Blog_link).click(); }
    public void Press_ContactLink(){ driver.findElement(Contact_link).click(); }
    public void Press_PrivacyPolicyLink(){ driver.findElement(Privacy_policy_link).click(); }
    public void Press_TermsConditionsLink(){ driver.findElement(Terms_conditions_link).click(); }

    public String Verify_AboutPage(){
        return driver.findElement(About_page).getText();
    }

    public String Verify_PageName(){
        return driver.findElement(Page_name).getText();
    }

}
