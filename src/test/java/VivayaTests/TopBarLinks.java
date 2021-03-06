package VivayaTests;

import Page_Obj.*;
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

public class TopBarLinks {
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

    @Test (priority = 0, enabled = true)
    public void Verify_TopBarLinks(){
        TopBar objTop = new TopBar(driver);
        SchedulePage objSchedule= new SchedulePage(driver);
        GuidesPage objGuides= new GuidesPage(driver);
        WhatWeOfferPage objWhatWeOffer=new WhatWeOfferPage(driver);
        PricingPage objPricing=new PricingPage(driver);
        BecomeGuidePage objBecomeGuide=new BecomeGuidePage(driver);
        objTop.Press_ScheduleLink();
        String PageName1=objSchedule.Verify_PageName();
        Assert.assertEquals(PageName1, "Schedule");
        System.out.println("Schedule Page: " + PageName1);
        objTop.Press_GuidesLink();
        String PageName2=objGuides.Verify_PageName();
        Assert.assertEquals(PageName2, "Explore our VIVAYA Guides");
        System.out.println("Guides Page: " + PageName2);
        objTop.Press_WhatWeOfferLink();
        String PageName3=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName3, "VIVAYA Offerings");
        System.out.println("What We Offer Page: " + PageName3);
        objTop.Press_PricingLink();
        String PageName4=objPricing.Verify_PageName();
        Assert.assertEquals(PageName4, "Memberships");
        System.out.println("Pricing Page: " + PageName4);
        objTop.Press_BecomeGuideLink();
        String PageName5=objBecomeGuide.Verify_PageName();
        Assert.assertEquals(PageName5, "Why Teach With VIVAYA?");
        System.out.println("Become a Guide Page: " + PageName5);

    }

    @Test (priority = 1, enabled = true)
    public void Verify_TopBarLinks_Login() throws InterruptedException {
        HomePage objHome = new HomePage(driver);
        LoginPage objLogin = new LoginPage(driver);
        SeekerDashboardPage objSeeker = new SeekerDashboardPage(driver);
        TopBar objTop = new TopBar(driver);
        SchedulePage objSchedule= new SchedulePage(driver);
        GuidesPage objGuides= new GuidesPage(driver);
        WhatWeOfferPage objWhatWeOffer=new WhatWeOfferPage(driver);
        PricingPage objPricing=new PricingPage(driver);
        Thread.sleep(3000);
        objHome.click_Login_Link();
        objLogin.set_Seeker_Credentials("valeria1208@outlook.com", "user7890");
        Thread.sleep(3000);
        objTop.Press_ScheduleLink();
        String PageName1=objSchedule.Verify_PageName();
        Assert.assertEquals(PageName1, "Schedule");
        System.out.println("Schedule Page: " + PageName1);
        objTop.Press_GuidesLink();
        String PageName2=objGuides.Verify_PageName();
        Assert.assertEquals(PageName2, "Explore our VIVAYA Guides");
        System.out.println("Guides Page: " + PageName2);
        objTop.Press_WhatWeOfferLink();
        String PageName3=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName3, "VIVAYA Offerings");
        System.out.println("What We Offer Page: " + PageName3);
        objTop.Press_PricingLink();
        String PageName4=objPricing.Verify_PageName();
        Assert.assertEquals(PageName4, "Memberships");
        System.out.println("Pricing Page: " + PageName4);
        objSeeker.perform_Logout();
    }

    @AfterClass
    public void close(){
        driver.close();
    }
}
