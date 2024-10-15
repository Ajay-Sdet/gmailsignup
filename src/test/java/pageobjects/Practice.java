package pageobjects;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



//we will have excel file >> workbook open >> sheet>> row >>cell

public class Practice {

	public static void main(String[] args) throws IOException 
	
	{
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\test data excel\\Resin product prices.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
	XSSFSheet sheet=workbook.getSheet("sheet");
	
	    int totalrow = sheet.getLastRowNum();
	    int totalcell = sheet.getRow(1).getLastCellNum();
	    
	    for(int r=0;r<=totalrow;r++)
	    {
	    XSSFRow	currentrow = sheet.getRow(r);
	    
	    	for(int c=0;c<totalcell;c++)
	    	{
	    		XSSFCell currentcell =currentrow.getCell(c);
	    		System.out.print(currentcell.toString()+"\t");
	    	}
	    	System.out.println();
	    }
	    workbook.close();
	    file.close();
		
	}

}
