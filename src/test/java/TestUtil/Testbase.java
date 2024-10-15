package TestUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Testbase 
{
  public WebDriver driver;
	
	public WebDriver Webdrivermanager () throws IOException
	{
		FileInputStream fis = new FileInputStream (System.getProperty("user.dir")+"\\src\\test\\resource\\Globalfile.properties");
		Properties prop = new Properties ();
		prop.load(fis);		
		if(driver == null)
		{
			if (prop.getProperty("browser").equalsIgnoreCase("chrome"))
			{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Drivers & Jars\\chrome\\chromedriver.exe\\");
		
		driver = new ChromeDriver();
			}
	    System.out.println("https://www.google.com/");
		}
	    return driver;
	}
	    public Properties fileinput () throws IOException
	    {
	    	FileInputStream fis = new FileInputStream (System.getProperty("user.dir")+"\\src\\test\\resource\\Globalfile.properties");
			Properties prop = new Properties ();
			prop.load(fis);	
	    
	    return prop;
	    }

}

