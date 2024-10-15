package Automation;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import TestUtil.ExcelUtility;

public class DataProviderClass 
	{
		@DataProvider(name="firstexcel")
		public String[][]getData() throws IOException
		{
			String path=".\\test data excel\\WebsiteAutomation.xlsx";
			
			ExcelUtility xlutil = new ExcelUtility(path);
		int totalrows =xlutil.getRowCount("Sheet1");
	    int totalcolms=xlutil.getCellCount("Sheet1", 1);
	    
	    String Logindata[][]= new String [totalrows][totalcolms];
	    for(int r=1;r<=totalrows;r++)
	    {
	    	
	    	for(int c=1;c<totalcolms;c++)
	    	{
	    		Logindata[r][c]=xlutil.getCellData("Sheet1", r, c);
	    		
	    	}
}
		return Logindata;
	
		}

}