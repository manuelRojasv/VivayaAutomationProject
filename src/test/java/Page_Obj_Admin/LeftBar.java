package Page_Obj_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeftBar {
    WebDriver driver;

    By Administrators_Link=By.linkText("Administrators");
    By Seekers_Link=By.linkText("Seekers");
    By Guides_Link=By.linkText("Guides");
    By Events_Link=By.linkText("Events");
    By Memberships_Link=By.linkText("Memberships");
    By Reports_Link=By.linkText("Reports");
    By Blog_Link=By.linkText("Blog");
    By Promotions_Link=By.linkText("Promotions");
    By Blog_List=By.cssSelector(".menu-open li:nth-child(1) span");

    public LeftBar(WebDriver driver) { this.driver = driver; }

    public void Press_Blog() {
        driver.findElement(Blog_Link).click();
    }
    public void Press_BlogList() {
        driver.findElement(Blog_List).click();
    }

}
