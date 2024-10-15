package stepdefinitions;
import TestUtil.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Privacyagreement;

public class Privacyagreementstep 

{
	Utility utility;
	public Privacyagreementstep(Utility utility)
	{
		this.utility=utility;
	}
	@Given("user on agreement page")
	public void user_on_agreement_page() 
	{
		Privacyagreement user = utility.pageobjectmanager.Privacyagreement();
		user.agreementpage();
	}

	@When("scrolls down to end page")
	public void scrolls_down_to_end_page() 
	{
		Privacyagreement than = utility.pageobjectmanager.Privacyagreement();
		than.scrolldown();
	}

	@When("click on i agree button")
	public void clcik_on_i_agree_button() 
	{
		Privacyagreement and = utility.pageobjectmanager.Privacyagreement();
		and.clickagree();
	}

	@Then("press next button")
	public void press_next_button() 
	{
	    
	}
	
}

