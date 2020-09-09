package Page_Obj_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By Email_Textbox=By.id("loginform-email");
    By Password_Textbox=By.id("loginform-password");
    By Login_button=By.cssSelector(".btn");

    public LoginPage(WebDriver driver){this.driver = driver;}

    public void Login(String Email,String Password){
        driver.findElement(Email_Textbox).sendKeys(Email);
        driver.findElement(Password_Textbox).sendKeys(Password);
        driver.findElement(Login_button).click();
    }
}
