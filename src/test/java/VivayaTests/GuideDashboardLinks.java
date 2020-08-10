package VivayaTests;

import Page_Obj.DashboardPage;
import Page_Obj.HomePage;
import Page_Obj.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GuideDashboardLinks {
    WebDriver driver;

    @BeforeClass
    @Parameters({"URL", "BrowserType"})
    public void initial_Setup(String url, String browserType) {

        if (browserType.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        }

        System.out.println("Opening" + browserType);
    }

    @Test
    public void Verify_QuickLinks() throws InterruptedException {
        HomePage objHome = new HomePage(driver);
        LoginPage objLogin = new LoginPage(driver);
        DashboardPage objDashboard = new DashboardPage(driver);
        Thread.sleep(3000);
        objHome.click_Login_Link();
        objLogin.set_Guide_Credentials("valeria@guide.com", "user7890");
        Thread.sleep(3000);
        objDashboard.Press_FullClassHistory();
        String PageName1=objDashboard.Verify_PageName();
        Assert.assertEquals(PageName1, "Full Class History");
        System.out.println("View my full history class: " + PageName1);
        objDashboard.Press_DashboardLink();
        objDashboard.Press_MyPublicProfile();
        String PageName2= objDashboard.Verify_PageName();
        Assert.assertEquals(PageName2, "valeria fernandez");
        System.out.println("View my public profile: " + PageName2);
        objDashboard.Press_DashboardLink();
        objDashboard.Press_ContactVivaya();
        String PageName3= objDashboard.Verify_PageName();
        Assert.assertEquals(PageName3, "Contact");
        System.out.println("Contact VIVAYA: " + PageName3);
        objDashboard.Press_DashboardLink();
        objDashboard.Press_WriteBlogArticle();
        String PageName4= objDashboard.Verify_PageName();
        Assert.assertEquals(PageName4, "Write blog post");
        System.out.println("Write Blog Article: " + PageName4);
        objDashboard.Press_DashboardLink();
        objDashboard.Press_EditMyOfferings();
        String PageName5= objDashboard.Verify_PageName();
        Assert.assertEquals(PageName5, "Offerings");
        System.out.println("Edit my offerings: " + PageName5);
        objDashboard.Press_DashboardLink();
        objDashboard.Press_UpdateLiabilityInsurance();
        String PageName6= objDashboard.Verify_PageName();
        Assert.assertEquals(PageName6, "Liability Insurance");
        System.out.println("Update liability insurance: " + PageName6);
        objDashboard.Press_DashboardLink();
        objDashboard.Press_EditMyPassword();
        String PageName7= objDashboard.Verify_PageName();
        Assert.assertEquals(PageName7, "Account Information");
        System.out.println("Edit my password: " + PageName7);
        objDashboard.Press_DashboardLink();
        objDashboard.Press_EditContactInformation();
        String PageName8= objDashboard.Verify_PageName();
        Assert.assertEquals(PageName8, "Profile Information");
        System.out.println("Edit contact information: " + PageName8);
        //objDashboard.perform_Logout();

    }

    @Test
    public void Verify_YourSchedule_links () throws InterruptedException {
        DashboardPage objDashboard = new DashboardPage(driver);
        Thread.sleep(3000);
        objDashboard.Press_DashboardLink();
        objDashboard.Press_AllUpcomingEvents();
        String PageName1=objDashboard.Verify_PageName();
        Assert.assertEquals(PageName1, "Upcoming events");
        System.out.println("All upcoming events: " + PageName1);
        objDashboard.Press_DashboardLink();
        objDashboard.Press_EditAvailability();
        String PageName2=objDashboard.Verify_PageName();
        Assert.assertEquals(PageName2, "Calendar");
        System.out.println("Edit Availability: " + PageName2);
        objDashboard.Press_DashboardLink();
        objDashboard.Press_AddNewEvent();
        Thread.sleep(3000);
        String PageName3=objDashboard.Verify_AddNewEvent();
        Assert.assertEquals(PageName3, "ADD NEW EVENT");
        System.out.println("Add new event: " + PageName3);
        objDashboard.Close_AddNewEvent();
        objDashboard.perform_Logout();

    }

    @AfterClass
    public void close(){
        driver.close();
    }
}
