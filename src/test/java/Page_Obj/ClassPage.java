package Page_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassPage {
    WebDriver driver;
    By event_Name = By.id("eventform-name");
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
        driver.findElement(By.tagName("body")).sendKeys("This is a Description for a simple Class");
        driver.switchTo().defaultContent();

        driver.findElement(By.cssSelector("i.glyphicon.glyphicon-calendar")).click();
        driver.findElement(By.xpath("//tr[5]/td[5]")).click();
        //td[data-date='1596067200000']

        driver.findElement(add_Submit).click();
    }
}
