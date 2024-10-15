package stepdefinitions;
import TestUtil.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Usernameandpassword;

public class Usernameandpasswordsetup 

{   Usernameandpassword usernameandpassword;
	Utility utility;
	public Usernameandpasswordsetup(Utility utility)
	{
		this.utility=utility;
	}
	

	@Given("user on how you will sign in page")
	public void user_on_how_you_will_sign_in_page() 
	{
		usernameandpassword  = utility.pageobjectmanager.nameandpassword();
		usernameandpassword.usernamepage();
	}

	@When("gives valid username")
	public void gives_valid_username() 
	{
		Usernameandpassword user = utility.pageobjectmanager.nameandpassword();
		user.selectsusername();
	}

	@Then("user click on next")
	public void user_click_on_next() 
	{
		
		Usernameandpassword usernow = utility.pageobjectmanager.nameandpassword();
		usernow.submitusername();
	}

	@Given("user on create a strong password page")
	public void user_on_create_a_strong_password_page() 
	{
		Usernameandpassword landto = utility.pageobjectmanager.nameandpassword();
		landto.verifyonpasswordpage();
	}

	@When("gives valid password")
	public void gives_valid_password() 
	{
		Usernameandpassword and = utility.pageobjectmanager.nameandpassword();
		and.providepassword();
	}

	@When("reconfirm the given password")
	public void reconfirm_the_given_password() 
	{
		Usernameandpassword last = utility.pageobjectmanager.nameandpassword();
		last.reconfirmpassword();
	}
}
