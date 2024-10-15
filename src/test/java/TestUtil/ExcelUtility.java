package TestUtil;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility 

{

public  FileInputStream fi;
public  FileOutputStream fo;
public  XSSFWorkbook wb;
public  XSSFSheet ws;
public  XSSFRow row;
public  XSSFCell cell;
public  CellStyle style;
 String path;


public ExcelUtility(String path)
{
	this.path=path;
}

public  int getRowCount(String xlsheet) throws IOException
{
	
	fi=new FileInputStream(path);
	wb= new XSSFWorkbook(fi);
	ws =wb.getSheet(xlsheet);
	int rowcount=ws.getLastRowNum();
	wb.close();
	fi.close();
	return rowcount;
					
}

public  int getCellCount(String xlsheet,int rownum) throws IOException

{
	fi=new FileInputStream(path);
	wb= new XSSFWorkbook(fi);
	ws =wb.getSheet(xlsheet);
	int cellcount=ws.getRow(rownum).getLastCellNum();
	wb.close();
	fi.close();
	return cellcount;
}

public  String getCellData(String xlsheet,int rownum,int cellnum) throws IOException

{
	fi=new FileInputStream(path);
	wb= new XSSFWorkbook(fi);
	ws =wb.getSheet(xlsheet);
	row= ws.getRow(rownum);
	cell=row.getCell(cellnum);
   
	if (row == null || row.getCell(cellnum) == null) {
        return ""; // Return empty string if cell is null
    }
    
    cell = row.getCell(cellnum);
    
    // Use DataFormatter to handle cell data as a string, without adding decimals
    DataFormatter formatter = new DataFormatter();
    String data = formatter.formatCellValue(cell);
    
    wb.close();
    fi.close();
    return data;
}

public  void setCellData(String xlfile,String xlsheet,int rownum,int cellnum,String data) throws IOException

{
	fi = new FileInputStream(xlfile);
	wb=new XSSFWorkbook();
	ws =wb.getSheet(xlsheet);
	row=ws.getRow(rownum);
	cell=row.createCell(cellnum);
	cell.setCellValue(data);
	fo=new FileOutputStream(xlfile);
	wb.write(fo);
	wb.close();
	fi.close();
	fo.close();
	
	
}
	
	
	
}
