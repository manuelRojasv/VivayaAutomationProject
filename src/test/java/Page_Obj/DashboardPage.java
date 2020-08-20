package Page_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {

    WebDriver driver;
    By click_Start_Event = By.cssSelector("#fbStart");
    By add_new_Event = By.cssSelector("a.btn.btn-default.show-modal-btn");
    By add_Workshop = By.cssSelector("div.add-event-buttons > a.btn.btn-primary");
    By add_Session = By.xpath("//a[.='Add 1-1 Session']");
    By add_Class = By.xpath("//a[contains(text(),'Add Class')]");
    By cancel_Event = By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/p[5]/a[2]");
    By yes_Delete_Event = By.cssSelector("button.btn.btn-success");
    By Full_class_history= By.xpath("//a[contains(text(),'View My Full Class History')]");
    By Page_name=By.xpath("//h1");
    By User_Options = By.cssSelector(".uname");
    By Dashboard_link=By.linkText("Dashboard");
    By View_my_public_profile=By.xpath("(//a[contains(text(),'View My Public Profile')])[2]");
    By Contact_vivaya=By.xpath("//a[contains(text(),'Contact VIVAYA')]");
    By Write_blog_article=By.xpath("//a[contains(text(),'Write Blog Article')]");
    By Edit_my_offerings=By.xpath("//a[contains(text(),'Edit My Offerings')]");
    By Update_liability_insurance=By.xpath("//a[contains(text(),'Update Liability Insurance')]");
    By Edit_my_password=By.xpath("//a[contains(text(),'Edit My Password')]");
    By Edit_contact_information=By.xpath("//a[contains(text(),'Edit Contact Information')]");
    By Log_out= By.xpath("//button[@class='btn logout']");
    By All_upcoming_events=By.xpath("//a[contains(text(),'All upcoming events')]");
    By Edit_availability=By.xpath("//a[contains(text(),'Edit 1-1 availability')]");
    By Add_new_event=By.xpath("//a[contains(text(),'Add new event')]");
    By Add_new_event_text=By.xpath("//div[@id='modalHeader']/h2");
    By Close_add_new_event=By.cssSelector(".close:nth-child(1)");

    public DashboardPage(WebDriver driver) {

        this.driver = driver;
    }
    
    public void press_Start_Event(){
        driver.findElement(click_Start_Event).click();
    }

    public void open_Workshop() throws InterruptedException {
        driver.findElement(add_new_Event).click();
        Thread.sleep(2000);
        driver.findElement(add_Workshop).click();
    }

    public void open_One_One() throws InterruptedException {
        driver.findElement(add_new_Event).click();
        Thread.sleep(2000);
        driver.findElement(add_Session).click();
    }

    public void open_Class() throws InterruptedException {
        driver.findElement(add_new_Event).click();
        Thread.sleep(2000);
        driver.findElement(add_Class).click();
    }

    public void cancel_an_Event() throws InterruptedException{

        WebDriverWait wait1 = new WebDriverWait(driver, 3);
        WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.linkText("Cancel Event")));
        element1.click();
        Thread.sleep(2000);
        driver.findElement(yes_Delete_Event).click();
    }

    public void Press_FullClassHistory(){
        driver.findElement(Full_class_history).click();
    }

    public String Verify_PageName(){
        return driver.findElement(Page_name).getText();
    }

    public void Press_DashboardLink(){
        driver.findElement(User_Options).click();
        driver.findElement(Dashboard_link).click();
    }

    public void Press_MyPublicProfile(){
        driver.findElement(View_my_public_profile).click();
    }

    public void Press_ContactVivaya(){
        driver.findElement(Contact_vivaya).click();
    }

    public void Press_WriteBlogArticle(){
        driver.findElement(Write_blog_article).click();
    }

    public void Press_EditMyOfferings(){
        driver.findElement(Edit_my_offerings).click();
    }

    public void Press_UpdateLiabilityInsurance(){
        driver.findElement(Update_liability_insurance).click();
    }

    public void Press_EditMyPassword(){
        driver.findElement(Edit_my_password).click();
    }

    public void Press_EditContactInformation(){
        driver.findElement(Edit_contact_information).click();
    }

    public void Press_AllUpcomingEvents(){
        driver.findElement(All_upcoming_events).click();
    }

    public void Press_EditAvailability(){
        driver.findElement(Edit_availability).click();
    }

    public void Press_AddNewEvent(){
        driver.findElement(Add_new_event).click();
    }

    public String Verify_AddNewEvent(){
        return driver.findElement(Add_new_event_text).getText();
    }

    public void Close_AddNewEvent(){
        driver.findElement(Close_add_new_event).click();
    }
    public void perform_Logout(){
        driver.findElement(User_Options).click();
        driver.findElement(Log_out).click();
    }


}

