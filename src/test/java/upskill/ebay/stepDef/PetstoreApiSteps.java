package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.api.restassured.PetStoreRestAssuredActions;

public class PetstoreApiSteps{
	
	PetStoreRestAssuredActions PetStoreRestAssuredActionsObj = new PetStoreRestAssuredActions();
	@Given("^Create pet$")
	public void create_pet() throws Throwable {
		PetStoreRestAssuredActionsObj.createPet(); 
	}

	@Given("^Update pet$")
	public void update_pet() throws Throwable {
		PetStoreRestAssuredActionsObj.updatePet();
	}

	@When("^Get   pet$")
	public void get_pet() throws Throwable {
		PetStoreRestAssuredActionsObj.getClass();
	}

	@Then("^Delete pet$")
	public void delete_pet() throws Throwable {
		PetStoreRestAssuredActionsObj.deletePet();
	}
}