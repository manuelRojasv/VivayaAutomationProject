package Page_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SchedulePage {
    WebDriver driver;
    By Page_name=By.xpath("//h1");
    By confirm_Cancel_Event = By.cssSelector(".btn-success");

    public SchedulePage(WebDriver driver){this.driver = driver;}

    public String Verify_PageName(){
        return driver.findElement(Page_name).getText();
    }

    public void book_First_Event_CurrentDay() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(@class,'dinamyc')]")).click();


    }

    public void cancel_Booked_Event_CurrentDay() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(@class,'dinamyc')]")).click();
        driver.findElement(confirm_Cancel_Event).click();

    }
}
