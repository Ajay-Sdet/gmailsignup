package Automation;

import java.io.File;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSimple 

{
@Test
public void login() 
{
	
	ChromeOptions co = new ChromeOptions();
	File file= new File("D:\\Softwares\\AdBlock-—-block-ads-across-the-web-Chrome-Web-Store.crx\\");
	   co.addExtensions(file);
	
	ChromeDriver driver = new ChromeDriver(co);
	driver.get("https://demo.automationtesting.in/FileUpload.html");
	
	String file1= "C:\\Users\\Ajay Singh\\Downloads\\No Due Form .docx";
	String file2= "C:\\Users\\Ajay Singh\\OneDrive\\Documents\\Document (1).docx";
	
	
	driver.findElement(By.id("input-4")).sendKeys(file1+"\n"+file2);
	 

}



}





























//dataprovider = "first", dataProviderClass="DataProviderClass.class"    @DataProvider(name="first")
// Test case >>                                                          DataProvder Class >>            Excelutility >> Excel