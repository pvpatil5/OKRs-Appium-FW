package com.okr.appium.tests;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.okr.appium.pom.LoginPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass 
{
	public AndroidDriver<WebElement> driver;
	public DesiredCapabilities cap;
	public static  ExtentTest test;
	public static ExtentReports extent;
	GenericMethods lib = new GenericMethods();

	@BeforeSuite
	public void startReport()
	{
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");

		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}

	
//	public void connectToVirtualDevice() throws MalformedURLException
//	{
//		cap = new DesiredCapabilities();
//		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Appium");
//		cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
//		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
//		System.out.println("capabilities set");
//		cap.setCapability("appPackage", "com.cloudaeon.workmate");
//		cap.setCapability("appActivity", "host.exp.exponent.LauncherActivity");
//		System.out.println("app info set");
//		URL url = new URL("http://localhost:4723/wd/hub");
//		System.out.println("url entered");
//		driver= new AndroidDriver<WebElement>(url, cap);
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//	}

	/*@BeforeMethod
	public void loginIntoApplication() throws Throwable
	{
		LoginPage.usenameField(driver).sendKeys(lib.getvaluesfromProp("ValidUsername"));
		LoginPage.passwordField(driver).sendKeys(lib.getvaluesfromProp("ValidPassword"));
		LoginPage.loginButton(driver).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("login succesful");
	}
	
	@AfterMethod
	public void loginOutApplication()
	{
		
	}*/
	

	@AfterClass
	public void disConnectVirtualDevice()
	{
		driver.quit();

		System.out.println("driver closed");
	}
	
	@AfterSuite
	public void endReport()
	{
		// calling flush writes everything to the log file
        extent.flush();
        System.out.println("end");
	}
	@BeforeClass
	public void connectToRealDevice() throws MalformedURLException
	{
		cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.UDID, "d6c768cf9804");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7");
		System.out.println("capabilities set");
		cap.setCapability("appPackage", "com.cloudaeon.workmate");
		cap.setCapability("appActivity", "host.exp.exponent.LauncherActivity");
		System.out.println("app info set");
		URL url = new URL("http://localhost:4723/wd/hub");
		System.out.println("url entered");
		driver= new AndroidDriver<WebElement>(url, cap);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}


}
