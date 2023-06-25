package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.PracticeBuyitNowActions;

public class PracticeBuyitNowSteps {

	PracticeBuyitNowActions PracticeBuyitNowActionsObj= new PracticeBuyitNowActions();

@When("^Select color$")
public void select_color() throws Throwable {
	Thread.sleep(5000);
	PracticeBuyitNowActionsObj.newWindowforPants();
	PracticeBuyitNowActionsObj.selectColor();
	Thread.sleep(5000);
}

@When("^Select size$")
public void select_size() throws Throwable {
	Thread.sleep(5000);
	PracticeBuyitNowActionsObj.selectSize();
	Thread.sleep(5000);
}

@When("^Select amount$")
public void select_amount() throws Throwable {
	Thread.sleep(5000);
	PracticeBuyitNowActionsObj.selectAmount();
	Thread.sleep(5000);
}

@Then("^Add to buy it now$")
public void add_to_buy_it_now() throws Throwable {
	Thread.sleep(5000);
	PracticeBuyitNowActionsObj.selectButitNow();
	Thread.sleep(5000);
}
}

//@When("^Select color$")
//public void select_color() throws Throwable {
//	PracticeBuyitNowActionsObj.newWindow();
//	PracticeBuyitNowActionsObj.selectColors();
//	
//}
//
//@When("^Select size$")
//public void select_size() throws Throwable {
//	PracticeBuyitNowActionsObj.selectSize();
//}
//
//@When("^Select amount$")
//public void select_amount() throws Throwable {
//	PracticeBuyitNowActionsObj.selectAmount();
//}
//
//@Then("^Add to buy it now$")
//public void add_to_buy_it_now() throws Throwable {
//	PracticeBuyitNowActionsObj.addtoBuyitNow();
//}
//}









