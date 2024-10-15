package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Usernameandpassword
{  WebDriver driver; 
	public Usernameandpassword (WebDriver driver)
	{
		this.driver= driver;	
		
	}
	
	By onpage = By.xpath("//h1[@id='headingText']");
	By un =(By.xpath("//input[@name='Username']"));
	By clk =(By.xpath("//button[@type='button']"));
	By nxtp =(By.xpath("//span[text()='Create a strong password']"));
	By pwd =(By.xpath("//input[@name='Passwd']"));
	By repwd =(By.xpath("//input[@name='Passwd']"));
	
	
	public void usernamepage ()
	{
		String signin = driver.findElement(onpage).getText();
		 
		  if(signin.equals("How you’ll sign in"))
		 {
			 Assert.assertTrue(true);
		 }
				 
		 else
		{
			Assert.assertFalse(false);
		}
	}
	public void selectsusername ()
	{
		driver.findElement(un).sendKeys("ajaysingh132425364758"); 
	}
	public void submitusername ()
	{
		driver.findElement(By.xpath("//button[@type='button']")).click();
	}
	public void verifyonpasswordpage ()
	{
		String password=driver.findElement(nxtp).getText();
		 
	    if(password.equals("Create a strong password"))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertFalse(false);
	    }
	}
	public void providepassword ()
	{
		driver.findElement(pwd).sendKeys("Singh$123456"); 
	}
	public void reconfirmpassword()
	{
	driver.findElement(repwd).sendKeys("Singh$123456"); 
	}
}
