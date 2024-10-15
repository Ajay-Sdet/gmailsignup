package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase001_SignupNewUser 
{
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='First Name']") WebElement fullname;
	@FindBy(xpath="//input[@ng-model='LastName']") WebElement lastname;
	@FindBy(xpath="//textarea[@ng-model='Adress']") WebElement address;
	@FindBy(xpath="//input[@ng-model='EmailAdress']")WebElement email;
	@FindBy(xpath="//input[@ng-model='Phone']")WebElement phone;
	@FindBy(xpath="(//input[@type='radio'])[1]")WebElement gender;
	@FindBy(id="checkbox2")WebElement hobbies;
	@FindBy(xpath="//div[@id='msdd']")WebElement language;
	@FindBy(xpath="//div[@id='msdd']//following::div[1]//ul/li[2]")WebElement languageselection;
	
	@FindBy(id="firstpassword")WebElement psw;
	@FindBy(id="secondpassword") WebElement spsw;
	@FindBy(id="submitbtn")WebElement submit;
	
	
	By skills = (By.id("Skills"));
	By countries= (By.id("countries"));
	By country= (By.id("country"));
	By yearbox= (By.id("yearbox"));
	By months= (By.xpath("//select[@placeholder='Month']"));
	By days = (By.id("daybox"));
	
	
	
	public  TestCase001_SignupNewUser (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@BeforeMethod
    @Test(priority=1)
	public void SetUp ()
	{
		//driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Index.html");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("enterimg")).click();
		
	}	
	@Test(priority=2 ,dependsOnMethods={"SetUp"},dataProvider="firstexcel",dataProviderClass=DataProviderClass.class)
	public void Signup(String firstname, String secondname,String location,String emailid,String number,String skls,String cntry,String scntry,String dob,String mnth,String yr,String psswrd,String cnfpsswd)
	
	{
		
		String Currenturlregister=driver.getCurrentUrl();
		Assert.assertEquals(Currenturlregister, "https://demo.automationtesting.in/Register.html");
		
	
		
		fullname.sendKeys(firstname);
		lastname.sendKeys(secondname);
		address.sendKeys(location);
		email.sendKeys(emailid);
		phone.sendKeys(number);
		gender.click();
		hobbies.click();
		WebElement click =language;
		click.click();
		languageselection.click();
		
		WebElement skillsdropdown =driver.findElement(skills);
		WebElement countrysdropdown =driver.findElement(countries);
	    WebElement country2=driver.findElement(country);
	    WebElement year= driver.findElement(yearbox);
	    WebElement month= driver.findElement(months);
	    WebElement day= driver.findElement(days);
		
	    DropdownHandle.DropdownHandler(skillsdropdown, "Visibletext", skls);
		DropdownHandle.DropdownHandler(countrysdropdown, "Visibletext",cntry);
		DropdownHandle.DropdownHandler(country2, "Visibletext",scntry );
		DropdownHandle.DropdownHandler(year, "Visibletext", yr);
		DropdownHandle.DropdownHandler(month, "Visibletext", mnth);
		DropdownHandle.DropdownHandler(day, "Visibletext", dob);
		
		psw.sendKeys(psswrd);
		spsw.sendKeys(cnfpsswd);
		submit.click();
	}	
		@AfterMethod
		public void close()
		{
			driver.quit();
		}
		
		
}
	


