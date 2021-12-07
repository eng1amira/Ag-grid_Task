package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BasePage {


    /**** locators ****/


    // @FindBy(xpath = "/html[1]/body[1]/main[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/input[1]")


    @FindBy(xpath = "//body/main[@id='example-wrapper']/section[@id='grid-wrapper']/div[@id='myGrid']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[2]/button[1]/span[1]")
    WebElement languageFilter;

    @FindBy(xpath = "//body/main[@id='example-wrapper']/section[@id='grid-wrapper']/div[@id='myGrid']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div[3]/div[2]/button[1]/span[1]")
    WebElement CountyFilter;

    //@FindBy(xpath="//input[@type='text']")

    // @FindBy(css = "#ag-497-input")

    //driver.findElement(By.xpath("//input[@type='email' AND @name='email']"
    @FindBy(xpath = "/html[1]/body[1]/main[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/input[1]")

    WebElement setLanguageText;


    @FindBy(xpath = "/html[1]/body[1]/main[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]")

    WebElement setCountryText;


    @FindBy(xpath = "/html[1]/body[1]/main[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]")
    WebElement languageFilterResult;





    @FindBy(xpath = " /html[1]/body[1]/main[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/span[1]")
    WebElement countryFilterResult;


    @FindBy(xpath = "//button[contains(text(),'Reset')]")
    WebElement resetButton;




    @FindBy(xpath = "//div[contains(text(),'$66,433')]")
    WebElement janField;

    /**** methods and actions ****/


    public WebElement GetLanguageFilter() {
        return languageFilter;

    }
    public void ClickOnLanguageFilter() {
        languageFilter.click();

    }

    public void ClickOnCountryFilter() {
        CountyFilter.click();

    }

    public WebElement setLanguage() {

        return setLanguageText;
        //setLanguageText.sendKeys(language);
    }

    public WebElement setCountry() {

        return setCountryText;
    }

    public String getlanguageFilterResult() {

        return languageFilterResult.getText();
    }


    public String getcountryFilterResult() {

        return countryFilterResult.getText();
    }
    public WebElement GetResetButton() {
        return resetButton;

    }

    public WebElement getJanField() {

        return janField;
    }

    public String getJanFilterResult() {

        return janField.getText();
    }
        public void ClickOnResetButton() {
        resetButton.click();

    }

}



