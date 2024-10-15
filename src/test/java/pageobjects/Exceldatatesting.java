package pageobjects;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import TestUtil.ExcelUtility;

public class Exceldatatesting {

	public static void main(String[] args) throws IOException, InterruptedException 
	
	{
		
		
	     ChromeDriver driver = new ChromeDriver();
	     driver.manage().window().fullscreen();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
	     Thread.sleep(5000); 
	     driver.findElement(By.id("wzrk-cancel")).click();
	     Thread.sleep(5000);  
	     
         String filepath = System.getProperty("user.dir")+"\\test data excel\\calcdata.xlsx";
       
          int totalrow= ExcelUtility.getRowCount(filepath,"Sheet1");
     
     for(int r=1;r<=totalrow;r++)
     {
    	String principal= ExcelUtility.getCellData(filepath, "Sheet1",r,0);
    	String roi= ExcelUtility.getCellData(filepath, "Sheet1",r,1);
    	String per1= ExcelUtility.getCellData(filepath, "Sheet1",r,2);
    	String per2= ExcelUtility.getCellData(filepath, "Sheet1",r,3);
    	String frequency= ExcelUtility.getCellData(filepath, "Sheet1",r,4);
    	String exp_value= ExcelUtility.getCellData(filepath, "Sheet1",r,5);
    	
    	
    	
    	driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(principal);
    	driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(roi);
    	driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
    	
    	Select sc = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
    	sc.selectByVisibleText(per2);
    	
    	Select sc2= new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
    	sc2.selectByVisibleText(frequency);
    	
    	
    	driver.findElement(By.xpath("//a[@onclick='return getfdMatVal(this);']")).click();
    	Thread.sleep(4000);
        String actvalue =driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
    	
    	if(Double.parseDouble(actvalue)==Double.parseDouble(exp_value))
    	{
    		System.out.println("Passed");
    		ExcelUtility.setCellData(filepath,"Sheet1", r, 7,"Passed");
    	}
    	else
    	System.out.println("Failed");
		ExcelUtility.setCellData(filepath,"Sheet1", r, 7,"Failed");
     }
      driver.findElement(By.xpath("//img[@class='PL5']")).click();
	}
     
	
}
//line 45 failed 
// ad blocker extension
