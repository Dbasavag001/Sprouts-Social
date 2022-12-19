package com.sportsocial.genaricUtility;


import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ListernersClass  implements ITestListener
{
	ExtentReports report;
	ExtentTest test ;
	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("on test start");
		 test = report.createTest(result.getMethod().getMethodName());
		 ThreadLocalclass.settest(test);
	   
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case Success");
		 ThreadLocalclass.gettest().pass(result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		test.log(Status.INFO, "Test case is failed"+""+result.getName());
	 String testcasename = result.getName();
	 String screen = ThreadLocalclass.getwebdriverutil().takescreenshot(testcasename);
     test.addScreenCaptureFromPath(screen);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		 ExtentSparkReporter spark=new ExtentSparkReporter("./ExtendRepots/report.html");
		  spark.config().setDocumentTitle("Extent Html Report");
		  spark.config().setReportName("Test Case Execution Report");
		   report=new ExtentReports();
		   report.attachReporter(spark);
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Execution of test finished");
		report.flush();
	}

}
