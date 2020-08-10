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
    By Guides_Link= By.xpath("//a[contains(text(),'Guides')]");
    By Search_Field= By.id("guidesearch-q");
    By Search_button= By.xpath("//form[@id='guides-search-form']/div/div[3]/button");
    By Guide_name= By.linkText("valeria fernandez");
    By Guide_name_info=By.xpath("//h1");
    By Page_name=By.xpath("//h1");

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


    /*public void search_Guide(String guideName){
        driver.findElement(Guides_Link).click();
        driver.findElement(Search_Field).sendKeys(guideName);
        driver.findElement(Search_button).click();
        driver.findElement(Guide_name).click();
    }*/

    public String verify_Guide_name(){
        return driver.findElement(Guide_name_info).getText();
    }

    public String Verify_PageName(){
        return driver.findElement(Page_name).getText();
    }




}
