package com.jbk;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ABCListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Case "+result.getName()+"starting at time "+new Date());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish");
		
	}

}
