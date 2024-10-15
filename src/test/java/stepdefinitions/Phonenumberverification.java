package stepdefinitions;

import TestUtil.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Phonenumberverify;

public class Phonenumberverification 

{   
	Utility utility;
	public Phonenumberverification (Utility utility)
	{
		this.utility=utility;
	}
	
	@Given("user on confirm you are not a robot page")
	public void user_on_confirm_you_are_not_a_robot_page() 
	{
		Phonenumberverify user = utility.pageobjectmanager.phonenumber();
	       user.useronphoneverification(); 
	}

	@When("select india country from the dropdown list")
	public void select_india_country_from_the_dropdown_list() 
	{
		Phonenumberverify userselect = utility.pageobjectmanager.phonenumber();
		userselect.countrycode();
	}

	@When("provide valid phone number")
	public void provide_valid_phone_number() 
	{
		Phonenumberverify aftercountrycode = utility.pageobjectmanager.phonenumber();
		aftercountrycode.typephonenumber();
		
	}
	@Then("click on next to verify phone number verification")
	public void click_on_next_to_verify_phone_number_verification()
	{
		Phonenumberverify nowuser = utility.pageobjectmanager.phonenumber();
		nowuser.submit();
		
	}

	@Given("user on verification page")
	public void user_on_verification_page() 
	{
		Phonenumberverify useroncodepage = utility.pageobjectmanager.phonenumber();
		useroncodepage.verifyoncodepage();
	     
	}

	@When("provides the verification code")
	public void provides_the_verification_code() 
	{
		Phonenumberverify usernow = utility.pageobjectmanager.phonenumber();
		usernow.validatecode();
	}

	
}
