package upskill.api.restassured;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StoreRestAssuredSteps {
	StoreRestAssuredActions StoreRestAssuredActionsObj = new StoreRestAssuredActions();
	
	@Given("^Create store$")
	public void create_store() throws Throwable {
		StoreRestAssuredActionsObj.createstore();
	}

	@Given("^Get    store$")
	public void get_store() throws Throwable {
		StoreRestAssuredActionsObj.getstore();
	}


	@Then("^Delete store$")
	public void delete_store() throws Throwable {
		StoreRestAssuredActionsObj.deletestore();
	}



}
