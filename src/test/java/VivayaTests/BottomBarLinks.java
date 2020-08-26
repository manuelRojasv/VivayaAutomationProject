package VivayaTests;

import Page_Obj.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class BottomBarLinks {
    WebDriver driver;

    @BeforeClass
    public void setUpHeadlessMode() {
        System.setProperty("java.awt.headless", "true");
    }


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
    public void Verify_BottomBarLinks(){
        BottomBar objBottom = new BottomBar(driver);
        BecomeGuidePage objBecomeGuide = new BecomeGuidePage(driver);
        objBottom.Press_AboutLink();
        String PageName1=objBottom.Verify_AboutPage();
        Assert.assertEquals(PageName1, "Streaming good vibes");
        System.out.println("About Page: " + PageName1);
        objBottom.Press_BecomeGuideLink();
        String PageName2=objBecomeGuide.Verify_PageName();
        Assert.assertEquals(PageName2, "Why Teach With VIVAYA?");
        System.out.println("Become a Guide Page: " + PageName2);
        objBottom.Press_WorkshopsLink();
        String PageName3=objBottom.Verify_PageName();
        Assert.assertEquals(PageName3, "Find your next VIVAYA Workshop");
        System.out.println("Workshops Page: " + PageName3);
        objBottom.Press_BlogLink();
        String PageName4=objBottom.Verify_PageName();
        Assert.assertEquals(PageName4, "Health & Wellness\n" +
                "Thought Leadership");
        System.out.println("Blog Page: " + PageName4);
        objBottom.Press_ContactLink();
        String PageName5=objBottom.Verify_PageName();
        Assert.assertEquals(PageName5, "Contact");
        System.out.println("Contact Page: " + PageName5);
        objBottom.Press_PrivacyPolicyLink();
        String PageName6=objBottom.Verify_PageName();
        Assert.assertEquals(PageName6, "Privacy Policy");
        System.out.println("Privacy Policy Page: " + PageName6);
        objBottom.Press_TermsConditionsLink();
        String PageName7=objBottom.Verify_PageName();
        Assert.assertEquals(PageName7, "Terms & Conditions");
        System.out.println("Terms and conditions Page: " + PageName7);
    }

    @Test (priority = 1, enabled = true)
    public void Verify_BottomBarLinks_Login() throws InterruptedException {
        HomePage objHome = new HomePage(driver);
        LoginPage objLogin = new LoginPage(driver);
        SeekerDashboardPage objSeeker = new SeekerDashboardPage(driver);
        BottomBar objBottom=new BottomBar(driver);
        Thread.sleep(3000);
        objHome.click_Login_Link();
        objLogin.set_Seeker_Credentials("valeria1208@outlook.com", "user7890");
        Thread.sleep(3000);
        objBottom.Press_AboutLink();
        String PageName1=objBottom.Verify_AboutPage();
        Assert.assertEquals(PageName1, "Streaming good vibes");
        System.out.println("About Page: " + PageName1);
        objBottom.Press_WorkshopsLink();
        String PageName3=objBottom.Verify_PageName();
        Assert.assertEquals(PageName3, "Find your next VIVAYA Workshop");
        System.out.println("Workshops Page: " + PageName3);
        objBottom.Press_BlogLink();
        String PageName4=objBottom.Verify_PageName();
        Assert.assertEquals(PageName4, "Health & Wellness\n" +
                "Thought Leadership");
        System.out.println("Blog Page: " + PageName4);
        objBottom.Press_ContactLink();
        String PageName5=objBottom.Verify_PageName();
        Assert.assertEquals(PageName5, "Contact");
        System.out.println("Contact Page: " + PageName5);
        objBottom.Press_PrivacyPolicyLink();
        String PageName6=objBottom.Verify_PageName();
        Assert.assertEquals(PageName6, "Privacy Policy");
        System.out.println("Privacy Policy Page: " + PageName6);
        objBottom.Press_TermsConditionsLink();
        String PageName7=objBottom.Verify_PageName();
        Assert.assertEquals(PageName7, "Terms & Conditions");
        System.out.println("Terms and conditions Page: " + PageName7);
        objSeeker.perform_Logout();
    }

    @AfterClass
    public void close(){
        driver.close();
    }
}
