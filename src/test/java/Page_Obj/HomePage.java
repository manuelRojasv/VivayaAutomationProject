package Page_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    WebDriver driver;
    By login_Link = By.xpath("//ul[@class='menu user-menu']//a[.='Login']");
    By press_Logout = By.xpath("//*[@id=\"accountNav\"]/ul/li/ul/li[3]/form/button");
    By press_Right_Corner = By.cssSelector("#accountNav > ul > li");
    By press_Home_Logo = By.cssSelector(".brand");
    By select_Guide = By.cssSelector("div.homepage-guides [href='/guides/1598'] > .name");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public void click_Login_Link() {
        driver.findElement(login_Link).click();
    }

    public void perform_Logout(){
        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(press_Right_Corner);
        builder.moveToElement(element).build().perform();
        driver.findElement(press_Logout).click();
    }
    public void go_To_Home(){
        driver.findElement(press_Home_Logo).click();
    }

    public void select_Event_from_Home (String eventName){
        driver.findElement(By.linkText(eventName)).click();
    }



}
