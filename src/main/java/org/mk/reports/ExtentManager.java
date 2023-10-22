package org.mk.reports;

import com.aventstack.extentreports.ExtentTest;

public final class ExtentManager {
	private ExtentManager() {
	}

	private static final ThreadLocal<ExtentTest> threadlocal = new ThreadLocal<>();

	static void setReport(ExtentTest extentTest) {
		threadlocal.set(extentTest);
	}

	static ExtentTest getReport() {
		return threadlocal.get();
	}

}
