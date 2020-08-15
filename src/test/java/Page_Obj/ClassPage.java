package Page_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class ClassPage {
    WebDriver driver;
    By event_Name = By.id("eventform-name");
    By start_Date_Field = By.cssSelector("#eventform-startdate");
    By add_Minutes_Arrow = By.cssSelector("a[data-action='incrementMinute']");
    By clock_Icon = By.cssSelector(".glyphicon-time");
    By date_Picker = By.xpath("//input[@id='eventform-startdate']");
    By add_Submit = By.xpath("//button[@class='btn btn-primary']");

    public ClassPage(WebDriver driver) {
        this.driver = driver;
    }

    public void create_Class() throws InterruptedException {
        driver.findElement(event_Name).sendKeys("Test Class creation");
        Thread.sleep(2000);

        WebElement iFrame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iFrame);
        driver.findElement(By.tagName("body")).click();
        driver.findElement(By.tagName("body")).sendKeys("This is a Description");
        driver.switchTo().defaultContent();

        driver.findElement(By.cssSelector("i.glyphicon.glyphicon-calendar")).click();
        driver.findElement(By.xpath("//tr[5]/td[5]")).click();
        driver.findElement(add_Submit).click();
    }

    public void create_Class_Current_Date() throws InterruptedException {

        driver.findElement(event_Name).sendKeys("Event to Start now");
        Thread.sleep(3000);

        WebElement iFrame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iFrame);
        driver.findElement(By.tagName("body")).click();
        driver.findElement(By.tagName("body")).sendKeys("This is a Description for the Event that should start now");
        driver.switchTo().defaultContent();


        driver.findElement(clock_Icon).click();
        for (int i = 0; i < 5; i++){
            driver.findElement(add_Minutes_Arrow).click();
        }

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDateTime now = LocalDateTime.now();

        driver.findElement(start_Date_Field).sendKeys(dtf.format(now));
        driver.findElement(By.cssSelector("#eventform-startdate")).sendKeys(Keys.RETURN);
        driver.findElement(add_Submit).click();


    }
}
