package com.generic_library;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Webelements 
{
	public void Dropdown(WebElement element,String text)
	{
		Select sclt = new Select(element);
		sclt.selectByVisibleText(text);
	}
	public void popup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void Scrollbar(WebDriver driver,int x ,int y)
	{
		JavascriptExecutor JS =(JavascriptExecutor) driver;
		JS.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	public void Switchframe(WebDriver driver)
	{
		driver.switchTo().frame(0);
	}
	
	public void Switchbackframe(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
}
