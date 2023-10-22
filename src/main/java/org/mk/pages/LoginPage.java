package org.mk.pages;

import static org.mk.utils.SeleniumUtils.*;

import org.mk.reports.ExtentLogger;
import org.openqa.selenium.By;

public class LoginPage {

	private final static By TXTBOX_USERNAME = By.xpath("//input[@name='username']");
	private final static By TXTBOX_PASSWD = By.xpath("//input[@name='password']");
	private final static By BTN_SUBMIT = By.xpath("//button[@type='submit']");

	private LoginPage setUsername(String username) {
		sendKeys(TXTBOX_USERNAME, username);
		ExtentLogger.info(username + " is entered successfully");
		return this;
	}

	private LoginPage setPassword(String password) {
		sendKeys(TXTBOX_PASSWD, password);
		ExtentLogger.info(password + " is entered successfully");
		return this;
	}

	private HomePage clickLogin() {
		click(BTN_SUBMIT);
		ExtentLogger.info("Submit button is clicked successfully");
		return new HomePage();
	}

	public HomePage appLogin(String username, String password) {
		return setUsername(username).setPassword(password).clickLogin();
	}

}
