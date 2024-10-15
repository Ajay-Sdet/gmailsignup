package stepdefinitions;
import TestUtil.Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Finalreviewofpersonaldetails;

public class Finalreviewofpersonaldetailsstep 

{
	Utility utility;
	public Finalreviewofpersonaldetailsstep(Utility utility)
	{
		this.utility=utility;
	}
	@Given("user on review page")
	public void user_on_review_page() 
	{
		Finalreviewofpersonaldetails given = utility.pageobjectmanager.Finalreviewofpersonaldetails();
		given.useronreviewpage();
	}

	@When("review personal details username, email id , mobile number")
	public void review_personal_details_username_email_id_mobile_number() 
	{
	   
		Finalreviewofpersonaldetails when = utility.pageobjectmanager.Finalreviewofpersonaldetails();
	   when.userreviews();
	}

	@Then("click on next button")
	public void click_on_next_button()
	{
		Finalreviewofpersonaldetails than = utility.pageobjectmanager.Finalreviewofpersonaldetails();
		than.submit();
	}


}
