package tests;


import ConfigData.ConfigProperties;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SearchPage;
import ConfigData.ConfigProperties;


public class FilterByLanguageAndCountryTest extends TestBase {

    //***** variables *****//
    SearchPage SearchPageObject;
    public static String Country="Belgium";
    public static String language="French";
    String Janvalue="$66,433";


    //***** methods *****//


    @Test(priority = 1, alwaysRun = true, description = "User filter with country and language")
    public void UserAssertJanFieldSuccssfully() throws Exception {

       // ConfigProperties.ReadConfigDataProperties();
        System.out.println(language);
        SearchPageObject = new SearchPage();
        SearchPageObject.ClickOnLanguageFilter();
        BasePage.waitUntilElementIsClickable(SearchPageObject.setLanguage());
        SearchPageObject.setLanguage().sendKeys(language);
        SearchPageObject.setLanguage().sendKeys(Keys.RETURN);
        System.out.println(SearchPageObject.getlanguageFilterResult());
        Thread.sleep(10);
        Assert.assertEquals(SearchPageObject.getlanguageFilterResult(),language);
        Thread.sleep(10);
        SearchPageObject.GetResetButton().sendKeys(Keys.ESCAPE);


        Thread.sleep(10);
        SearchPageObject = new SearchPage();
        SearchPageObject.ClickOnCountryFilter();
        BasePage.waitUntilElementIsClickable(SearchPageObject.setCountry());
        SearchPageObject.setCountry().sendKeys(Country);
        SearchPageObject.setCountry().sendKeys(Keys.RETURN);
        System.out.println(SearchPageObject.getcountryFilterResult());
        Assert.assertEquals(SearchPageObject.getcountryFilterResult(), Country);
        Thread.sleep(10);
        SearchPageObject.GetResetButton().sendKeys(Keys.ESCAPE);
        System.out.println(SearchPageObject.getJanFilterResult());
        Assert.assertEquals(SearchPageObject.getJanFilterResult(),Janvalue);


    }
}



