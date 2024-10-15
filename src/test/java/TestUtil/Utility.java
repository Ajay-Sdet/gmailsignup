package TestUtil;

import org.openqa.selenium.WebDriver;
import pageobjects.PageObjectManager;

public class Utility 
{
	public WebDriver driver;
	public Testbase testbase;
	public PageObjectManager pageobjectmanager;
	
	public Utility ()
	{
		testbase = new Testbase();
		pageobjectmanager = new PageObjectManager(testbase.driver);
	}
}
