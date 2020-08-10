package Page_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GuidesPage {
    WebDriver driver;

    By press_Guides_Tab = By.cssSelector("a[href='/guides']");
    By search_Input = By.id("guidesearch-q");
    By search_Button = By.cssSelector("button.btn.btn-primary.vertical-center");

    public GuidesPage(WebDriver driver){this.driver = driver;}

    public void search_Guide(String guideName){
        //WebElement GuideLink = driver.findElement(By.xpath("//*[@id=\"mainNav\"]/li[5]/a"));
        //GuideLink.click();
        driver.findElement(press_Guides_Tab).click();
        driver.findElement(search_Input).sendKeys(guideName);
        driver.findElement(search_Button).click();

    }
    public void select_Single_Guide(String guideName){

        driver.findElement(By.linkText(guideName)).click();
    }
    
}
