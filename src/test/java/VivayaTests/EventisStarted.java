package VivayaTests;

import Page_Obj.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class EventisStarted {
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
            objLogin.set_Guide_Credentials ("manurex@manu.com", "perrodelmal");


        }

        System.out.println("Opening" + browserType);
    }

    @AfterClass
    public void exit_Browser(){
        driver.close();
        driver.quit();
    }

    @Test
    public void user_Starts_Event_Correctly () throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        DashboardPage objDash = new DashboardPage(driver);
        ClassPage classPage = new ClassPage(driver);
        objDash.open_Class();
        classPage.create_Class_Current_Date();
        Thread.sleep(3000);
        objDash.press_Start_Event();
        ArrayList<String> switchTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(switchTab.get(1));

        String url = driver.getCurrentUrl(); //Get the current URL, and compare the base URL is the same after open an Event
        String baseURL = "";
        if(url.length()>15){
            baseURL = url.substring(0, 15);
        }
        System.out.println(baseURL);
        Assert.assertEquals(baseURL, "https://zoom.us" );

    }
}
