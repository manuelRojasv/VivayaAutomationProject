package VivayaTests;

import Page_Obj.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WriteBlogTest {
    WebDriver driver;

    @BeforeClass
    public void initial_Setup() {
        WebDriverManager.chromedriver().setup();;
        driver = new ChromeDriver();
        driver.get("https://dev.vivayalive.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        /*WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless"); //This line is for Headless mode in Chrome
        options.addArguments("window-size=1366x768"); //This line is for Headless mode in Chrome
        driver = new ChromeDriver(options); //This line is for Headless mode in Chrome, add options as argument
        driver.get("https://dev.vivayalive.com");*/

        /*if (browserType.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        }

        System.out.println("Opening" + browserType);*/
    }

    @Test (priority = 0, enabled = true)
    public void CreateBlog() throws InterruptedException {
        HomePage objHome = new HomePage(driver);
        LoginPage objLogin = new LoginPage(driver);
        DashboardPage objDashboard = new DashboardPage(driver);
        WriteBlogPage objWriteBlog = new WriteBlogPage(driver);
        Thread.sleep(3000);
        objHome.click_Login_Link();
        objLogin.set_Guide_Credentials("valeria.fernandez@believesol.com", "user7890");
        Thread.sleep(3000);
        objDashboard.Press_WriteBlogArticle();
        String PageName= objDashboard.Verify_PageName();
        Assert.assertEquals(PageName, "Write blog post");
        System.out.println("Write Blog Article: " + PageName);
        objWriteBlog.WriteTittle("AUTOMATION TITTLE");
        Thread.sleep(3000);
        objWriteBlog.ChooseOfferings();
        Thread.sleep(3000);
        objWriteBlog.UploadImage("D:\\BLOG.JPG");
        objWriteBlog.WriteContent("AUTOMATION CONTENT");
        Thread.sleep(3000);
        objWriteBlog.PressSubmit();
        Thread.sleep(3000);
        String ConfirmationMessage= objWriteBlog.Verify_ConfirmationMessage();
        Assert.assertEquals(ConfirmationMessage, "×\n" +
                "Blog post successfully submitted");
        System.out.println("Confirmation Message: " + ConfirmationMessage);
    }



    @AfterClass
    public void close(){
        driver.close();
    }
}
