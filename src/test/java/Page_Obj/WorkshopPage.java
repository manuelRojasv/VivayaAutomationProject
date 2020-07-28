package Page_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WorkshopPage {
    WebDriver driver;
    By event_Name = By.id("eventform-name");
    By date_Picker = By.cssSelector("#eventform-startdate");
    By workshop_Price = By.id("eventform-workshop_price");
    By add_Submit = By.xpath("//button[@class='btn btn-primary']");


    public WorkshopPage(WebDriver driver) {
        this.driver = driver;
    }

    public void create_Workshop() throws InterruptedException {
        driver.findElement(event_Name).sendKeys("Test1");
        Thread.sleep(6000);

        WebElement iFrame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iFrame);
        driver.findElement(By.tagName("body")).click();
        driver.findElement(By.tagName("body")).sendKeys("This is a Description for WORKSHOP");
        driver.switchTo().defaultContent();

        driver.findElement(By.cssSelector("i.glyphicon.glyphicon-calendar")).click();
        driver.findElement(By.xpath("//tr[5]/td[5]")).click();

        driver.findElement(workshop_Price).sendKeys("60");
        driver.findElement(add_Submit).click();


    }
}
