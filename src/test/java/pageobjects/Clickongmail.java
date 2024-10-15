package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Clickongmail 
{
	public WebDriver driver;
	
//	Utility utility;
	public Clickongmail(WebDriver drive)
	{
		driver=drive;
	}

By click = (By.linkText("Gmail"));
 

public void clickgmailbutton()
{
    driver.findElement(click).click();
}
public void useringooglepage()
{
	String url = driver.getCurrentUrl();
	   if (url.equals("https://www.google.com/"))
	   {
		Assert.assertTrue(true);
	   }
	   else
	   {
		   Assert.assertFalse(false);
	   }
	   System.out.println(url);
}

public void usercanseegoogletitle()
{
	String title = driver.getTitle();
    if (title.equals("Google"))
    {
    Assert.assertTrue(true);
    }
    else
    {
    	Assert.fail("User failed to see the google page");
    }
}
    
    public void searchgoogle ()
    {
    	 driver.get("https://www.google.com/");
    }
    public void userongmailpag ()
    {
    	String title2 = driver.getTitle();
 	   if (title2.equals("https://www.google.com/gmail/about/"))
 	   {
 		   Assert.assertTrue(true);
 	   }
 	   else
 	   {
 		   Assert.assertFalse(false);
 	   }
 	}
    public void canseeurltoverify(String url)
    {
    	String title3 = driver.getCurrentUrl();
 	   if (title3.contentEquals(url))
 	   {
 		   Assert.assertTrue(true);
 	   }
 	   else
 	   {
 		   Assert.assertFalse(false, "Url is incorrect");
 	   }
    }
  }


