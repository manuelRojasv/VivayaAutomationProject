package Page_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BecomeGuidePage {
    WebDriver driver;
    By Page_name=By.xpath("//div[2]/div/div[2]/div/div[2]/h2");

    public BecomeGuidePage(WebDriver driver){this.driver = driver;}

    public String Verify_PageName(){
        return driver.findElement(Page_name).getText();
    }
}
