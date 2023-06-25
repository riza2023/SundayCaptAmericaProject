package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeBuyitNowLocators {

	//practice.pant buy
	@FindBy(xpath="//select[@selectboxlabel='Trouser Color']")
	public WebElement ddPantColor; 
	
	@FindBy(xpath="//select[@selectboxlabel='Waist Size']")
	public WebElement ddPantSize; 
	
	@FindBy(xpath="(//input[@name='quantity'])[1]")
	public WebElement txbxPantQuantity; 
	
	@FindBy(xpath="//a[@id='binBtn_btn_1']")
	public WebElement btnAddtoCart; 
	

//	@FindBy(xpath="//select[@id='x-msku__select-box-1000']")
//	public WebElement ddColors; 
//	//select[@id='x-msku__select-box-1000']
//	//select[@aria-label='Please select a Color']
//	//select[@id='x-msku__select-box-1000']
//	
//	@FindBy(xpath="//select[@aria-label='Please select a Size']")
//	public WebElement ddSize; 
//	
//	@FindBy(xpath="//input[@id='qtyTextBox']")
//	public WebElement txtbxqty; 
//	
//	@FindBy(xpath="//span[text()='Buy It Now']")
//	public WebElement btnbuyitnow; 
//
//

////Shirt size type
//	@FindBy(xpath="//select[@aria-label='Please select a Size Type']")
//	public WebElement ddSizeType;
	
	
}

