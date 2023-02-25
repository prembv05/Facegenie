package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facegenie_logout 
{
	@FindBy(xpath="(//div[contains(@class,'MuiListItemButton-root')])[7]")
	private WebElement logout; 
	
	@FindBy(xpath="//button[text()='Ok']")
	private WebElement ok;
	
	public Facegenie_logout(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Logout()
	{
		logout.click();
	}
	
	public void OK()
	{
		ok.click();
	}
}
