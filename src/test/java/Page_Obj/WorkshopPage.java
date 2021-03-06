package Page_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WorkshopPage {
    WebDriver driver;
    By event_Name = By.id("eventform-name");
    By date_Picker = By.cssSelector("#eventform-startdate");
    By workshop_Price = By.id("eventform-workshop_price");
    By add_Submit = By.xpath("//button[@class='btn btn-primary']");
    By clock_Icon = By.cssSelector("div.field-eventform-starttime .input-group-addon");
    By clock_Icon_Endtime = By.cssSelector("div.field-eventform-endtime .input-group-addon");
    By add_Minutes_Arrow = By.cssSelector("div.field-eventform-starttime [data-action='incrementMinute'] > .glyphicon");
    By add_Minutes_EndTime = By.cssSelector("div.field-eventform-endtime [data-action='incrementMinute']");
    By select_Next_Month_Calendar = By.cssSelector("div.datepicker-days .next");


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
        driver.findElement(select_Next_Month_Calendar).click();
        driver.findElement(By.xpath("//tr[5]/td[5]")).click();

        driver.findElement(clock_Icon).click();
        for (int i = 0; i < 2; i++){
            driver.findElement(add_Minutes_Arrow).click();
        }

        driver.findElement(By.xpath("//*[@id=\"eventform-starttime\"]")).click();

        driver.findElement(clock_Icon_Endtime).click();
        for (int i = 0; i < 5; i++){
            driver.findElement(add_Minutes_EndTime).click();
        }


        driver.findElement(workshop_Price).sendKeys("60");
        driver.findElement(add_Submit).click();


    }
}
