package pageobjects;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Privacyagreement 
{
	WebDriver driver;
	public Privacyagreement (WebDriver driver)
	{
		this.driver=driver;
	}
	
	By btn = (By.xpath("//button[@type='button']"));

	public void agreementpage()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Drivers & Jars\\chrome\\chromedriver.exe\\");
		driver = new ChromeDriver();
		
		   String fp = driver.getCurrentUrl();
		   if(fp.equals("https://accounts.google.com/lifecycle/steps/signup/termsofservice?TL=ALv_Gf-5dbegR9CrC32r9pP0CKAVWLB9n4oEtWbTs7PUbEKSCMxbz-JfpekmbBJz&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ddm=0&dsh=S1929594253%3A1713976749134438&ec=asw-gmail-globalnav-create&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en-US&service=mail&theme=mn"))
		   {
			   Assert.assertTrue(true);
		   }
		else
		{
			Assert.assertFalse(false);
		}
	}
	public void scrolldown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");	
	}
	public void clickagree ()
	{
		driver.findElement(btn).click();
	}
}
