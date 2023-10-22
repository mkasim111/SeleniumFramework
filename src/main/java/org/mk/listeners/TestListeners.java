package org.mk.listeners;

import java.util.Arrays;

import org.mk.annotations.FrameworkAnnotation;
import org.mk.reports.ExtentLogger;
import org.mk.reports.ExtentReport;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		ExtentReport.createTest(result.getName() + result.getMethod().getDescription());
		ExtentReport.assignAuthor(result.getMethod().getConstructorOrMethod().getMethod()
				.getAnnotation(FrameworkAnnotation.class).author());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ExtentLogger.pass(result.getName() + " is passed.");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ExtentLogger.fail(result.getName() + " is failed with exception "+result.getThrowable().getMessage()+" \n"
				+ Arrays.toString(result.getThrowable().getStackTrace()));
	}

	@Override
	public void onStart(ITestContext context) {
		ExtentReport.initReports();
	}

	@Override
	public void onFinish(ITestContext context) {
		ExtentReport.flushReports();
	}

}
