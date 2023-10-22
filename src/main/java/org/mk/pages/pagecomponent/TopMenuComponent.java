package org.mk.pages.pagecomponent;

import static org.mk.utils.SeleniumUtils.*;

import org.mk.reports.ExtentLogger;
import org.openqa.selenium.By;

public class TopMenuComponent {
	
	private static final By LNKTXT_ADMIN = By.xpath("//*[text()='Admin']");
	
	public TopMenuComponent clickAdminLink() {
		click(LNKTXT_ADMIN);
		ExtentLogger.info("Admin link is clicked successfully");
		return this;
	}

}
