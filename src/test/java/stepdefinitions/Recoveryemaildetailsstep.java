package stepdefinitions;
import TestUtil.Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Recoveryemaildetails;

public class Recoveryemaildetailsstep 
{
	Utility utility;
	public Recoveryemaildetailsstep(Utility utility)
	{
		this.utility=utility;
	}
	
	@Given("user on recovery page")
	public void user_on_recovery_page() 
	{
		Recoveryemaildetails re = utility.pageobjectmanager.recoveryemail();
		re.landedtorecoverypage();
	}

	@When("clicks on skip")
	public void clicks_on_skip() 
	{
		Recoveryemaildetails avoid = utility.pageobjectmanager.recoveryemail();
		avoid.invalidstep();
	}

	@Then("user will skip the page")
	public void user_will_skip_the_page() 
	{
		Recoveryemaildetails user = utility.pageobjectmanager.recoveryemail();
		user.clickonskip();
	    
	}
}
