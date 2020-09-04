package Page_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WriteBlogPage {
    WebDriver driver;
    By Tittle_Textbox=By.id("blogpost-title");
    By Offerings_Textbox=By.cssSelector(".select2-search__field");
    By Offering_Scrollbar=By.cssSelector("html");
    By Content_Textbox=By.xpath("//p");
    By Submit_Button=By.cssSelector(".btn:nth-child(1)");
    By Frame=By.tagName("iframe");
    By Confirmation_Message=By.id("w0-success-0");



    public WriteBlogPage(WebDriver driver){this.driver = driver;}
    public void WriteTittle(String Tittle) { driver.findElement(Tittle_Textbox).sendKeys(Tittle); }
    public void PressSubmit(){driver.findElement(Submit_Button).click();}

    public void ChooseOfferings()
    {
        driver.findElement(Offerings_Textbox).click();
        driver.findElement(Offering_Scrollbar).click();
    }

    public void WriteContent(String Content)
    {
        WebElement iFrame = driver.findElement(Frame);
        driver.switchTo().frame(iFrame);
        driver.findElement(Content_Textbox).sendKeys(Content);
        driver.switchTo().defaultContent();
    }

    public String Verify_ConfirmationMessage(){
        return driver.findElement(Confirmation_Message).getText();
    }



}
