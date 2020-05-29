package com.okr.appium.pom;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
//import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage 
{
	public static WebElement usenameField(AndroidDriver<WebElement> driver)
	{
		//WebElement username = driver.findElementByXPath("//android.widget.EditText[@text='Enter Email Address')]");
		//WebElement username = driver.findElementByLinkText("Enter Email Address");
		//WebElement username =driver.findElement(MobileBy.AndroidUIAutomator(String.format("new Uiselector().text(\"%s\")", "Enter Email Address")));
		WebElement username =driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
		//List<WebElement> mobileElements = driver.findElementsByClassName("android.widget.EditText");
		//WebElement username = mobileElements.get(0);
		return username;
	}
	
	public static WebElement passwordField(AndroidDriver<WebElement> driver)
	{
		//WebElement password = driver.findElementByXPath("//*[@text='Enter Password')]");
		WebElement password =driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
		//List<WebElement> mobileElements = driver.findElementsByClassName("android.widget.EditText");
		//WebElement password = mobileElements.get(1);
		return password;
	}
	
	public static WebElement loginButton(AndroidDriver<WebElement> driver)
	{
		//WebElement loginButton = driver.findElementByXPath("//*[@text='Log in')]");
		//WebElement loginButton =driver.findElement(By.name("Log in"));
		WebElement loginButton = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]");
		 //= mobileElements.get(3);
		return loginButton;
	}
	
	public static WebElement allertPopUp(AndroidDriver<WebElement> driver)
	{
		//WebElement allertPopUp = driver.findElementById("android:id/alertTitle");
		List<WebElement> mobileElements = driver.findElementsByClassName("android.view.ViewGroup");
		WebElement allertPopUp = mobileElements.get(0);
		return allertPopUp;
	}
	
	public static WebElement passwordRequredMsg(AndroidDriver<WebElement> driver)
	{
		WebElement passwordRequredMsg = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[3]");
		//List<WebElement> mobileElements = driver.findElementsByClassName("android.view.TextView");
		//WebElement allertPopUp = mobileElements.get(4);
		return passwordRequredMsg;
	}
	
	public static WebElement usernameRequredMsg(AndroidDriver<WebElement> driver)
	{
		WebElement usernameRequredMsg = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]");
		//List<WebElement> mobileElements = driver.findElementsByClassName("android.view.TextView");
		//WebElement allertPopUp = mobileElements.get(2);
		return usernameRequredMsg;
	}
	
}
