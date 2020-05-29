package com.okr.appium.tests;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class GenericMethods 
{
	
	public void installApk(String apkLocation ) throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.APP, apkLocation);
		
		System.out.println("app info set");

		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, cap);
		
		System.out.println("App Installed");
		
		driver.quit();
		
		System.out.println("driver closed");
		
	}
	
	
	public String getvaluesfromProp(String key) throws Throwable
	{
		FileInputStream fisObj = new FileInputStream("../okrApk/Prop");
		Properties pObj = new Properties();
		pObj.load(fisObj);
		String s = pObj.getProperty(key);
		return s;
	}	
	
	public String getExcelData(String expath,String sheet,int row,int col) throws Throwable
	{

		FileInputStream fis = new FileInputStream( expath);
		Workbook wb =WorkbookFactory.create(fis);
		Sheet sht =wb.getSheet(sheet);
		Row r = sht.getRow(row);
		Cell c = r.getCell(col);
		String s = c.toString();
		return s;
	}

}
