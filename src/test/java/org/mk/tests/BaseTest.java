package org.mk.tests;

import org.mk.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


	@BeforeMethod
	public void setUp() throws InterruptedException {
		Driver.initDriver();
	}

	@AfterMethod
	public void tearDown() {
		Driver.quitDriver();

	}

}
