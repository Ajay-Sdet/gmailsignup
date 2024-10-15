package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class Selectingtypeofuser 
{  WebDriver driver;
  
	public Selectingtypeofuser (WebDriver driver)
	{
		this.driver=driver;
	}
By dropdown = By.className("dropdown__label");
By selectoptionsfromlist = By.linkText("For my personal use");
By usergotofirstoption = By.linkText("For my personal use");
By secondoptioninlist = By.linkText("For my work or business");

public void clickdropdown()
{
	driver.findElement(dropdown).click();
}
public void checkforlists()
{
String t = driver.findElement(selectoptionsfromlist).getText();
	
	if (t.equals("selectoptionsfromlist"))
	{
		Assert.assertTrue(true);
	}
	else
	{
		Assert.assertFalse(false);
	}
	String t2 = driver.findElement(By.linkText("secondoptioninlist")).getText();

	{
     if(t2.equals("secondoptioninlist"))
     {
    	 Assert.assertTrue(true);
     }
     else
     {
    	 Assert.assertFalse(false);
     }
}
}
public void clickfirstdropdownoption()
{
	driver.findElement(usergotofirstoption).click();
    String url=driver.getCurrentUrl();
    if(url.equals("https://accounts.google.com/lifecycle/steps/signup/name?continue=https://mail.google.com/mail/&ddm=0&dsh=S-2012896103:1713504615850425&ec=asw-gmail-globalnav-create&flowEntry=SignUp&flowName=GlifWebSignIn&service=mail&theme=mn&TL=AEzbmxw4nXcJESa2yd6dCvcyspor_KE1IcKPzHSwi1YogaluYYxG0K4AVBuVIVl3"))
    {
    	Assert.assertTrue(true);
    }
    else
    {
    	Assert.assertFalse(false);
    }
}
}

