package com.okr.appium.tests;


import org.testng.annotations.Test;

import com.okr.appium.pom.MyOkrsPage;

public class MyOkrsTests extends BaseClass
{
	@Test (priority = 2)
	public void createNewOkr() throws Throwable
	{
		LoginTests login = new LoginTests();
		//login.loginWithValidCredentials();
		Thread.sleep(4000);
		test = extent.createTest("create New Okr");
		test.info("click on create okr button");
		 MyOkrsPage.createOkrButton(driver).click();
		 MyOkrsPage.addObjective(driver).sendKeys("testing");
		 MyOkrsPage.saveObjective(driver).click();
		
		test.pass("new objective created");
		System.out.println("new objective created");
	}

}
