package org.mk.utils;

import java.time.Duration;

import org.mk.config.ConfigFactory;
import org.mk.driver.DriverManager;
import org.mk.enums.WaitType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {

	public static void click(By by) {
		waitUntilElementIsPresent(by).click();
	}

	public static void click(By by, WaitType waitType) {
		WebElement element = null;
		if (waitType == WaitType.PRESENT) {
			element = waitUntilElementIsPresent(by);
		} else if (waitType == WaitType.CLICKABLE) {
			element = waitUntilElementClickable(by);
		} else if (waitType == WaitType.CLICKABLE) {
			element = waitUntilElementVisible(by);
		}
		element.click();

	}

	public static void sendKeys(By by, String value) {
		waitUntilElementIsPresent(by).sendKeys(value);
	}

	public static String getText(By by) {
		return waitUntilElementIsPresent(by).getText();
	}

	public static String getTitleForPage() {
		return DriverManager.getDriver().getTitle();
	}

	private static WebElement waitUntilElementIsPresent(By by) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),
				Duration.ofSeconds(ConfigFactory.getConfig().timeout()));
		return wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}

	private static WebElement waitUntilElementClickable(By by) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),
				Duration.ofSeconds(ConfigFactory.getConfig().timeout()));
		return wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	private static WebElement waitUntilElementVisible(By by) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),
				Duration.ofSeconds(ConfigFactory.getConfig().timeout()));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

}
