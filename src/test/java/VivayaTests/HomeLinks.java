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

public class HomeLinks {
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
    public void Verify_HomeLinks() throws InterruptedException {
        HomePage objHome=new HomePage(driver);
        BecomeGuidePage objBecomeGuide=new BecomeGuidePage(driver);
        objHome.Press_Home();
        objHome.Press_FreeTrialLink(); //no es lo mismo en stage
        String PageName1=objHome.Verify_FreeTrialName();
        Assert.assertEquals(PageName1, "Try 14 days of FREE unlimited yoga classes");
        System.out.println("Free Trial Page: " + PageName1);
        objHome.Press_Home();
        objHome.Press_YogaLink();
        String PageName2=objHome.Verify_PageName();
        Assert.assertEquals(PageName2, "Yoga");
        System.out.println("Yoga Page: " + PageName2);
        objHome.Press_Home();
        objHome.Press_MeditationLink();
        String PageName3=objHome.Verify_PageName();
        Assert.assertEquals(PageName3, "Meditation");
        System.out.println("Meditation Page: " + PageName3);
        objHome.Press_Home();
        objHome.Press_NutritionLink();
        String PageName4=objHome.Verify_PageName();
        Assert.assertEquals(PageName4, "Nutrition");
        System.out.println("Nutrition Page: " + PageName4);
        objHome.Press_Home();
        objHome.Press_HealingArtLink();
        String PageName5=objHome.Verify_PageName();
        Assert.assertEquals(PageName5, "Healing Arts and Reiki");
        System.out.println("Healing Arts and Reiki Page: " + PageName5);
        objHome.Press_Home();
        objHome.Press_CoachingLink();
        String PageName6=objHome.Verify_PageName();
        Assert.assertEquals(PageName6, "Coaching");
        System.out.println("Coaching Page: " + PageName6);
        objHome.Press_Home();
        objHome.Press_AstrologyLink();
        String PageName7=objHome.Verify_PageName();
        Assert.assertEquals(PageName7, "Astrology and Spiritual Counseling");
        System.out.println("Astrology and Spiritual Counseling Page: " + PageName7);
        objHome.Press_Home();
        objHome.Press_ViewFullScheduleLink();
        String PageName8=objHome.Verify_PageName();
        Assert.assertEquals(PageName8, "Schedule");
        System.out.println("Schedule Page: " + PageName8);
        objHome.Press_Home();
        Thread.sleep(3000);
        objHome.Press_ViewAllGuidesLink();
        String PageName9=objHome.Verify_PageName();
        Assert.assertEquals(PageName9, "Explore our VIVAYA Guides");
        System.out.println("Guides Page: " + PageName9);
        objHome.Press_Home();
        Thread.sleep(3000);
        objHome.Press_BecomeGuideLink();
        String PageName10=objHome.Verify_PageName();
        Assert.assertEquals(PageName10, "Become a Guide");
        System.out.println("Become a Guide Page: " + PageName10);

    }

    @Test (priority = 1, enabled = true)
    public void Verify_HomeLinks_Login() throws InterruptedException {
        HomePage objHome=new HomePage(driver);
        LoginPage objLogin = new LoginPage(driver);
        SeekerDashboardPage objSeeker = new SeekerDashboardPage(driver);
        Thread.sleep(3000);
        objHome.click_Login_Link();
        objLogin.set_Seeker_Credentials("valeria1208@outlook.com", "user7890");
        Thread.sleep(3000);
        objHome.Press_Home();
        objHome.Press_BookYourNextClassLink();
        String PageName1=objHome.Verify_PageName();
        Assert.assertEquals(PageName1, "Schedule");
        System.out.println("Schedule Page: " + PageName1);
        objHome.Press_Home();
        objHome.Press_YogaLink();
        String PageName2=objHome.Verify_PageName();
        Assert.assertEquals(PageName2, "Yoga");
        System.out.println("Yoga Page: " + PageName2);
        objHome.Press_Home();
        objHome.Press_MeditationLink();
        String PageName3=objHome.Verify_PageName();
        Assert.assertEquals(PageName3, "Meditation");
        System.out.println("Meditation Page: " + PageName3);
        objHome.Press_Home();
        objHome.Press_NutritionLink();
        String PageName4=objHome.Verify_PageName();
        Assert.assertEquals(PageName4, "Nutrition");
        System.out.println("Nutrition Page: " + PageName4);
        objHome.Press_Home();
        objHome.Press_HealingArtLink();
        String PageName5=objHome.Verify_PageName();
        Assert.assertEquals(PageName5, "Healing Arts and Reiki");
        System.out.println("Healing Arts and Reiki Page: " + PageName5);
        objHome.Press_Home();
        objHome.Press_CoachingLink();
        String PageName6=objHome.Verify_PageName();
        Assert.assertEquals(PageName6, "Coaching");
        System.out.println("Coaching Page: " + PageName6);
        objHome.Press_Home();
        objHome.Press_AstrologyLink();
        String PageName7=objHome.Verify_PageName();
        Assert.assertEquals(PageName7, "Astrology and Spiritual Counseling");
        System.out.println("Astrology and Spiritual Counseling Page: " + PageName7);
        objHome.Press_Home();
        objHome.Press_ViewFullScheduleLink();
        String PageName8=objHome.Verify_PageName();
        Assert.assertEquals(PageName8, "Schedule");
        System.out.println("Schedule Page: " + PageName8);
        objHome.Press_Home();
        Thread.sleep(3000);
        objHome.Press_ViewAllGuidesLink();
        String PageName9=objHome.Verify_PageName();
        Assert.assertEquals(PageName9, "Explore our VIVAYA Guides");
        System.out.println("Guides Page: " + PageName9);
        objSeeker.perform_Logout();

    }

    @AfterClass
    public void close(){
        driver.close();
    }

}
