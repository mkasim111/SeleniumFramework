package org.mk.reports;

import org.mk.constants.FrameworkConstants;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public final class ExtentReport {

	private ExtentReport() {
	}

	public static ExtentReports extent;
	public static ExtentTest logintest;

	public static void initReports() {
		extent = new ExtentReports();
		ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(FrameworkConstants.getPathReport());
		extent.attachReporter(extentSparkReporter);

	}

	public static void flushReports() {
		extent.flush();
	}

	public static void createTest(String testCaseName) {
		logintest = extent.createTest(testCaseName);
		ExtentManager.setReport(logintest);
	}
	
	public static void assignAuthor(String author) {
		ExtentManager.getReport().assignAuthor(author);
	}

}
