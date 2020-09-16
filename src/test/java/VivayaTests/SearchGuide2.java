package VivayaTests;

import Page_Obj.GuidesPage;
import Page_Obj.HomePage;
import Page_Obj.LoginPage;
import Page_Obj.SeekerDashboardPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchGuide2 {
    WebDriver driver;

    @BeforeClass
    @Parameters({"URL", "BrowserType"})
    public void initial_Setup(String url, String browserType) {
        /*WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless"); //This line is for Headless mode in Chrome
        options.addArguments("window-size=1366x768"); //This line is for Headless mode in Chrome
        driver = new ChromeDriverCreator(options); //This line is for Headless mode in Chrome, add options as argument
        driver.get("https://dev.vivayalive.com");*/

        if (browserType.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        }

        System.out.println("Opening" + browserType);
    }

    @Test (priority = 0, enabled = false)
    public void login_search_Guide() throws InterruptedException {
        HomePage objHome = new HomePage(driver);
        LoginPage objLogin = new LoginPage(driver);
        SeekerDashboardPage objSeeker = new SeekerDashboardPage(driver);
        GuidesPage objGuides = new GuidesPage(driver);
        Thread.sleep(3000);
        objHome.click_Login_Link();
        objLogin.set_Seeker_Credentials("valeria1208@outlook.com", "user7890");
        Thread.sleep(3000);
        objGuides.search_Guide("valeria guide");
        objGuides.select_Single_Guide("valeria guide");
        String GuideName=objGuides.verify_Guide_name();
        Assert.assertEquals(GuideName, "valeria guide");
        System.out.println("Guide: " + GuideName);
        objSeeker.perform_Logout();
    }

    @Test (priority = 1, enabled = true)
    public void search_Guide() throws InterruptedException {
        GuidesPage objGuides = new GuidesPage(driver);
        Thread.sleep(3000);
        objGuides.search_Guide("valeria guide");
        objGuides.select_Single_Guide("valeria guide");
        String GuideName=objGuides.verify_Guide_name();
        Assert.assertEquals(GuideName, "valeria guide");
        System.out.println("Guide: " + GuideName);

    }

    @AfterClass
    public void close(){
        driver.close();
    }

}
