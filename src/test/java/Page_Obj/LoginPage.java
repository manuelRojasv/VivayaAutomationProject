package Page_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    By login_Link = By.linkText("Login");
    By fill_Email = By.id("loginform-email");
    By fill_Password = By.id("loginform-password");
    By login_Button = By.name("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public void set_Guide_Credentials(String emailAccount, String passwordGuide) {
        driver.findElement(fill_Email).sendKeys(emailAccount);
        driver.findElement(fill_Password).sendKeys(passwordGuide);
        driver.findElement(login_Button).click();
    }

    public void set_Seeker_Credentials(String emailAccount, String passwordSeeker) {
        driver.findElement(fill_Email).sendKeys(emailAccount);
        driver.findElement(fill_Password).sendKeys(passwordSeeker);
        driver.findElement(login_Button).click();
    }


}
