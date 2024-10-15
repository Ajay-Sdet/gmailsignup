package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import TestUtil.Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Clickongmail;
import pageobjects.PageObjectManager;

public class Navigatetogoogleandclikgmail

{   PageObjectManager pageobjectmanager;
	public Utility utility;
	public Navigatetogoogleandclikgmail(Utility utility)
	{
		this.utility=utility;
	}
	
	  
	@Given("Google website url")
	public void google_website_url() throws IOException 
	{
		utility.testbase.Webdrivermanager();
	   
	}
	  
	@When("Google url hits on url search")
	public void google_url_hits_on_url_search() 
	{
		pageobjectmanager = new PageObjectManager(utility.driver);
		Clickongmail givenurl = pageobjectmanager.clickongmail;
		givenurl.searchgoogle();
	   
	}
	  
	@Then("Google page opens")
	public void google_page_opens() 
	{
		Clickongmail afterfetch = new Clickongmail(utility.driver);
	    afterfetch.useringooglepage();
	}
	@Then("user can see the google page")
	public void user_can_see_the_google_page() 
	{
		Clickongmail check = new Clickongmail(utility.driver);
	    	check.usercanseegoogletitle();	  
	}
	  
	@When("user click on gmail link")
	public void user_click_on_gmail_link() 
	{
		Clickongmail movingtogmailbutton = new Clickongmail(utility.driver);
	     movingtogmailbutton.clickgmailbutton();
	  
	}
	  
	@Then("user will land on gmail page")
	public void user_will_land_on_gmail_page() 
	{
		Clickongmail afterclick = new Clickongmail(utility.driver);
	    afterclick.userongmailpag();
	}
	  
	@Then("user can see url {string}")
	public void user_can_see_url(String string) 
	{
		Clickongmail ongmailpage = new Clickongmail(utility.driver);
	    ongmailpage.canseeurltoverify(string);
	}
}
