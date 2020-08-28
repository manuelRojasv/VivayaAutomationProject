package VivayaTests;

import Page_Obj.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import Page_Obj.HomePage;

public class BasicTests {
    WebDriver driver;


    @BeforeClass
    @Parameters({"URL", "BrowserType"})
    public void initial_Setup(String url, String browserType) {
        /*WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless"); //This line is for Headless mode in Chrome
        options.addArguments("window-size=1366x768"); //This line is for Headless mode in Chrome
        driver = new ChromeDriver(options); //This line is for Headless mode in Chrome, add options as argument
        driver.get("https://qa.vivayalive.com");
        //driver.manage().window().maximize();*/
        if (browserType.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();

        }


        System.out.println("Opening" + browserType);
    }

    @AfterTest
    public void closeSession() {
        driver.close();
        driver.quit();
    }

    @Test(priority = 0, enabled = true)
    public void verify_Valid_Guide_Login() throws InterruptedException {
        HomePage objHome = new HomePage(driver);
        LoginPage objLogin = new LoginPage(driver);
        objHome.click_Login_Link();
        objLogin.set_Seeker_Credentials("manurex@manu.com", "perrodelmal");
        Thread.sleep(3000);
        objHome.perform_Logout();


    }

    @Test(priority = 1, enabled = true)
    public void verify_Valid_Seeker_Login() throws InterruptedException {
        HomePage objHome = new HomePage(driver);
        LoginPage objLogin = new LoginPage(driver);
        objHome.click_Login_Link();
        objLogin.set_Seeker_Credentials("horcosio@gmail.com", "perrodelmal");
        Thread.sleep(3000);
        objHome.perform_Logout();
    }


}
