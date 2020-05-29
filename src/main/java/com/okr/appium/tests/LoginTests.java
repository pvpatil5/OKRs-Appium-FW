package com.okr.appium.tests;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.okr.appium.pom.LoginPage;


public class LoginTests extends BaseClass
{
	GenericMethods lib = new GenericMethods();
	
	/*@Test (priority = 1)
	public void usernameFieldEnabled()
	{
		test = extent.createTest("usernameFieldEnabled");
		test.info("Check wether Username field enabled");
		boolean ststus = LoginPage.usenameField(driver).isEnabled();
		assertTrue(ststus);
		test.pass("Username Field is enabled");
		System.out.println("username Field Enabled");
	}
	
	@Test (priority = 2)
	public void passwordFieldEnabled()
	{
		test = extent.createTest("passwordFieldEnabled");
		test.info("Check wether Password field enabled");
		boolean ststus = LoginPage.passwordField(driver).isEnabled();
		assertTrue(ststus);
		test.pass("Password field  is enabled");
		System.out.println("password Field Enabled");
	}
	
	@Test (priority = 3)
	public void loginButtonEnabled()
	{
		test = extent.createTest("loginButtonEnabled");
		test.info("Check wether Login Butoon enabled");
		boolean ststus = LoginPage.loginButton(driver).isEnabled();
		assertTrue(ststus);
		test.pass("login Button Enabled");
		System.out.println("login Button Enabled");
		
	}
	
	
	@Test (priority = 4)
	public void loginWithoutUsernamePassword() 
	{
		test = extent.createTest("loginWithoutUsernamePassword");
		test.info("Login without uername and password");
		LoginPage.loginButton(driver).click();
		assertTrue(LoginPage.allertPopUp(driver).isDisplayed());
		test.pass("Login failed, Alert popup displayed");
	}
	
	@Test (priority = 5)
	public void loginWithoutUsername() throws Throwable
	{
		test = extent.createTest("loginWithoutUsername");
		test.info("Login without uername");
		LoginPage.passwordField(driver).sendKeys(lib.getvaluesfromProp("ValidPassword"));
		LoginPage.loginButton(driver).click();
		assertTrue(LoginPage.usernameRequredMsg(driver).isDisplayed());
		test.pass("Login failed, Alert popup displayed");
	}*/
	
//	@Test (priority = 6)
//	public void loginWithoutPassword() throws Throwable
//	{
//		test = extent.createTest("loginWithoutPassword");
//		test.info("Login without password");
//		LoginPage.usenameField(driver).sendKeys(lib.getvaluesfromProp("ValidUsername"));
//		LoginPage.loginButton(driver).click();
//		assertTrue(LoginPage.passwordRequredMsg(driver).isDisplayed());
//		test.pass("Login failed, Alert popup displayed");
//		
//	}
	
	@Test (priority = 7)
	public void loginWithValidCredentials() throws Throwable
	{
		test = extent.createTest("loginWithValidCredentials");
		test.info("login With Valid Credentials");
		LoginPage.usenameField(driver).sendKeys(lib.getvaluesfromProp("ValidUsername"));
		LoginPage.passwordField(driver).sendKeys(lib.getvaluesfromProp("ValidPassword"));
		LoginPage.loginButton(driver).click();
		test.pass("Login Succesful");
		Thread.sleep(7000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	


}
