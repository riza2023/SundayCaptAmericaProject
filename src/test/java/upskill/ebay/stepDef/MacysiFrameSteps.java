package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.MacysiFrameAction;

public class MacysiFrameSteps {
	
	
	MacysiFrameAction MacysiFrameLocatorsObj= new MacysiFrameAction();
	

@Given("^Open Macys Homepage$")
public void open_Macys_Homepage() throws Throwable {
	MacysiFrameLocatorsObj.macyslHome();
}

@When("^Click on  iFrame shop now$")
public void click_on_iFrame_shop_now() throws Throwable {
	MacysiFrameLocatorsObj.clickShopNow();
}

@Then("^User should able to see a new DKNY page$")
public void user_should_able_to_see_a_new_DKNY_page() throws Throwable {
	MacysiFrameLocatorsObj.verifyDKNYPage();
	
	
	
}



}



