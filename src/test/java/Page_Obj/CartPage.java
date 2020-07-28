package Page_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;
    By check_Out = By.cssSelector(".btn-primary");
    By confirm_Payment_Workshop = By.cssSelector("#stripe-form-submit");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void  checkout_Workshop (){
        driver.findElement(check_Out).click();
        driver.findElement(confirm_Payment_Workshop).click();
    }
}
