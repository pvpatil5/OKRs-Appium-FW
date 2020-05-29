package com.okr.appium.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class Sop extends BaseClass
{
	GenericMethods lib = new GenericMethods();
	
	@Test
	public void sop() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(lib.getvaluesfromProp("ValidUsername"));
	}
	
	/*public static void main(String[] args) throws Throwable
	{
		GenericMethods lib = new GenericMethods();
		System.out.println(lib.getvaluesfromProp("ValidUsername"));
	}*/
}
