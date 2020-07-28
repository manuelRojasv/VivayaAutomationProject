package Page_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class One_OnePage {
    WebDriver driver;
    By event_Name = By.id("eventform-name");
    By date_Picker = By.xpath("//input[@id='eventform-startdate']");
    By add_Submit = By.xpath("//button[@class='btn btn-primary']");

    public One_OnePage(WebDriver driver){
        this.driver = driver;
    }

    public void create_One_on_One () throws InterruptedException {
        driver.findElement(event_Name).sendKeys("Test One to One");
        Thread.sleep(2000);

        WebElement iFrame= driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iFrame);
        driver.findElement(By.tagName("body")).click();
        driver.findElement(By.tagName("body")).sendKeys("This is a Description for One on One Event");
        driver.switchTo().defaultContent();

        driver.findElement(By.cssSelector("i.glyphicon.glyphicon-calendar")).click();
        driver.findElement(By.cssSelector("th.next")).click();
        driver.findElement(By.xpath("//tr[5]/td[7]")).click();

        driver.findElement(add_Submit).click();
    }

}
