package com.okr.appium.tests;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

public class InstallAPK 
{
  GenericMethods lib = new GenericMethods();
  @Test
  public void install() throws MalformedURLException
  {
	 // lib.installApk("C:\\Users\\Admin\\Desktop\\Excell\\OKr Workmate App\\OKRs-27-05-20.apk");
	  lib.installApk("D:\\automation testing\\OKR\\OKRs.apk");
  }
}
