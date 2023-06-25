package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.RahulShettyActions;

public class RahulShettySteps {

	RahulShettyActions RahulShettyActionsObj= new RahulShettyActions();
	
	
	//Rahul Shetty; open homepage
	

	@Given("^Open Shetty Homepage$")
	public void open_Shetty_Homepage() throws Throwable {
		RahulShettyActionsObj.loadShettyHomepage();
	}

	@When("^Click on iFrame Home$")
	public void click_on_iFrame_Home() throws Throwable {
		RahulShettyActionsObj.clickIframeHome();
	}

	@Then("^It should reload iframe homepage$")
	public void it_should_reload_iframe_homepage() throws Throwable {
		RahulShettyActionsObj.verifyShettyHome();
	}


	
	
	//Handle Alert H.W Practice Steps 3
	@Given("^Open Rahul Shetty Homepage$")
	public void open_Rahul_Shetty_Homepage() throws Throwable {
		
	}
	@When("^Click on Alert$")
	public void click_on_Alert() throws Throwable {
		RahulShettyActionsObj.clickAlert();
	}

	@When("^Click OK button on the PopUp window$")
	public void click_OK_button_on_the_PopUp_window() throws Throwable {
		RahulShettyActionsObj.clickOK();
	}

	@Then("^Click on Confirm$")
	public void click_on_Confirm() throws Throwable {
		RahulShettyActionsObj.clickConfirm();
	}

	@Then("^Click Cancel button on the PopUp window$")
	public void click_Cancel_button_on_the_PopUp_window() throws Throwable {
		RahulShettyActionsObj.clickCancel();
	}

	////End of H.W 
	
}








