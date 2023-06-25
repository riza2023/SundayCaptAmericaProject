package upskill.ebay.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import upskill.ebay.pageElements.EbayHomepageLocators;
import upskill.utilities.ReadExcelSheet;
import upskill.utilities.SetupDrivers;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.ebay.pageElements.EbayCartLocators;
import upskill.utilities.PracticeReadExcelSheet;
import upskill.utilities.ReadExcelSheet;
import upskill.utilities.SetupDrivers;

public class EbayHomepageActions {

	EbayHomepageLocators EbayHomepageLocatorsObj;

	public EbayHomepageActions() {
		EbayHomepageLocatorsObj = new EbayHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayHomepageLocatorsObj);

	}

	public void searchItems(String items) {
		EbayHomepageLocatorsObj.txtBoxSearch.sendKeys(items);
		EbayHomepageLocatorsObj.btnSearch.click();

	}

	// Mousehover; 3 steps in Action; 1.call the obj of Action class 2.Move to element and 3.perform
	public void mouseHoverMyEbay() throws Exception {
		Actions actions = new Actions(SetupDrivers.driver);    //action from selenium;
		actions.moveToElement(EbayHomepageLocatorsObj.linkMyEbay);
		actions.perform();
		
		// Explicit Wait
		WebDriverWait explicitWait = new WebDriverWait(SetupDrivers.driver, 10);
		explicitWait.until(ExpectedConditions.elementToBeClickable(EbayHomepageLocatorsObj.linkMyEbay));
		// Thread.sleep(2000);

	}

	// Mousehover; is Enabled and click
	
	  public void clickSummery() throws Exception {
		EbayHomepageLocatorsObj.linkSummary.isEnabled();
		EbayHomepageLocatorsObj.linkSummary.click();
	
	  }
	
// Explicit Wait in MouseHover Enable and click
// public void clickSummery() throws Exception {
// EbayHomepageLocatorsObj.linkSummary.isEnabled();
//	
//	WebDriverWait explicitWait = new WebDriverWait(SetupDrivers.driver, 10);
//	explicitWait.until(ExpectedConditions.elementToBeClickable(EbayHomepageLocatorsObj.linkSummary));
//	EbayHomepageLocatorsObj.linkSummary.sendKeys(Keys.ENTER);
//	EbayHomepageLocatorsObj.linkSummery.click();
// Thread.sleep(2000);
// }

	public void synchronization() {
		/*
		 * Selenium Wait : 
		 * 1. Implicit wait(Global),We need to use Object and parameters.
		 * When we want to wait all scripts we use Implicit wait; ex:SetupDriver and homepageAction(after the eBay homepage open)
		 *  2. Explicit wait(Conditional), 
		 *  When we want to wait the script in specific place we use Explicit wait.
		 *  3.Fluent wait(intermittent)
		 *  Fluent Wait looks for a web element repeatedly at regular intervals until timeout happens or until the object is found;
		 */

		// Implicit Wait //NoSuchElement; because it's global means there's no such elements
		SetupDrivers.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Explicit Wait   //ElementNotVisible; because it's conditional and if the element not found it's not visible
		WebDriverWait explicitWait = new WebDriverWait(SetupDrivers.driver, 10);
		explicitWait.until(ExpectedConditions.elementToBeClickable(EbayHomepageLocatorsObj.btnSearch));

		// Fluent Wait //
		FluentWait fluentWait = new FluentWait(SetupDrivers.driver);
		fluentWait.withTimeout(10, TimeUnit.SECONDS);
		fluentWait.pollingEvery(2, TimeUnit.SECONDS);
	}

	// Method Overloading
	public void keyboardKeys() {//alternate of btnclick
		EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.ENTER);
		EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.UP);
		EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.DOWN);
		EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.CLEAR);
		EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.DELETE);
	}

	// To handle pop up window
	public void handleAlert() {
		SetupDrivers.driver.switchTo().alert().accept();
		SetupDrivers.driver.switchTo().alert().dismiss();
		SetupDrivers.driver.switchTo().alert().getText();
		SetupDrivers.driver.switchTo().alert().sendKeys("awesome");
	}

	// to handle JavaScript; JavaScriptExecutor is used when Selenium Webdriver fails to click on any element due to some issue.
	//based on Scenario we use JavaScriptExecutor
	public void javaScriptExecutor() {

		JavascriptExecutor js = (JavascriptExecutor) SetupDrivers.driver; // Creating JS object

		js.executeScript("");

		js.executeScript("EbayHomePageLocatorsObj.btnSearch.click();"); // Clicking on element

		js.executeScript("EbayHomePageLocatorsObj.txtbxSearch.value ='shirt';"); // Writing something

		js.executeScript("EbaySearchResultLocatorsObj.cbxBrandNike.checked=true;"); // Interect Checkbox

		js.executeScript("window.location = 'http://upskill.com';"); // initializing location

		js.executeScript("location.reload()"); // Refresh browser

		js.executeScript("alert('Confirmation');"); // Alert

		js.executeScript("window.scrollBy(0,500)", ""); // Scroll down to specific pixel

		js.executeScript("window.scrollBy(0,-500)", ""); // Scroll up to specific pixel

		js.executeScript("arguments[0].scrollIntoView();", EbayHomepageLocatorsObj.btnSearch); // Scroll to a object

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); // Scroll down to bottom of website
	}
	


//
//	public void searchShoes() {
//		EbayHomepageLocatorsObj.txtBoxSearch.sendKeys("Shoes");
//		// Explicit Wait
//		WebDriverWait explicitWait = new WebDriverWait(SetupDrivers.driver, 10);
//		explicitWait.until(ExpectedConditions.elementToBeClickable(EbayHomepageLocatorsObj.btnSearch));
//
//	}
	public void searchShoes() throws Exception {
		
		EbayHomepageLocatorsObj.txtBoxSearch.sendKeys(PracticeReadExcelSheet.getMapData("Riza"));
		EbayHomepageLocatorsObj.btnSearch.click();
	
	}
	public void searchbutton() {
		// EbayHomepageLocatorsObj.clkBtn.click();
		EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.ENTER);
	}

//	}
//
//	public void searchShirts() {
//		EbayHomepageLocatorsObj.txtBoxSearch.sendKeys("Shirts");
//
//	}
//
//	public void searchbutton2() {
//
//		EbayHomepageLocatorsObj.clkBtn.click();
//	}
//
//	public void searchPants() {
//		EbayHomepageLocatorsObj.txtBoxSearch.sendKeys("Pants");
//	}
//
//	public void searchbutton3() {
//		EbayHomepageLocatorsObj.clkBtn.click();
//	}
//	
//	
}
