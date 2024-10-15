package stepdefinitions;

import TestUtil.Utility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Selectingtypeofuser;

public class Selectingtypeofuse 

{
	Utility utility;
	public Selectingtypeofuse (Utility utility)
	{
		this.utility=utility;
	}
	
	@When("click on dropdown button")
	public void click_on_dropdown_button()
	{
		
		
		Selectingtypeofuser movetodropdownbutton = utility.pageobjectmanager.selectuser();
		movetodropdownbutton.clickdropdown();
		
	}            

	@Then("dropdown list appears")
	public void dropdown_list_appears() 
	{

		
		
		Selectingtypeofuser listappears = utility.pageobjectmanager.selectuser();
		listappears.checkforlists();
		
	}

	@Then("user selects the type of user to create")
	public void user_selects_the_type_of_user_to_create()
	
	{
		Selectingtypeofuser selectingfromlist = utility.pageobjectmanager.selectuser();
		selectingfromlist.clickfirstdropdownoption();
			
	    
	}

}
