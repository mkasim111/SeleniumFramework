package org.mk.tests;

import org.mk.annotations.FrameworkAnnotation;
import org.mk.pages.LoginPage;
import org.mk.testdata.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	
	
	@FrameworkAnnotation(author = "MKasim")
	@Test(description = "Validate Login to OrangeHRM website", dataProvider = "getNewData", dataProviderClass = DataProvider.class)
	public void logintest(TestData testData ) throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		String dash = loginPage.appLogin(testData.username, testData.password).getDashboardtext();
		Assert.assertEquals(dash, testData.expected);
	}

}
