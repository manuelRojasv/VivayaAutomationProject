package Page_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeekerDashboardPage {
    WebDriver driver;
    By User_Options = By.cssSelector(".uname");
    By Log_out = By.xpath("//button[@class='btn logout']");
    By My_password=By.xpath("//a[contains(text(),'My Password')]");
    By Payment_information=By.xpath("//a[contains(text(),'Payment Information')]");
    By My_account=By.xpath("//a[contains(text(),'My Account')]");
    By Membership_cancellation=By.xpath("//a[contains(text(),'Membership Cancellation')]");
    By Shopping_cart=By.xpath("//a[contains(text(),'Shopping Cart')]");
    By Contact_vivaya=By.xpath("//a[contains(text(),'Contact VIVAYA')]");
    By Page_name=By.xpath("//h1");
    By Dashboard_link=By.linkText("Dashboard");
    By Membership_cancellation_popup=By.cssSelector(".bootbox-body");
    By Membership_cancellation_close=By.xpath("//button[contains(.,'×')]");

    public SeekerDashboardPage(WebDriver driver){this.driver = driver;}

    public void Press_MyPassword(){
        driver.findElement(My_password).click();
    }

    public void Press_PaymentInformation(){
        driver.findElement(Payment_information).click();
    }

    public void Press_MyAccount(){
        driver.findElement(My_account).click();
    }

    public void Press_DashboardLink(){
        driver.findElement(User_Options).click();
        driver.findElement(Dashboard_link).click();
    }

    public void Press_MembershipCancellation(){
        driver.findElement(Membership_cancellation).click();
    }

    public void Press_ShoppingCart(){
        driver.findElement(Shopping_cart).click();
    }

    public void Press_ContactVivaya(){
        driver.findElement(Contact_vivaya).click();
    }

    public String Verify_PageName(){
        return driver.findElement(Page_name).getText();
    }

    public String Verify_MembershipCancellation(){
        return driver.findElement(Membership_cancellation_popup).getText();
    }

    public void Close_MembershipCancellation(){
        driver.findElement(Membership_cancellation_close).click();
    }

    public void perform_Logout(){
        driver.findElement(User_Options).click();
        driver.findElement(Log_out).click();
    }

}
