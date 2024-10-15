package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Personalinformation 
{
	By pageinfocheck = By.xpath("//h1[@id='headingText");
    By firstname = By.xpath("//input[@id='firstName']");
    By lastname = By.xpath("//input[@id='lastName']");
    By next = By.xpath("//span[text()='Next']");
    By month = By.xpath("//select[@id='month']");
    By day = By.xpath("//input[@id='day']");
    By year = By.xpath("//input[@id='year']");
    By gender = By.xpath("//select[@id='gender']");
    
    WebDriver driver;
    
    public Personalinformation (WebDriver driver)
    {
   this.driver= driver;	
    }
    
    public void checkinguserinaccountpage ()
    {
    	String txt = driver.findElement(pageinfocheck).getText();
 	   
	    if (txt.equals("Create a Google Account"))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    	Assert.assertFalse(false);
	    }

  public void passingfirstname ()
  {
	  driver.findElement(firstname).sendKeys("Ajay");
  }
  
  public void passinglastname()
  {
	 driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Singh"); 
  }
  
  public void clickonnextbutton ()
  {
	 driver.findElement(By.xpath("//span[text()='Next']")).click(); 
  }
  
  public void fillingdobdetailsmonth ()
  {
	  WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	    Select s =new Select(month);
	    s.selectByVisibleText("March");
  }
  
  public void fillingdobdetailsday ()
  {
	  driver.findElement(By.xpath("//input[@id='day']")).sendKeys("2");
  }
  public void fillingdobdetailsyear()
  
  {
	  driver.findElement(By.xpath("//input[@id='year']")).sendKeys("1992");
  }
  public void selectinggender ()
  {
	  WebElement gender = driver.findElement(By.xpath("//select[@id='gender']"));
	    Select s = new Select(gender);
	    s.selectByVisibleText("Male");
  }
  
}   
    

