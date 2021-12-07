package tests;


import ConfigData.ConfigProperties;
import driver.WebDriverHandler;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SearchPage;
import ConfigData.ConfigProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import static org.testng.Assert.assertEquals;


public class FilterByLanguageTest extends TestBase {

    //***** variables *****//
    SearchPage SearchPageObject;
    public static String language=null ;


 /*   public String language = "French";
    public String Country = "Belgium";*/

    //***** methods *****//



    @Test(priority = 1, alwaysRun = true, description = "User filter with Language")

    public void UserCanFilterByLanguageSuccssfully() throws Exception {
        ConfigProperties.ReadConfigDataProperties();
        System.out.println(language);
        SearchPageObject = new SearchPage();
        SearchPageObject.ClickOnLanguageFilter();
        BasePage.waitUntilElementIsClickable(SearchPageObject.setLanguage());
        SearchPageObject.setLanguage().sendKeys(language);
        SearchPageObject.setLanguage().sendKeys(Keys.RETURN);
        System.out.println(SearchPageObject.getlanguageFilterResult());
        Thread.sleep(10);
        Assert.assertEquals(SearchPageObject.getlanguageFilterResult(),language);
        SearchPageObject.ClickOnResetButton();
        Thread.sleep(10);
        SearchPageObject.GetResetButton().sendKeys(Keys.ESCAPE);

    }

}



