package com.easemygst.automation.Reports;



import com.easemygst.automation.core.TestActions;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtentReportSetup extends TestActions
{	
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	public static ExtentSparkReporter sparkReport;
	
	public static ExtentReports extentReportSetup()
	{
		sparkReport = new ExtentSparkReporter(System.getProperty("user.dir") + "/ExtentReports/ExtentReport" + TestActions.getSystemDate() + ".html");
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReport);
		
		sparkReport.config().setTheme(Theme.DARK);
		sparkReport.config().setReportName("Automation Report");
		sparkReport.config().setDocumentTitle("Automation Report");
		
		return extent;
	}
}