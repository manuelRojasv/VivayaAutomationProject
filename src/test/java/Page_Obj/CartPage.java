package Page_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;
    By check_Out = By.cssSelector(".btn-primary");
    By confirm_Payment_Workshop = By.cssSelector("#stripe-form-submit");

    By Remove_button=By.linkText("Remove");
    By Yes_button=By.cssSelector(".btn-success");
    By Remove_message=By.xpath("//div[@id='w0-success-0']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void  checkout_Workshop (){
        driver.findElement(check_Out).click();
        driver.findElement(confirm_Payment_Workshop).click();
    }

    public void Press_Remove(){driver.findElement(Remove_button).click();}
    public void Press_Yes(){driver.findElement(Yes_button).click();}
    public String Verify_RemoveMessage(){
        return driver.findElement(Remove_message).getText();
    }
}
