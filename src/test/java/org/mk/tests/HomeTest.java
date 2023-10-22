package org.mk.tests;

import org.mk.annotations.FrameworkAnnotation;
import org.mk.pages.HomePage;
import org.mk.pages.LoginPage;
import org.mk.testdata.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
	
	

	@FrameworkAnnotation(author = "MKasim")
	@Test(description = "Validate title to OrangeHRM website", dataProvider = "getNewData", dataProviderClass = DataProvider.class)
	public void homePageTitleTest(TestData testData) throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		HomePage homePage = new HomePage();
		loginPage.appLogin(testData.username, testData.password);
		String title = homePage.getTitle();
		Assert.assertEquals(title, testData.expected);
	}

}
