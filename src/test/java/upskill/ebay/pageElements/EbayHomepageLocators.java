package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomepageLocators {

	@FindBy(xpath = "//input[@placeholder='Search for anything']")
	public WebElement txtBoxSearch;
	
	@FindBy(xpath = "//input[@value='Search']")
	public WebElement btnSearch;

	//Mousehover
	@FindBy(xpath = "//a[@title='My eBay']")
	public WebElement linkMyEbay;
	
	
	@FindBy(xpath = "//a[contains(text(),'Summary')]")
	public WebElement linkSummary;

	
	
	


	

}




