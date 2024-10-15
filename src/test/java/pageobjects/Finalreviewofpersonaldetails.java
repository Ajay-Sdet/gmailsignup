package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class Finalreviewofpersonaldetails 
{   WebDriver driver;
	public Finalreviewofpersonaldetails (WebDriver driver)
	{
		this.driver=driver;
	}
	
	By onreviewpage =(By.xpath("//span[text()='Review your account info']"));
	By usernamereview=(By.xpath("//div[@class='pGzURd']"));
	By gmailreview=(By.xpath("//div[@class='yAlK0b']"));
	By mobilereview =(By.xpath("//span[@jsname='wKtwcc'] "));
	By click = (By.xpath("//button[@type='button']"));
	
	public void useronreviewpage ()
	{
		String fr = driver.findElement(onreviewpage).getText();
	     
		 if(fr.equals("Review your account info"))
		 {
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 Assert.assertFalse(false);
			 Assert.fail();
		 }
	}
	public void userreviews ()
	{
		String nm = driver.findElement(usernamereview).getText();
		   if(nm.isEmpty())
		   {
			   System.out.println("Name:  + nm");
		   }
		   else
		   {
			   System.out.println("Nothing display");
		   }
		   String gm = driver.findElement(gmailreview).getText();
		   if(gm.isEmpty())
		   {
			   System.out.print("Gmail:  + gm");
		   }
		   
		   String mb = driver.findElement(mobilereview).getText();
		   if(mb.isEmpty())
		   {
			   System.out.println("Mobile   + mb");
		   }
	}
	public void submit ()
	{
		driver.findElement(click).click();
	}
}
