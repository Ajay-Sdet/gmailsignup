package pageobjects;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelfetch {

	public static void main(String[] args) throws IOException
	{
      
		FileInputStream file = new FileInputStream("C:\\Users\\Ajay Singh\\eclipse-workspace\\gmailsignup\\test data excel\\Project Selenium Gmail.xlsx");
		 XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ws= wb.getSheet("Sheet1");
	int totalrow=ws.getLastRowNum();
	int totalcell = ws.getRow(4).getLastCellNum();
		
	
	for (int r=4;r<=totalrow;r++)
{
	         XSSFRow currentrow = ws.getRow(r);
	         
	        for(int c=2;c<totalcell;c++)
	        {
	        XSSFCell currentcell=currentrow.getCell(c);
	        System.out.print(currentcell.toString()+"\t");
	        }
	        System.out.println();
           }
	  wb.close();
	  file.close();
	
	
    }
	
}