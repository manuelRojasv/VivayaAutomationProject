package VivayaTests;

import Page_Obj.HomePage;
import Page_Obj.LoginPage;
import Page_Obj.SeekerDashboardPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeekerDashboardLinks {
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

    @Test (priority = 0, enabled = true)
    public void Verify_Quick_Links() throws InterruptedException {
        HomePage objHome = new HomePage(driver);
        LoginPage objLogin = new LoginPage(driver);
        SeekerDashboardPage objSeeker = new SeekerDashboardPage(driver);
        Thread.sleep(3000);
        objHome.click_Login_Link();
        objLogin.set_Seeker_Credentials("alejandra@seeker.com", "user7890");
        Thread.sleep(3000);
        objSeeker.Press_MyPassword();
        String PageName1=objSeeker.Verify_PageName();
        Assert.assertEquals(PageName1, "Account Information");
        System.out.println("My password: " + PageName1);
        objSeeker.Press_DashboardLink();
        objSeeker.Press_PaymentInformation();
        String PageName2=objSeeker.Verify_PageName();
        Assert.assertEquals(PageName2, "Update Credit Card");
        System.out.println("My password: " + PageName2);
        objSeeker.Press_DashboardLink();
        objSeeker.Press_MyAccount();
        String PageName3=objSeeker.Verify_PageName();
        Assert.assertEquals(PageName3, "Account Information");
        System.out.println("My account: " + PageName3);
        objSeeker.Press_DashboardLink();
        objSeeker.Press_MembershipCancellation();
        Thread.sleep(3000);
        String PageName4=objSeeker.Verify_MembershipCancellation();
        Assert.assertEquals(PageName4, "Are you sure that you want to cancel your Monthly Unlimited Membership ?");
        System.out.println("Membership cancellation: " + PageName4);
        objSeeker.Close_MembershipCancellation();
        objSeeker.Press_ShoppingCart();
        String PageName5=objSeeker.Verify_PageName();
        Assert.assertEquals(PageName5, "Cart");
        System.out.println("Shopping Cart: " + PageName5);
        objSeeker.Press_DashboardLink();
        objSeeker.Press_ContactVivaya();
        String PageName6= objSeeker.Verify_PageName();
        Assert.assertEquals(PageName6, "Contact");
        System.out.println("Contact VIVAYA: " + PageName6);
        objSeeker.perform_Logout();
    }

    @AfterClass
    public void close(){
        driver.close();
    }

}
