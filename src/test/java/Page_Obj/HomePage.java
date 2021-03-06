package Page_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class HomePage {
    WebDriver driver;
    By login_Link = By.xpath("//ul[@class='menu user-menu']//a[.='Login']");
    By press_Logout = By.cssSelector("driver.findElement(By.cssSelector(\"#schedule-search-form > div > div > div:nth-child(2) > div > ul > ul > div > div > li.slick-slide.slick-current.slick-active > a\")).click();");
    By press_Right_Corner = By.cssSelector("#accountNav > ul > li");
    By press_Home_Logo = By.cssSelector("#header > a");
    By confirm_Cancel_Event = By.cssSelector(".btn-success");
    By select_Guide = By.cssSelector("div.homepage-guides [href='/guides/1598'] > .name");
    //Home Page Links
    By Free_trial_link=By.linkText("START YOUR 14 DAY FREE TRIAL NOW");
    By Yoga_link=By.cssSelector(".yoga");
    By Meditation_link=By.cssSelector(".meditation");
    By Nutrition_link=By.cssSelector(".nutrition");
    By Healing_art_link=By.cssSelector(".healing-arts-and-reiki > .image-overlay-text");
    By Coaching_link=By.cssSelector(".coaching");
    By Astrology_link=By.cssSelector(".astrology-and-spiritual-counseling");
    By View_full_schedule_link=By.xpath("//a[contains(text(),'View full Schedule')]");
    By View_all_guides_link=By.cssSelector(".container > .btn:nth-child(3)");
    By Become_guide_link=By.cssSelector(".btn-simple");
    By Page_name=By.xpath("//h1");
    By Free_trial_page_name=By.cssSelector(".col-lg-offset-2");
    By Book_your_next_class_link=By.linkText("BOOK YOUR NEXT CLASS");
    By Home_link=By.cssSelector(".brand");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void setProperty (){System.setProperty("java.awt.headless", "true");
        Toolkit tk = Toolkit.getDefaultToolkit();
        // Standard beep is available.
        tk.beep();}
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

    public void book_First_Upcoming_Event() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(@class,'dinamyc')]")).click();


    }

    public void cancel_Booking_from_Upcoming_Event() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(@class,'dinamyc')]")).click();
       // driver.findElement(confirm_Cancel_Event).click();

    }   

    public void Press_FreeTrialLink(){driver.findElement(Free_trial_link).click();}
    public void Press_YogaLink(){driver.findElement(Yoga_link).click();}
    public void Press_MeditationLink(){driver.findElement(Meditation_link).click();}
    public void Press_NutritionLink(){driver.findElement(Nutrition_link).click();}
    public void Press_HealingArtLink(){driver.findElement(Healing_art_link).click();}
    public void Press_CoachingLink(){driver.findElement(Coaching_link).click();}
    public void Press_AstrologyLink(){driver.findElement(Astrology_link).click();}
    public void Press_ViewFullScheduleLink(){driver.findElement(View_full_schedule_link).click();}
    public void Press_ViewAllGuidesLink(){driver.findElement(View_all_guides_link).click();}
    public void Press_BecomeGuideLink(){driver.findElement(Become_guide_link).click();}
    public void Press_BookYourNextClassLink(){driver.findElement(Book_your_next_class_link).click();}
    public void Press_Home(){driver.findElement(Home_link).click();}

    public String Verify_PageName(){
        return driver.findElement(Page_name).getText();
    }
    public String Verify_FreeTrialName(){return driver.findElement(Free_trial_page_name).getText();}



}
