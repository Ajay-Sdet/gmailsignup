package stepdefinitions;

import TestUtil.Utility;

import io.cucumber.java.After;


public class Hooks 

{
	Utility utility;
	
public Hooks(Utility utility)
{
	this.utility=utility;
}
	@After
public void closebrowser ()
{
   utility.driver.close();	
}
	@After
public void closewindows()
{
	utility.driver.quit();
}

}
