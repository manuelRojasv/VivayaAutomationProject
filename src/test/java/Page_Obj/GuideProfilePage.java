package Page_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class GuideProfilePage {
    WebDriver driver;
    By book_Workshop = By.xpath("//a[.='Book Workshop']");

    public GuideProfilePage (WebDriver driver){ this.driver = driver;}

    public void book_Workshop_from_GuideProfile(){
        driver.findElement(book_Workshop).click();
    }

    public void select_Event_from_Guide_Profile (String eventName){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(By.linkText(eventName)).click();

    }
}
