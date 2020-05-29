package com.okr.appium.pom;


import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class MyOkrsPage 
{
	
	public static WebElement optionsTab(AndroidDriver<WebElement> driver)
	{
		WebElement optionsTab = driver.findElementByXPath("//android.view.ViewGroup[1]/android.widget.TextView");
		return optionsTab;
	}
	
	public static WebElement createOkrButton(AndroidDriver<WebElement> driver)
	{
		WebElement createOkrButton = driver.findElementByXPath("//android.view.ViewGroup[2]/android.widget.TextView");
		return createOkrButton;
	}
	
	
	public static WebElement addObjective(AndroidDriver<WebElement> driver)
	{
		WebElement addObjective = driver.findElementsByClassName("android.widget.EditText").get(0);
		return addObjective;
	}
	

	public static WebElement saveObjective(AndroidDriver<WebElement> driver)
	{
		WebElement saveObjective = driver.findElementsByClassName("android.view.ViewGroup").get(5);
		return saveObjective;
	}
	
}
