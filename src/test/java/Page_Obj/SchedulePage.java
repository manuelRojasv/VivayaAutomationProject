package Page_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SchedulePage {
    WebDriver driver;
    By Page_name=By.xpath("//h1");

    public SchedulePage(WebDriver driver){this.driver = driver;}

    public String Verify_PageName(){
        return driver.findElement(Page_name).getText();
    }
}
