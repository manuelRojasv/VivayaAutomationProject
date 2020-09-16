package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;

public class WebDriverFactory {
    public static WebDriver getDriver(String browser) throws Exception {
        switch (browser){
            case "Chrome":
                ChromeDriverCreator chromeDriverCreator = new ChromeDriverCreator();
                return chromeDriverCreator.createWebDriver();
            case "Firefox":
                FirefoxDriverCreator firefoxDriverCreator = new FirefoxDriverCreator();
                return firefoxDriverCreator.createWebDriver();
            default:
                throw new Exception("Navegador " + browser + " no soportado");
        }
    }
}
