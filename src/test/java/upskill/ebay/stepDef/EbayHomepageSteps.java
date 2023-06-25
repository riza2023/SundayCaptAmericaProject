package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomepageActions;

public class EbayHomepageSteps {
	
	EbayHomepageActions EbayHomepageActionsObj = new EbayHomepageActions();
     

	//Ebay Search for Shoes
	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
		Thread.sleep(2000);
	}
	

	//Mousehover
	@When("^Mouse Hover to MyEbay Summary$")
	public void mouse_Hover_to_MyEbay_Summary() throws Throwable {
		EbayHomepageActionsObj.mouseHoverMyEbay();
	}
	

	@Then("^Click on Summary$")
	public void click_on_Summary() throws Throwable {
		EbayHomepageActionsObj.clickSummery();
	}



	@Given("^Search for men pants$")
	public void search_for_mens_pants() throws Throwable {
		EbayHomepageActionsObj.searchItems("men pants");
	}

	@Given("^Search for Mens Shoes$")
	public void search_for_Mens_Shoes() throws Throwable {
		EbayHomepageActionsObj.searchItems("Mens Shoes");
		Thread.sleep(2000);
	}
	

	//Ebay Search for Shoes
	@When("^Search for Shoes$")
	public void search_for_shoes() throws Throwable {
		EbayHomepageActionsObj.searchShoes();
		Thread.sleep(2000);
	}
	
@When("^Click search button$")
public void click_search_button() throws Throwable {
	EbayHomepageActionsObj.searchbutton();
}
	
	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
		EbayHomepageActionsObj.searchItems(items);
		Thread.sleep(2000);
	}
	
	@Given("^Search for Big Tall Cotton Tee$")
	public void search_for_Big_Tall_Cotton_Tee() throws Throwable {
		EbayHomepageActionsObj.searchItems("Big & Tall Cotton Tee");
	}

	
}


//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////package upskill.ebay.stepDef;
////
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.When;
////import upskill.ebay.pageAction.EbayHomepageActions;
////
////public class EbayHomepageSteps {
////	
////	EbayHomepageActions EbayHomepageActionsObj= new EbayHomepageActions();
////	
////	@Given("^Open Ebay Homepage$")
////	public void open_Ebay_Homepage() throws Throwable {
////	    Thread.sleep(2000);
////	}
////	
////	@Given("^Search for \"([^\"]*)\"$")
////	public void search_for(String items) throws Throwable {
////		EbayHomepageActionsObj.searchItems(items);
////		Thread.sleep(2000);
////	}
////
////	
////
////
////
////	@When("^Search for Shoes$")
////	public void search_for_Shoes() throws Throwable {
////		EbayHomepageActionsObj.searchShoes();
////	}
////
////	@When("^Click search button$")
////	public void click_search_button() throws Throwable {
////		EbayHomepageActionsObj.searchbutton();
////	}
////	
////	@When("^Search for Shirt$")
////	public void search_for_Shirt() throws Throwable {
////		EbayHomepageActionsObj.searchShirts();
////	}
////	
////	@When("^Click search Button$")
////	public void click_search_Button() throws Throwable {
////		EbayHomepageActionsObj.searchbutton2();
////	}
////	
////	@When("^Search for Pants$")
////	public void search_for_Pants() throws Throwable {
////		EbayHomepageActionsObj.searchPants();
////	}
////	
////	@When("^Click on search button$")
////	public void click_on_search_button() throws Throwable {
////		EbayHomepageActionsObj.searchbutton3();
////	}
////	
////	
////	
////	
////	@Given("^Search for Big Tall Cotton Tee$")
////	public void search_for_Big_Tall_Cotton_Tee() throws Throwable {
////		EbayHomepageActionsObj.searchItems("Big & Tall Cotton Tee");
////	
////	}
////	
////	
////}
////	
//	
//	


	

