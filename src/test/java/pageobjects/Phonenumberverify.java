package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Phonenumberverify 
{  
	WebDriver driver;
	public Phonenumberverify (WebDriver driver)
	{
		this.driver=driver;
	}
	By textconfirmation = (By.xpath("//span[text()='Confirm you’re not a robot']"));
	By country = (By.xpath("//div[@class='VfPpkd-aPP78e']"));
	By Phone= (By.xpath("//input[@id='phoneNumberId']"));
	By next = (By.xpath("//span[text()='Next']"));
	By textverify =(By.xpath("//span[text()='Enter the code']"));
	By code = (By.xpath("//input[@name='code']"));
	By clicknext =(By.xpath("//button[@type='button']"));
	
	public void useronphoneverification ()
	{
		String confirm = driver.findElement(textconfirmation).getText();
		 
		   if(confirm.equals("Confirm you’re not a robot"))
		  {
			  Assert.assertTrue(true);
		  }
		  else
		  {
			  Assert.assertFalse(false);
			  Assert.fail("Test Failed mismatch of text");
		  }
	}
	public void countrycode()
	{
		WebElement country = driver.findElement(By.xpath("//div[@class='VfPpkd-aPP78e']"));
		   country.click();
		    Select sc = new Select(country);
		    sc.selectByValue("India (+91)");
	}
	public void typephonenumber ()
	{
		driver.findElement(Phone).sendKeys("8310898134");
	}
	public void submit()
	{
		driver.findElement(next).click();
	}
	public void verifyoncodepage ()
	{
     String ec = driver.findElement(textverify).getText();
	    
	    if (ec.equals("Enter the code"))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertFalse(false);
	    	Assert.fail();
	    }
	    
	}
	public void validatecode()
	{
		driver.findElement(code).sendKeys("code");
		driver.findElement(clicknext).click(); 
	}
}
