package VivayaTests;

import Page_Obj.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class BookingCancelEvents {
    WebDriver driver;

    @BeforeClass
    @Parameters({"URL", "BrowserType"})
    public void initial_Setup(String url, String browserType) {

        if (browserType.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            HomePage objHome = new HomePage(driver);
            LoginPage objLogin = new LoginPage(driver);
            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            objHome.click_Login_Link();
            objLogin.set_Guide_Credentials ("manurex@manu.com", "perrodelmal");


        }

        System.out.println("Opening" + browserType);
    }

    /*@AfterClass
    public void Teardown() {
        driver.close();
        driver.quit();
    }*/

    @Test(enabled = true, priority = 0)
    public void book_Cancel_Event_From_Guide_Profile() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        DashboardPage objDash = new DashboardPage(driver);
        ClassPage classPage = new ClassPage(driver);
        HomePage objHome = new HomePage(driver);
        LoginPage objLogin = new LoginPage(driver);
        EventPageDetails objEventDetails = new EventPageDetails(driver);
        GuidesPage objGuides = new GuidesPage(driver);
        GuideProfilePage objGuideProfile = new GuideProfilePage(driver);
        objDash.open_Class();
        classPage.create_Event_ForTomorrow();
        Thread.sleep(3000);
        objDash.logout_From_Dashboard();
        objHome.click_Login_Link();
        objLogin.set_Seeker_Credentials("horcosio@gmail.com", "perrodelmal");
        Thread.sleep(3000);
        objGuides.search_Guide("manu rex");
        objGuides.select_Single_Guide ("manu rex");
        objGuideProfile.select_Event_from_Guide_Profile("EVENT FOR TOMORROW");
        objEventDetails.select_book_Button_from_Event_Detail();
        Thread.sleep(2000);
        objEventDetails.cancel_Event();
        Thread.sleep(2000);



    }

    @Test(enabled = true, priority = 1)
    public void book_Cancel_From_Schedule() throws InterruptedException {
        TopBar objTopbar = new TopBar(driver);
        SchedulePage objSchedulePage = new SchedulePage(driver);
        EventPageDetails objPageDetail = new EventPageDetails(driver);
        objTopbar.Press_ScheduleLink();
        Thread.sleep(2000);
        objSchedulePage.book_Event_Tomorrow("EVENT FOR TOMORROW");
        objSchedulePage.cancel_Tomorrow_Event_From_Schedule("EVENT FOR TOMORROW");


        //objSchedulePage.book_Event_Tomorrow();
        /*objHome.perform_Logout();
        objHome.click_Login_Link();
        objLogin.set_Guide_Credentials ("manurex@manu.com", "perrodelmal");
        Thread.sleep(3000);
        objDash.cancel_an_Event();*/
    }

    @Test(enabled = false, priority = 2) //need to complete this, i cant cancel from Dashboard yet, problems with the locator
    public void book_and_Cancel_From_Dashboard() throws InterruptedException {
        TopBar objTopbar = new TopBar(driver);
        SchedulePage objSchedulePage = new SchedulePage(driver);
        DashboardPage objSeekerDashboard = new DashboardPage(driver);

        objTopbar.Press_ScheduleLink();
        objSchedulePage.book_First_Event_CurrentDay();
        objSeekerDashboard.Press_DashboardLink();
        Thread.sleep(2000);
        objSeekerDashboard.seeker_Cancel_Event_Dashboard();

    }
}
