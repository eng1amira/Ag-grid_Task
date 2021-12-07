package tests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SearchPage;
import ConfigData.ConfigProperties;


public class FilterByCountryTest extends TestBase {

    //***** variables *****//
    SearchPage SearchPageObject;
    public static String Country=null ;


    //***** methods *****//

    @Test(priority = 1, alwaysRun = true, description = "User filter with country")
    public void UserCanFilterByCountrySuccssfully() throws Exception {
        ConfigProperties.ReadConfigDataProperties();
        System.out.println(Country);
        Thread.sleep(10);
        SearchPageObject = new SearchPage();
        SearchPageObject.ClickOnCountryFilter();
        BasePage.waitUntilElementIsClickable(SearchPageObject.setCountry());
        SearchPageObject.setCountry().sendKeys(Country);
        SearchPageObject.setCountry().sendKeys(Keys.RETURN);
        System.out.println(SearchPageObject.getcountryFilterResult());
        Assert.assertEquals(SearchPageObject.getcountryFilterResult(), Country);
        SearchPageObject.ClickOnResetButton();
        Thread.sleep(10);
        SearchPageObject.GetResetButton().sendKeys(Keys.ESCAPE);
        System.out.println(Country);
    }

}



