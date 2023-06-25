package upskill.ebay.pageAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.MacysiFrameLocators;
import upskill.utilities.SetupDrivers;

public class MacysiFrameAction {
	MacysiFrameLocators MacysiFrameLocatorsObj;
	
	public MacysiFrameAction() {
		MacysiFrameLocatorsObj= new MacysiFrameLocators();
		 PageFactory.initElements(SetupDrivers.driver, MacysiFrameLocatorsObj);
	}
	
	
	public void macyslHome() throws Exception {
		 SetupDrivers.driver.get("https://www.macys.com/");
		 Thread.sleep(3000);
	}
    public void clickShopNow() {
    	List<WebElement> iframeObj= SetupDrivers.driver.findElements(By.xpath("//iframe[@aria-label='Advertisement']"));
		
    			
   for (int i = 0; i < iframeObj.size(); i++) //lower limit, upperlimit, ascending
   SetupDrivers.driver.switchTo().frame(i);
   
   try {
	   MacysiFrameLocatorsObj.clickDirection.click();
	   
   }catch(Exception e) {
	   System.out.println("Element not found");
	   
  }
   
	
  
	}

    public void verifyDKNYPage() throws Exception {
    	Thread.sleep(5000);
    	MacysiFrameLocatorsObj.veryfyDirection.isDisplayed();
    	Thread.sleep(5000);
}

}




