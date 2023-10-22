package org.mk.driver;

import org.mk.config.ConfigFactory;
import org.openqa.selenium.WebDriver;

public final class Driver {

	private Driver() {
	}

	public static void initDriver() {
		String browser = ConfigFactory.getConfig().browser();
		if (DriverManager.getDriver() == null) {
			WebDriver driver = DriverFactory.getDriver(browser);
			DriverManager.setDriver(driver);
			DriverManager.getDriver().get(ConfigFactory.getConfig().url());
			DriverManager.getDriver().manage().window().maximize();
		}
	}

	public static void quitDriver() {
		if (DriverManager.getDriver() != null) {
			DriverManager.getDriver().quit();
			DriverManager.setDriver(null);
		}
	}

}
