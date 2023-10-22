package org.mk.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class DriverFactory {
	
	private DriverFactory() {}

	public static WebDriver getDriver(String browser) {
		WebDriver driver;

		if (browser.toUpperCase().equals("CHROME")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--disable-logging");
			driver = new ChromeDriver(options);
		} else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		return driver;
	}

}
