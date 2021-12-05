package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;


import java.io.IOException;

public class WebDriverHandler {

    public static WebDriver webDriver;
    private  String browser ="chrome";


    public WebDriverHandler() throws IOException {
        getDriverType();
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public void close() {
        webDriver.quit();
    }

    private void getDriverType() throws IOException {

        switch (browser) {
            case "chrome":

                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeCapabilities = new ChromeOptions();
                webDriver = new ChromeDriver(chromeCapabilities);
                webDriver.manage().window().maximize();
                break;

            case "Edge":
                WebDriverManager.edgedriver().setup();

                EdgeOptions edgeCapabilities = new EdgeOptions();
                webDriver = new EdgeDriver(edgeCapabilities);
                System.setProperty("webdriver.edge.verboseLogging", "true");
                webDriver.manage().window().maximize();
                break;


        }

    }

    public void navigateTo(String link) {
        webDriver.navigate().to(link);
    }

    public void resetCache() {
        webDriver.manage().deleteAllCookies();
    }
}
