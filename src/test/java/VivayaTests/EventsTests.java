package VivayaTests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import Page_Obj.HomePage;
import Page_Obj.WorkshopPage;
import Page_Obj.One_OnePage;
import Page_Obj.ClassPage;
import Page_Obj.DashboardPage;
import Page_Obj.LoginPage;

import java.util.concurrent.TimeUnit;

public class EventsTests {
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
            objLogin.set_Guide_Credentials("manurex@manu.com", "perrodelmal");


        }


        System.out.println("Opening" + browserType);
    }

    @AfterClass
    public void closeSession() {
        driver.close();
        driver.quit();
    }

    @Test(enabled = true, priority = 0)
    public void create_Workshop_Event() throws InterruptedException {

        DashboardPage objDash = new DashboardPage(driver);
        WorkshopPage objWork = new WorkshopPage(driver);
        Thread.sleep(3000);
        objDash.open_Workshop();
        objWork.create_Workshop();
        Thread.sleep(3000);
        String sucess = driver.findElement(By.cssSelector("div.dashboard-events span")).getText();
        Assert.assertEquals(sucess, "WORKSHOP");
        Thread.sleep(2000);
        objDash.cancel_an_Event();
    }

    /*@Test(enabled = true, priority = 1)
    public void create_One_One() throws InterruptedException {
        DashboardPage objDash = new DashboardPage(driver);
        One_OnePage objOnetoOne = new One_OnePage(driver);
        Thread.sleep(3000);
        objDash.open_One_One();
        objOnetoOne.create_One_on_One();
        Thread.sleep(2000);
        objDash.cancel_an_Event();

    }*/

    @Test(enabled = true, priority = 2)
    public void create_Class() throws InterruptedException {
        DashboardPage objDash = new DashboardPage(driver);
        ClassPage objClass = new ClassPage(driver);
        Thread.sleep(3000);
        objDash.open_Class();
        objClass.create_Class();
        Thread.sleep(2000);
        objDash.cancel_an_Event();
    }


}
