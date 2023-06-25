package upskill.api.restassured;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserRestAssuredSteps {

	UserRestAssuredActions UserRestAssuredActionsObj = new UserRestAssuredActions();
	

@Given("^Create user$")
public void create_user() throws Throwable {
	UserRestAssuredActionsObj.createUser(); 
}

@Given("^Get    user$")
public void get_user() throws Throwable {
	UserRestAssuredActionsObj.getUser();  
}

@When("^Update user$")
public void update_user() throws Throwable {
	UserRestAssuredActionsObj.updateUser();
}

@Then("^Delete user$")
public void delete_user() throws Throwable {
	UserRestAssuredActionsObj.deleteUser(); 
}
}
