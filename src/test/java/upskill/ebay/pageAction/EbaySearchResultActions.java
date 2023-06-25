package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;


import upskill.ebay.pageElements.EbaySearchResultLocators;
import upskill.utilities.SetupDrivers;

public class EbaySearchResultActions {

	EbaySearchResultLocators EbaySearchResultLocatorsObj;

	public EbaySearchResultActions() {

		EbaySearchResultLocatorsObj = new EbaySearchResultLocators();

		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);

	}
	//buypants.pracice
	public void selectFirstPants() {
		EbaySearchResultLocatorsObj.linkPants.click();
		
	}
	
	public void selectBigTallTee() {
		EbaySearchResultLocatorsObj.linkShirtItem.click();
	}

//	
//	public void selectFirstShoes() {
//		EbaySearchResultLocatorsObj.linkFirstShoes.click();
//		
//		
//	}
//	
//	
//	
//	
//	
	

	
	
	

//	public void filterBrand(String brand) {
//		if (brand.equals("Nike")) {
//			EbaySearchResultLocatorsObj.cbxBrandNike.click();
//		} else if (brand.equals("Adidas")) {
//			EbaySearchResultLocatorsObj.cbxBrandAdidas.click();
//		} else if (brand.equals("Unbranded")) {
//			EbaySearchResultLocatorsObj.cbxBrandUnbranded.click();
//		} else {
//			System.out.println("Brand Not Found");
//		}
//	}
//	
//	public void verifyBrandItems(String brand) {
//		if (brand.equals("Nike")) {
//		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());
//			} else if (brand.equals("Adidas")) {
//		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShirts.isDisplayed());
//			} else if (brand.equals("Unbranded")) {
//		Assert.assertTrue(EbaySearchResultLocatorsObj.txtPants.isDisplayed());
//			} else {
//				System.out.println("Brand Items Not Found");
//			} 
//	
//	}
//
//}
//




//
//	public void filterBrand(String brand)  {
//		if (brand.equals("Gucci")) {
//			EbaySearchResultLocatorsObj.clickGucci.click();
//		} else if (brand.equals("Rolex")) {
//			EbaySearchResultLocatorsObj.clickRolex.click();
//		} else if (brand.equals("CHANEL")) {
//			EbaySearchResultLocatorsObj.clickCHANEL.click();
//		} else {
//			System.out.println("Brand Not Found");
//		}
//	
//	}
//
//	public void verifyBrandItems(String brand){
//		if(brand.equals("Gucci")) {
//			EbaySearchResultLocatorsObj.txtSunglasses.isDisplayed();	
//		} else if(brand.equals("Rolex")) {
//			EbaySearchResultLocatorsObj.txtWatches.isDisplayed();
//		} else if(brand.equals("CHANEL")) {
//			EbaySearchResultLocatorsObj.txtPerfumes.isDisplayed();
//		} else {
//			System.out.println("Brand items not found");
//		}
//	
////	public void filterBrand(String brand){
////		if(brand.equals("Gucci")) {
////			EbaySearchResultLocatorsObj.clickGucci.click();
////		} else if(brand.equals("Rolex")) {
////			EbaySearchResultLocatorsObj.clickRolex.click();
////		} else if(brand.equals("Chanel")) {
////			EbaySearchResultLocatorsObj.clickCHANEL.click();
////		} else {
////			System.out.println("Brand not found");
////		}
////		
////	}
////	
////	public void verifyBrandItems(String brand){
////		if(brand.equals("Gucci")) {
////			EbaySearchResultLocatorsObj.txtSunglasses.isDisplayed();	
////		} else if(brand.equals("Rolex")) {
////			EbaySearchResultLocatorsObj.txtWatches.isDisplayed();
////		} else if(brand.equals("Chanel")) {
////			EbaySearchResultLocatorsObj.txtPerfumes.isDisplayed();
////		} else {
////			System.out.println("Brand items not found");
////		}
////		
////		
////	}
//	
//	
//	
	
	
public void verifyShoes() {

	EbaySearchResultLocatorsObj.txtShoes.isDisplayed();

}
}
//
//public void verifyShirts() {
//	EbaySearchResultLocatorsObj.txtShirts.isDisplayed();
//
//}
//
//public void verifyPants() {
//	EbaySearchResultLocatorsObj.txtPants.isDisplayed();
//

//Option 1
//Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());

//Option 2
//Assert.assertEquals("Shoes", EbaySearchResultLocatorsObj.txtShoes.getText());

//Option 3
//EbaySearchResultLocatorsObj.txtShoes.isDisplayed();
//}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	}	
//
//}






