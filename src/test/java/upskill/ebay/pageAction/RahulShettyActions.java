package upskill.ebay.pageAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.RahulShettyLocators;
import upskill.utilities.SetupDrivers;


public class RahulShettyActions {
	RahulShettyLocators RahulShettyLocatorsObj;

	public RahulShettyActions() {
		RahulShettyLocatorsObj = new RahulShettyLocators();
		PageFactory.initElements(SetupDrivers.driver, RahulShettyLocatorsObj);
	}

	public void loadShettyHomepage() throws Exception {
     SetupDrivers.driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	 Thread.sleep(3000);
	}
//**We find the elements by id from frame list .We use for loop by using array list size 
	//we search webelement in Java by Selenium.
	
	public void clickIframeHome() {
		//SetupDrivers.driver.findElement(By.id("courses-iframe")); // to handle one iFrame
		
		
		List<WebElement> framelist = SetupDrivers.driver.findElements(By.id("courses-iframe")); // to handle multiple iFrame
		                                           //(By.xpath("//iframe[@id='courses-iframe']"));
		
		//we intialize list<WebElement> as framelist
		//framelist value here:SetupDrivers.driver.findElements(By.id("courses-iframe")); which means: 
		//we are calling setup drivers to find elements by ID of webelement framelist which is courses-iframe
		//courses-iframe is id of rahulshetty's iframe's xpath; which we are looking for.
		//arraylistCollection=framelist
		//it's alternative of xpath
		// list import from Java utility;webelement from Selenium; //iframeId,from xpath
		
		
		for (int i = 0; i < framelist.size(); i++)
			                     // arrayListSize
			SetupDrivers.driver.switchTo().frame(i); // to handle one iframe
		
		//we are using for loops for multiple iFrame
		//here i=variable where int starts with 0 to upperlimit until we get the target frame size which is "courses-iframe"
		
		try {
			
			RahulShettyLocatorsObj.btnHome.click();
		} catch (Exception e) {
			System.out.println("Element not found in this iframe");
		}
		}
	// since iFrmae is dynamic error could be happen so need to use Try Catch to find exception
	//once locator finds correct element it will click otherwise it will catch as "Element not found in this iframe"
	
    public void verifyShettyHome() throws Exception {
		Thread.sleep(5000);
		RahulShettyLocatorsObj.btnHome.isDisplayed();
}
//last step verification; we find iframehome and it displayed.






//Handle Alert H.W Practice Steps 3
public void clickAlert() throws Exception {
	RahulShettyLocatorsObj.clickAlert.click();
	Thread.sleep(3000);
}
public void clickOK() throws Exception {
	SetupDrivers.driver.switchTo().alert().accept();
	Thread.sleep(3000);
}

public void clickConfirm() throws Exception {
	RahulShettyLocatorsObj.clickConfirm.click();
	Thread.sleep(3000);
}
public void clickCancel() throws Exception {
	SetupDrivers.driver.switchTo().alert().dismiss();
	Thread.sleep(3000);
}
//Handle Alert H.W Practice Steps 3
}
	




