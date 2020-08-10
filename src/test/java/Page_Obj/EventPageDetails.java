package Page_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EventPageDetails {
    WebDriver driver;
    By book_button_from_Event_Detail = By.cssSelector("a.btn");
    By cancel_Event = By.xpath("//a[.='Cancel Event']");
    By yes_Delete_Event = By.cssSelector("button.btn.btn-success");

    public EventPageDetails(WebDriver driver) {
        this.driver = driver;
    }

    public void select_book_Button_from_Event_Detail (){
        driver.findElement(book_button_from_Event_Detail).click();

    }
    public void cancel_Event() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(cancel_Event).click();
        driver.findElement(yes_Delete_Event).click();

    }
}
