package VivayaTests;

import Page_Obj.GuidesPage;
import Page_Obj.HomePage;
import Page_Obj.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchGuide {
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
            //objHome.click_Login_Link();
            //objLogin.set_Guide_Credentials("vivaya.automation.two@gmail.com", "automation2");
            //objLogin.set_Seeker_Credentials("vivaya.automation.two@gmail.com", "automation1");


        }

        System.out.println("Opening" + browserType);
    }

    /*@AfterClass
    public void Teardown() {
        driver.close();
        driver.quit();
    }*/

    @Test(enabled = false)
    public void search_Guide() throws InterruptedException {
        GuidesPage objGuides = new GuidesPage(driver);
        Thread.sleep(3000);
        objGuides.search_Guide("automation");
        WebElement sucessTest = driver.findElement(By.tagName("a"));

        System.out.println("Printing " + sucessTest.getAttribute("title"));

        //Assert.assertEquals(sucessTest, "automation user");
    }
    @Test (enabled = true)
    public void search_select_Found_Guide() throws InterruptedException {
        GuidesPage objGuides = new GuidesPage(driver);
        Thread.sleep(3000);
        objGuides.search_Guide("manu rove");
        objGuides.select_Single_Guide("manu rove");

    }


}
