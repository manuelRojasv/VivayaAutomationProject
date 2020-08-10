package Page_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PricingPage {
    WebDriver driver;
    By Page_name=By.xpath("//h2[contains(.,'Memberships')]");

    public PricingPage(WebDriver driver){this.driver = driver;}

    public String Verify_PageName(){
        return driver.findElement(Page_name).getText();
    }
}
