package org.mk.pages;

import static org.mk.utils.SeleniumUtils.*;
import org.mk.pages.pagecomponent.TopMenuComponent;
import org.mk.reports.ExtentLogger;
import org.openqa.selenium.By;

public class HomePage {

	private static final By TXT_DASHBOARD = By.xpath("//h6[text()='Dashboard']");

	private TopMenuComponent topMenuComponent;

	public HomePage() {
		topMenuComponent = new TopMenuComponent();
	}

	public String getDashboardtext() {
		String text = getText(TXT_DASHBOARD);
		ExtentLogger.info(text + " text is displayed successfully");
		return text;
	}

	public String getTitle() {
		String title = getTitleForPage();
		ExtentLogger.info(title + " title is captured successfully");
		return title;
	}

	public TopMenuComponent clickAdmin() {
		return topMenuComponent.clickAdminLink();
	}

}
