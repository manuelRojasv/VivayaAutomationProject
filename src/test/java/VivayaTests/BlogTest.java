package VivayaTests;

import Page_Obj.*;
import Page_Obj_Admin.AdminBlogPage;
import Page_Obj_Admin.LeftBar;
import Page_Obj_Admin.UpdateBlogPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class BlogTest {
    WebDriver driver;

    @BeforeClass
    @Parameters({"URL", "BrowserType"})
    public void initial_Setup(String url, String browserType) {
        /*WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless"); //This line is for Headless mode in Chrome
        options.addArguments("window-size=1366x768"); //This line is for Headless mode in Chrome
        driver = new ChromeDriver(options); //This line is for Headless mode in Chrome, add options as argument
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
        Thread.sleep(3000);
        objWriteBlog.WriteContent("AUTOMATION CONTENT");
        Thread.sleep(3000);
        objWriteBlog.PressSubmit();
        Thread.sleep(3000);
        String ConfirmationMessage= objWriteBlog.Verify_ConfirmationMessage();
        Assert.assertEquals(ConfirmationMessage, "×\n" +
                "Blog post successfully submitted");
        System.out.println("Confirmation Message: " + ConfirmationMessage);
        Thread.sleep(3000);
    }

    @Test(priority = 1, enabled = true)
    public void Approbe_Blog() throws InterruptedException {
        LeftBar objLeftBar = new LeftBar(driver);
        AdminBlogPage objAdminBlog =new AdminBlogPage(driver);
        UpdateBlogPage objUpdateBlog = new UpdateBlogPage(driver);
        Page_Obj_Admin.LoginPage objLogin = new Page_Obj_Admin.LoginPage(driver);

        String a = "window.open('https://admin.dev.vivayalive.com/','_blank');";
        ((JavascriptExecutor)driver).executeScript(a);
        ArrayList<String> switchTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(switchTab.get(1));


        objLogin.Login("adminYoga@vivaya.com","VIVAYAlive2020!");
        Thread.sleep(3000);
        objLeftBar.Press_Blog();
        Thread.sleep(3000);
        objLeftBar.Press_BlogList();
        objAdminBlog.SearchBlog("AUTOMATION TITTLE");
        Thread.sleep(3000);
        objAdminBlog.PressEdit();
        Thread.sleep(3000);
        objUpdateBlog.SelectStatus("Published");
        objUpdateBlog.PressSubmit();
        Thread.sleep(3000);
        String Message= objAdminBlog.Verify_BlogMessage();
        Assert.assertEquals(Message, "×\n" +
                "Blog post successfully submitted");
        System.out.println("Published Blog Message: " + Message);
        Thread.sleep(3000);

    }

    @Test(priority = 2, enabled = true)
    public void VerifyBlog() throws InterruptedException {
        BottomBar objBottom= new BottomBar(driver);
        BlogPage objBlog= new BlogPage(driver);

        ArrayList<String> switchTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(switchTab.get(0));
        Thread.sleep(3000);

        objBottom.Press_BlogLink();
        String Blog=objBlog.Verify_BlogName();
        Assert.assertEquals(Blog, "AUTOMATION TITTLE");
        System.out.println("Blog: " + Blog);
        Thread.sleep(3000);

    }

    @Test(priority = 3, enabled = true)
    public void EraseBlog() throws InterruptedException, AWTException {
        AdminBlogPage objAdminBlog = new AdminBlogPage(driver);
        Robot robot = new Robot();


        ArrayList<String> switchTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(switchTab.get(1));
        Thread.sleep(3000);

        objAdminBlog.SearchBlog("AUTOMATION TITTLE");
        Thread.sleep(3000);
        objAdminBlog.PressErase();
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        String Message = objAdminBlog.Verify_BlogMessage();
        Assert.assertEquals(Message, "×\n" +
                "Blog post successfully deleted");
        System.out.println("Deleted Blog Message: " + Message);
        Thread.sleep(5000);

    }



    @AfterClass
    public void close(){
        ArrayList<String> switchTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(switchTab.get(1));
        driver.close();
        driver.switchTo().window(switchTab.get(0));
        driver.close();
    }
}
