package org.mk.driver;

import org.openqa.selenium.WebDriver;

/**
 * final so that no one can extend
 * private constructor so that no one else can create object
 * @author KASIM
 *
 */
public final class DriverManager {
	
	private DriverManager() {}

	private static ThreadLocal<WebDriver> tdriver = new ThreadLocal<>();

	public static WebDriver getDriver() {
		return tdriver.get();
	}

	public static void setDriver(WebDriver driver) {
		tdriver.set(driver);
	}

}
