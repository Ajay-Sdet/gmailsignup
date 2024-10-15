package TestUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener
{

	public ExtentSparkReporter sparkreporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	String repName;
	
	public void OnStart(ITestContext testContext)
	{
		String timestamp = new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
		repName="Test-report-"+timestamp+".html";
		sparkreporter=new ExtentSparkReporter(".\\reports\\"+repName);
		sparkreporter.config().setDocumentTitle("Application");
		sparkreporter.config().setReportName("reportname");
		sparkreporter.config().setTheme(Theme.STANDARD);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkreporter);
		extent.setSystemInfo("Application","opencart");
		extent.setSystemInfo("Module","Admin");
		extent.setSystemInfo("username", System.getProperty("user.name"));
		extent.setSystemInfo("enviroment", "QA");
		
		String os=testContext.getCurrentXmlTest().getParameter("os");
		extent.setSystemInfo("operating system", os);
		
		String browser = testContext.getCurrentXmlTest().getParameter("browser");
		extent.setSystemInfo("Browser", browser);
		
		List<String>includegroups= testContext.getCurrentXmlTest().getIncludedGroups();
		
		if (!includegroups.isEmpty())
		{
			extent.setSystemInfo("Groups", includegroups.toString());
		}
		
	}
	public void OnTestSuccess()
	{
		
	}
	public void OnTestFailure()
	{
		
	}
	public void OnTestSkipped()
	{
		
	}
	public void OnFinish()
	{
		
	}
	
}
