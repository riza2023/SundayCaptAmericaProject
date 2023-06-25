package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbaySearchResultActions;

public class EbaySearchResultSteps {
	
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();

	@When("^Select the first pants$")
	public void select_the_first_pants() throws Throwable {
		EbaySearchResultActionsObj.selectFirstPants();
		Thread.sleep(3000);
	}

//@When("^Select the first shoes$")
//public void select_the_first_shoes() throws Throwable {
//	EbaySearchResultActionsObj.selectFirstShoes();
//	Thread.sleep(2000);
//}

	
@Then("^Item list should have only Shoes related products$")
public void item_list_should_have_only_shoes_related_products() throws Throwable {
	EbaySearchResultActionsObj.verifyShoes();
	Thread.sleep(2000);
}


	
//	@When("^Filter by \"([^\"]*)\"$")
//	public void filter_by(String brand) throws Throwable {
//		EbaySearchResultActionsObj.filterBrand(brand);
//		Thread.sleep(2000);
//	}
//	
//	@Then("^Item list should have products of \"([^\"]*)\"$")
//	public void item_list_should_have_products_of(String brand) throws Throwable {
//		EbaySearchResultActionsObj.verifyBrandItems(brand);
//		Thread.sleep(2000);
//	}
//	
//	@When("^Select the first shirt on item list$")
//	public void select_the_first_shirt_on_item_list() throws Throwable {
//		EbaySearchResultActionsObj.selectBigTallTee();
//		Thread.sleep(2000);
//	}
//	































//package upskill.ebay.stepDef;
//
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import upskill.ebay.pageAction.EbaySearchResultActions;
//
//public class EbaySeachResultSteps {
//
//	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();
//
//
//	
//	
//	@When("^Filter by \"([^\"]*)\"$")
//	public void filter_by(String brand) throws Throwable {
//		EbaySearchResultActionsObj.filterBrand(brand);
//	}
//	@Then("^Items list should have products of \"([^\"]*)\"$")
//	public void items_list_should_have_products_of(String Brand) throws Throwable {
//		EbaySearchResultActionsObj.verifyBrandItems(Brand);
//		Thread.sleep(2000); 
//	}
//
//		
	@When("^Select the first shirt on item list$")
	public void select_the_first_shirt_on_item_list() throws Throwable {
		EbaySearchResultActionsObj.selectBigTallTee();
		
		
	}
	}
	
//	
//}



//@Then("^Item list should have only Shoes related products$")
//public void item_list_should_have_only_Shoes_related_products() throws Throwable {
// EbaySearchResultActionsObj.verifyShoes();
//	
//}
//
//@Then("^Item list should have only Shirt related products$")
//public void item_list_should_have_only_Shirt_related_products() throws Throwable {
//	EbaySearchResultActionsObj.verifyShirts();
//	Thread.sleep(2000);
//	
//}
//@Then("^Item list should have only Pants related products$")
//public void item_list_should_have_only_Pants_related_products() throws Throwable {
//	EbaySearchResultActionsObj.verifyPants();
//	Thread.sleep(2000); 
//	
//}

