package utils;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.ITest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.ProjectSpecificationMethod;


public class Listener extends ProjectSpecificationMethod implements ITestListener {
	
	//get physical report to extentreport class
  //  ExtentReports extent = getreport();
	ExtentTest test;

	//get implementation methods
	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
	}

	// if test pass the status is passed
	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "TEST PASSED");
	}

	//if test failure the status is failure and take screenshot
	@Override
	public void onTestFailure(ITestResult result) {
		String name = null;
		test.fail(result.getThrowable());
		String filepath= "C:\\Users\\mrajk\\eclipse-workspace\\SpiceJet\\Screenshots"+ name +".png";
		
		try {
			getScreenshot(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
	}

	//test skipped 
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped");	
		}

	



}
