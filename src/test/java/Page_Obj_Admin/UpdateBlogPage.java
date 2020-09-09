package Page_Obj_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class UpdateBlogPage {

    WebDriver driver;
    By Status_button= By.id("blogpost-status");
    By Save_button = By.cssSelector(".btn-primary");
    public UpdateBlogPage(WebDriver driver) { this.driver = driver; }

    public void SelectStatus(String Status){
        Select select= new Select (driver.findElement(Status_button));
        select.selectByVisibleText(Status);
    }

    public void PressSubmit(){
        driver.findElement(Save_button).click();
    }

}
