package VivayaTests;

import Page_Obj.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.w3c.dom.html.HTMLImageElement;

import java.util.concurrent.TimeUnit;

public class BookingEventTest {
    WebDriver driver;

    @BeforeClass
    @Parameters({"URL", "BrowserType"})
    public void initial_Setup(String url, String browserType) {

        if (browserType.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            HomePage objHome = new HomePage(driver);
            LoginPage objLogin = new LoginPage(driver);
            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            objHome.click_Login_Link();
            //objLogin.set_Guide_Credentials("vivaya.automation.two@gmail.com", "automation2");
            objLogin.set_Guide_Credentials("vivaya.automation.one@gmail.com", "automation1");


        }

        System.out.println("Opening" + browserType);
    }

    @AfterClass
    public void Teardown() {
        driver.close();
        driver.quit();
    }

    @Test(enabled = true, priority = 0)
    public void book_Workshop_Event() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        DashboardPage objDash = new DashboardPage(driver);
        WorkshopPage objWork = new WorkshopPage(driver);
        HomePage objHome = new HomePage(driver);
        LoginPage objLogin = new LoginPage(driver);
        GuideProfilePage objGuideProf = new GuideProfilePage(driver);
        CartPage objCart = new CartPage(driver);
        EventPageDetails objEventDetails = new EventPageDetails(driver);
        objDash.open_Workshop();
        objWork.create_Workshop();
        Thread.sleep(3000);
        objHome.perform_Logout();
        objHome.click_Login_Link();
        objLogin.set_Seeker_Credentials("vivaya.automation.two@gmail.com", "automation1");
        Thread.sleep(3000);
        driver.navigate().to("https://qa.vivayalive.com");
        objHome.select_Guide_from_Home();
        objGuideProf.book_Workshop_from_GuideProfile();
        objEventDetails.cancel_Event();
        objHome.perform_Logout();
        objHome.click_Login_Link();
        objLogin.set_Guide_Credentials("vivaya.automation.one@gmail.com", "automation1");
        objDash.cancel_an_Event();
        Thread.sleep(5000);
        //String sucessTest = driver.findElement(By.xpath("//*[@id=\"w0-success-0\"]")).getText();
        //Assert.assertEquals(sucessTest, "Event has been canceled.");
    }
}
