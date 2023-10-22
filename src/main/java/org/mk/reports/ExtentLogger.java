package org.mk.reports;

import org.mk.utils.ScreenshotUtils;

import com.aventstack.extentreports.MediaEntityBuilder;

public final class ExtentLogger {

	private ExtentLogger() {
	}

	public static void pass(String message) {
		ExtentManager.getReport().pass(message,
				MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenShot()).build());
	}

	public static void fail(String message) {
		ExtentManager.getReport().fail(message,
				MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenShot()).build());
	}

	public static void info(String message) {
		ExtentManager.getReport().info(message,
				MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenShot()).build());
	}

}
