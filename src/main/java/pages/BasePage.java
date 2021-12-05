package pages;

import driver.WebDriverHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public  class BasePage {



	public BasePage() {
		int waitTime = 5;
		PageFactory.initElements(new AjaxElementLocatorFactory(WebDriverHandler.getWebDriver(), waitTime), this);
	}

	public boolean elementIsDisplayed(WebElement element) {
		try {
			return element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}


	public static void waitUntilPageIsLoaded() {
		WebDriverWait wait = new WebDriverWait(WebDriverHandler.getWebDriver(), 5);
		wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
	}

	public static void waitUntilElementIsClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(WebDriverHandler.getWebDriver(), 5);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public WebElement getElementByPartialText(String text) {

		String textXpath = "//*[contains(text(), \"" + text + "\")]";

		WebDriver driver = WebDriverHandler.getWebDriver();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(textXpath)));

		return  driver.findElement(By.xpath(textXpath));
	}

	public void clickOnElementWithPartialText(String text) {
		getElementByPartialText(text).click();
	}
}
