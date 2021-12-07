package tests;

import driver.WebDriverHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.BasePage;
import utilities.Helper;
import tests.FilterByLanguageTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestBase  {

    protected WebDriverHandler webDriverHandler;


    @BeforeSuite
    public void setupDriver() throws IOException {

        webDriverHandler = new WebDriverHandler();
        webDriverHandler.resetCache();
        webDriverHandler.navigateTo("https://www.ag-grid.com/example.php");

    }


    // Take screenshot when test case fail and add it in the Screenshot folder
    @AfterMethod
    public void screenshotOnFailure(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            System.out.println("Failed!");
            System.out.println("Taking Screenshot....");
            Helper.captureScreenshot(webDriverHandler.webDriver, result.getName());
        }
    }

    @AfterSuite
    public void stopDriver() {
        webDriverHandler.close();


    }




}

