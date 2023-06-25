package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RahulShettyLocators {
	

	
	
	//Home Button
	@FindBy(xpath = "(//a[text()='Home'])[1]")
	public WebElement btnHome;
	
	//(//a[contains(text(), 'Home')])[1]
	

	
	
	//Handle Alert H.W Practice Steps 3
	@FindBy(xpath = "//input[@value='Alert']")
	public WebElement clickAlert;

	@FindBy(xpath = "//input[@value='Confirm']")
	public WebElement clickConfirm;
	//Handle Alert H.W Practice Steps 3

}





