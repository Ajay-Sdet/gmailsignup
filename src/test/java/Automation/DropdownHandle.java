package Automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public  class DropdownHandle 

{
	
	public static void DropdownHandler(WebElement dropdown,String selectBy,String value)
	
	{
		Select s = new Select(dropdown);
		switch(selectBy.toLowerCase())
		{
		case "Visibletext":s.selectByVisibleText(value);break;
		case "value": s.selectByValue(value);break;
		case "index":s.selectByIndex(Integer.parseInt(value));break;
		default: System.out.println("invalid options");
		}
		
		
	}

}

