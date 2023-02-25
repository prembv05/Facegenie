package com.generic_library;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot 
{
	public void screenshots(WebDriver driver,String name) throws IOException
	{
		Date date = new Date();
		String Currentdate = date.toString().replaceAll(":","-");
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File Destination = new File(Autoconstants.Photopath+Currentdate+name+".png");
		FileUtils.copyFile(source, Destination);
	}
}
