package pageobjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager 
{
	public WebDriver driver;
	public Clickongmail clickongmail;
	public Selectingtypeofuser selectingtypeofuser ;
	public Personalinformation personalinformation ;
	public Phonenumberverify phonenumberverify;
	public Usernameandpassword usernameandpassword;
	public Recoveryemaildetails recoveryemaildetails;
	public Privacyagreement privacyagreement;
	public Finalreviewofpersonaldetails finalreviewofpersonaldetails ;
	
	public PageObjectManager (WebDriver driver)
	{
		this.driver=driver;
	}
	
public Clickongmail clickgmail()
{
	 clickongmail = new Clickongmail(driver);
	 return clickongmail;
	
}
public Selectingtypeofuser selectuser()
{
	selectingtypeofuser = new Selectingtypeofuser(driver);
	return selectingtypeofuser;
}
public Personalinformation personaldetails ()
{
	personalinformation=new Personalinformation(driver);
	return personalinformation;
}
public Phonenumberverify phonenumber()
{
	phonenumberverify = new Phonenumberverify(driver);
	return phonenumberverify ;
}
public Usernameandpassword nameandpassword ()
{
	usernameandpassword = new Usernameandpassword(driver);
			return usernameandpassword;
}
public Recoveryemaildetails recoveryemail ()
{
	recoveryemaildetails = new Recoveryemaildetails(driver);
	return recoveryemaildetails;
}
public pageobjects.Privacyagreement Privacyagreement()
{
	privacyagreement = new Privacyagreement(driver);
	return privacyagreement;
}
public Finalreviewofpersonaldetails Finalreviewofpersonaldetails()
{
	finalreviewofpersonaldetails = new Finalreviewofpersonaldetails(driver);
	return finalreviewofpersonaldetails;
}
}
