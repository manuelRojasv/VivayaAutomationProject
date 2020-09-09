package Page_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlogPage {
    WebDriver driver;
    By Blog_name=By.linkText("AUTOMATION TITTLE");

    public BlogPage(WebDriver driver) { this.driver = driver; }

    public String Verify_BlogName(){
        return driver.findElement(Blog_name).getText();
    }
}
