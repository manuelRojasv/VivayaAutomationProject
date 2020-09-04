package Page_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SchedulePage {
    WebDriver driver;
    By Page_name=By.xpath("//h1");
    By confirm_Cancel_Event = By.cssSelector(".btn-success");
    By select_Next_Day_Calendar = By.cssSelector("#schedule-search-form > div > div > div:nth-child(2) > div > ul > ul > div > div > li.slick-slide.slick-current.slick-active > a");

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

    public void book_Event_Tomorrow(String EventName){

        driver.findElement(select_Next_Day_Calendar).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        WebElement ttt = driver.findElement(By.linkText(EventName));
        if(ttt.getText().equals(EventName)){
            driver.findElement(By.cssSelector("#w0 > div:nth-child(3) > div:nth-child(8)")).click();
        }


    }

    public void cancel_Tomorrow_Event_From_Schedule(String EventName) throws InterruptedException {
        driver.findElement(By.cssSelector("div.back-button > [href='/schedule']")).click();
        driver.findElement(select_Next_Day_Calendar).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        WebElement boton = driver.findElement(By.xpath("//div[contains(@id, 'event')]  "));
        boton.click();
        /*WebElement ttt = driver.findElement(By.linkText(EventName));
        if(ttt.getText().equals(EventName)){
            Thread.sleep(3000);
            driver.findElement(By.linkText("CANCEL EVENT")).click();
            driver.findElement(confirm_Cancel_Event).click();
        }*/

    }

    public void cancel_Booked_Event_CurrentDay() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(@class,'dinamyc')]")).click();
        driver.findElement(confirm_Cancel_Event).click();

    }
}
