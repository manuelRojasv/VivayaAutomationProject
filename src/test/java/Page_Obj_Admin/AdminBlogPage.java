package Page_Obj_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminBlogPage {

    WebDriver driver;
    By Tittle_textbox= By.id("blogpostsearch-title");
    By Search_button= By.cssSelector(".box-footer > .btn");
    By Pencil_button= By.cssSelector("tr:nth-child(1) .glyphicon-pencil");
    By Message_confirmation= By.id("w2-success");
    By Erase_button= By.cssSelector(".glyphicon-trash");


    public AdminBlogPage(WebDriver driver) { this.driver = driver; }

    public void SearchBlog(String Tittle){
        driver.findElement(Tittle_textbox).click();
        driver.findElement(Tittle_textbox).sendKeys(Tittle);
        driver.findElement(Search_button).click();
    }

    public void PressEdit(){
        driver.findElement(Pencil_button).click();
    }
    public void PressErase(){
        driver.findElement(Erase_button).click();
    }

    public String Verify_BlogMessage(){
        return driver.findElement(Message_confirmation).getText();
    }
}
