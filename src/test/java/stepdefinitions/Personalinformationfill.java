package stepdefinitions;

import TestUtil.Utility;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Personalinformation;

public class Personalinformationfill 

{
	
	Utility utility;
	public Personalinformationfill(Utility utility)
	{
		this.utility=utility;
	}
	
	@Given("user on accounts page")
	public void user_on_accounts_page() 
	{
		Personalinformation landedonaccountpage = utility.pageobjectmanager.personaldetails();
		landedonaccountpage.checkinguserinaccountpage();
	}

	@When("enter first and last name")
	public void enter_first_and_last_name() 
	{
		Personalinformation nameinput = utility.pageobjectmanager.personaldetails();
		nameinput.passingfirstname();
		nameinput.passinglastname();	
	}

	@Then("user can click on next")
	public void user_can_click_on_next() 
	{
		Personalinformation nextpage = utility.pageobjectmanager.personaldetails();
		nextpage.clickonnextbutton();
		
	}

	@Given("user on basic infromation page")
	public void user_on_basic_infromation_page() 
	{
		Personalinformation monthdobselect = utility.pageobjectmanager.personaldetails();
		monthdobselect.fillingdobdetailsmonth();
	       
	}

	@When("provides date of birth details")
	public void provides_date_of_birth_details() 
	{
		Personalinformation dobotherdetails = utility.pageobjectmanager.personaldetails();
		dobotherdetails.fillingdobdetailsday();
		dobotherdetails.fillingdobdetailsyear();
		
	}

	@When("provides gender details")
	public void provides_gender_details() 
	{
		Personalinformation genderdetails = utility.pageobjectmanager.personaldetails();
		genderdetails.selectinggender();
		
	}

}
