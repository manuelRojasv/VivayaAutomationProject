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

public class PricingLinks {
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
    public void Verify_Pricing_Links() throws InterruptedException {
        TopBar objTop = new TopBar(driver);
        PricingPage objPricing = new PricingPage(driver);
        objTop.Press_PricingLink();
        objPricing.Press_TryNow();
        String PageName1= objPricing.Verify_FreeTrialName();
        Assert.assertEquals(PageName1, "Try 14 days of FREE unlimited yoga classes");
        System.out.println("Try now page: " + PageName1);
        objTop.Press_PricingLink();
        Thread.sleep(3000);
        objPricing.Press_SubscribeMonthly();
        String PageName2= objPricing.Verify_PagesName();
        Assert.assertEquals(PageName2, "Sign in");
        System.out.println("Subscribe Monthly: " + PageName2);
        objTop.Press_PricingLink();
        Thread.sleep(3000);
        objPricing.Press_SubscribeAnnually();
        String PageName3= objPricing.Verify_PagesName();
        Assert.assertEquals(PageName3, "Sign in");
        System.out.println("Subscribe Annually: " + PageName3);
        objTop.Press_PricingLink();
        Thread.sleep(3000);
        objPricing.Press_BuyNow1();
        String PageName4= objPricing.Verify_PagesName();
        Assert.assertEquals(PageName4, "Sign in");
        System.out.println("Buy Now 1 Class: " + PageName4);
        objTop.Press_PricingLink();
        Thread.sleep(3000);
        objPricing.Press_BuyNow5();
        String PageName6= objPricing.Verify_PagesName();
        Assert.assertEquals(PageName6, "Sign in");
        System.out.println("Buy Now 5 pack: " + PageName6);
        objTop.Press_PricingLink();
        Thread.sleep(3000);
        objPricing.Press_BuyNow10();
        String PageName7=objPricing.Verify_PagesName();
        Assert.assertEquals(PageName7, "Sign in");
        System.out.println("Buy Now 10 pack: " + PageName7);
        objTop.Press_PricingLink();
        Thread.sleep(3000);
        objPricing.Press_ViewAllEvents();
        String PageName8= objPricing.Verify_PagesName();
        Assert.assertEquals(PageName8, "Find your next VIVAYA Workshop");
        System.out.println("View All Events page: " + PageName8);
        objTop.Press_PricingLink();
        Thread.sleep(3000);
        objPricing.Press_FindGuide();
        String PageName9= objPricing.Verify_PagesName();
        Assert.assertEquals(PageName9, "Explore our VIVAYA Guides");
        System.out.println("Find Guide Page: " + PageName9);
    }

    @Test (priority = 1, enabled = true)
    public void Verify_Pricing_Links_LogIn() throws InterruptedException {
        TopBar objTop = new TopBar(driver);
        PricingPage objPricing = new PricingPage(driver);
        HomePage objHome = new HomePage(driver);
        LoginPage objLogin = new LoginPage(driver);
        SeekerDashboardPage objSeeker = new SeekerDashboardPage(driver);
        CartPage objCart = new CartPage(driver);
        Thread.sleep(3000);
        objHome.click_Login_Link();
        objLogin.set_Seeker_Credentials("valeria1208@outlook.com", "user7890");
        Thread.sleep(3000);
        objTop.Press_PricingLink();
        /*objPricing.Press_TryNow();
        String PageName1= objPricing.Verify_FreeTrialName();
        Assert.assertEquals(PageName1, "Try 14 days of FREE unlimited yoga classes");
        System.out.println("Try now page: " + PageName1);
        objTop.Press_PricingLink();*/
        objPricing.Press_SubscribeMonthly();
        String PageName2= objPricing.Verify_PagesName();
        Assert.assertEquals(PageName2, "Cart");
        System.out.println("Subscribe Monthly: " + PageName2);
        objCart.Press_Remove();
        objCart.Press_Yes();
        String Message1=objCart.Verify_RemoveMessage();
        Assert.assertEquals(Message1, "×\n" +
                "Item has been removed from cart.");
        System.out.println("Remove: " + Message1);
        objTop.Press_PricingLink();
        objPricing.Press_SubscribeAnnually();
        String PageName3= objPricing.Verify_PagesName();
        Assert.assertEquals(PageName3, "Cart");
        System.out.println("Subscribe Annually: " + PageName3);
        objCart.Press_Remove();
        objCart.Press_Yes();
        String Message2=objCart.Verify_RemoveMessage();
        Assert.assertEquals(Message2, "×\n" +
                "Item has been removed from cart.");
        System.out.println("Remove: " + Message2);
        objTop.Press_PricingLink();
        Thread.sleep(3000);
        objPricing.Press_BuyNow1();
        String PageName4= objPricing.Verify_PagesName();
        Assert.assertEquals(PageName4, "Cart");
        System.out.println("Buy now 1 class: " + PageName4);
        objCart.Press_Remove();
        objCart.Press_Yes();
        String Message3=objCart.Verify_RemoveMessage();
        Assert.assertEquals(Message3, "×\n" +
                "Item has been removed from cart.");
        System.out.println("Remove: " + Message3);
        objTop.Press_PricingLink();
        Thread.sleep(3000);
        objPricing.Press_BuyNow5();
        String PageName6= objPricing.Verify_PagesName();
        Assert.assertEquals(PageName6, "Cart");
        System.out.println("Buy Now 5 pack: " + PageName6);
        objCart.Press_Remove();
        objCart.Press_Yes();
        String Message4=objCart.Verify_RemoveMessage();
        Assert.assertEquals(Message4, "×\n" +
                "Item has been removed from cart.");
        System.out.println("Remove: " + Message4);
        objTop.Press_PricingLink();
        Thread.sleep(3000);
        objPricing.Press_BuyNow10();
        String PageName7=objPricing.Verify_PagesName();
        Assert.assertEquals(PageName7, "Cart");
        System.out.println("Buy Now 10 pack: " + PageName7);
        objCart.Press_Remove();
        objCart.Press_Yes();
        String Message5=objCart.Verify_RemoveMessage();
        Assert.assertEquals(Message5, "×\n" +
                "Item has been removed from cart.");
        System.out.println("Remove: " + Message5);
        objTop.Press_PricingLink();
        Thread.sleep(3000);
        objPricing.Press_ViewAllEvents();
        String PageName8= objPricing.Verify_PagesName();
        Assert.assertEquals(PageName8, "Find your next VIVAYA Workshop");
        System.out.println("View all events page: " + PageName8);
        objTop.Press_PricingLink();
        Thread.sleep(3000);
        objPricing.Press_FindGuide();
        String PageName9= objPricing.Verify_PagesName();
        Assert.assertEquals(PageName9, "Explore our VIVAYA Guides");
        System.out.println("Find Guide page: " + PageName9);
        objSeeker.perform_Logout();
    }

    @AfterClass
    public void close(){
        driver.close();
    }
}
