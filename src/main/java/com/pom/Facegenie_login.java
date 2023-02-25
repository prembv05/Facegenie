package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facegenie_login 
{
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="email")
	private WebElement blankemail;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="password")
	private WebElement blankpassword;
	
	@FindBy(xpath="//button[contains(@class,'MuiButton-root')]")
	private WebElement loginbutton;
	
	public Facegenie_login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Email(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void clearmail()
	{
		blankemail.clear();
	}
	
	public void Password(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clearpassword()
	{
		blankpassword.clear();
	}
	
	public void Login()
	{
		loginbutton.click();
	}
	
}
