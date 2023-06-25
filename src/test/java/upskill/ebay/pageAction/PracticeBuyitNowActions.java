package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.ebay.pageElements.PracticeBuyitNowLocators;
import upskill.utilities.SetupDrivers;

public class PracticeBuyitNowActions {
	
PracticeBuyitNowLocators PracticeBuyitNowLocatorsObj;
	
public PracticeBuyitNowActions() {
PracticeBuyitNowLocatorsObj =new PracticeBuyitNowLocators();
PageFactory.initElements(SetupDrivers.driver,PracticeBuyitNowLocatorsObj);
		}

public void newWindowforPants() throws Exception {
	for(String windhandle: SetupDrivers.driver.getWindowHandles()) {
		SetupDrivers.driver.switchTo().window(windhandle);
		Thread.sleep(2000);
	}
}
public void selectColor() throws Exception {
	Thread.sleep(2000);
	Select dropdownObj= new Select(PracticeBuyitNowLocatorsObj.ddPantColor);
	dropdownObj.selectByVisibleText("Black");
	Thread.sleep(2000);
	
	
}

public void selectSize() throws Exception{
	Thread.sleep(2000);
	Select dropdownObj= new Select(PracticeBuyitNowLocatorsObj.ddPantSize);
	dropdownObj.selectByVisibleText("34 Waist x 30 Length");
	Thread.sleep(2000);
}
public void selectAmount() throws Exception {
	Thread.sleep(2000);
	PracticeBuyitNowLocatorsObj.txbxPantQuantity.clear();
	PracticeBuyitNowLocatorsObj.txbxPantQuantity.sendKeys("2");
}
public void selectButitNow() throws Exception {
	Thread.sleep(2000);
	PracticeBuyitNowLocatorsObj.btnAddtoCart.click();
	Thread.sleep(2000);
}

}
	
//public void newWindow() throws Exception {
//	for(String winhandle: SetupDrivers.driver.getWindowHandles()) {
//	SetupDrivers.driver.switchTo().window(winhandle);
//	Thread.sleep(5000);
//}
//
//}
//public void selectColors() throws Exception {
//	Thread.sleep(2000);
//	Select dropdownObj = new Select(PracticeBuyitNowLocatorsObj.ddColors);
//	dropdownObj.selectByVisibleText("Black / Carbon / Classic Red /...");
//	Thread.sleep(5000);
//
//	
//	Select dropDownObj = new Select(PracticeBuyitNowLocatorsObj.ddColors);
//			dropDownObj.selectByVisibleText("Black - Black");

//}
//public void selectSize() throws Exception {
//	Select dropdownObj = new Select(PracticeBuyitNowLocatorsObj.ddSize);
//	dropdownObj.selectByVisibleText("8");
//	Thread.sleep(5000);
//}
//public void selectAmount() throws Exception {
//	PracticeBuyitNowLocatorsObj.txtbxqty.clear();
//	Thread.sleep(5000);
//	PracticeBuyitNowLocatorsObj.txtbxqty.sendKeys("2");
//	Thread.sleep(5000);
//}
//public void addtoBuyitNow() throws Exception {
//	PracticeBuyitNowLocatorsObj.btnbuyitnow.click();
//	

//}
//}




