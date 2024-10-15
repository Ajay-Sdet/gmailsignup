package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Recoveryemaildetails 

{ 
	WebDriver driver;
	public Recoveryemaildetails (WebDriver driver)
	{
		this.driver=driver;
	}
	
	By recoveryemail =(By.xpath("//span[text()='Add recovery email']"));
    By skipbutton =(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
    
    public void landedtorecoverypage ()
    {
    	String re =	driver.findElement(recoveryemail).getText();
    	if(re.equals("Add recovery email"))	
    	{
    		Assert.assertTrue(true);
    	}
    	else
    	{
    		Assert.assertFalse(false);
    	}
    }
    public void invalidstep ()
    {
    	{
    		  System.out.println("invalid step"); 
    		}
    }
    public void clickonskip ()
    {
    	driver.findElement(skipbutton).click();
    }
}
