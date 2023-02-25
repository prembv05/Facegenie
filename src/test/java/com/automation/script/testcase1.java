package com.automation.script;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generic_library.Stepgroup;
import com.pom.Facegenie_login;
import com.pom.Facegenie_logout;
import com.pom.Facegenie_modules;

public class testcase1 extends Stepgroup
{
	@Test
	
	public void tc1() throws IOException, InterruptedException
	{
		Facegenie_login FL = new Facegenie_login(driver);
		FL.Email(pdata.getpropertydata("email"));
		FL.Password(pdata.getpropertydata("password"));
		FL.Login();
		
		Facegenie_modules FM = new Facegenie_modules(driver);
		FM.Analytics_reports();
		FM.Attendance_logs();
		FM.Manage_students();
		FM.Manage_licenses();
		FM.Settings();
		
		Facegenie_logout FLT = new Facegenie_logout(driver);
		FLT.Logout();
		FLT.OK();
		
		Facegenie_login FL1 = new Facegenie_login(driver);
		FL1.clearmail();
		FL1.Email(pdata.getpropertydata("invalidemail"));
		FL1.clearpassword();
		FL1.Password(pdata.getpropertydata("password"));
		FL1.Login();
		
		Facegenie_login FL2 = new Facegenie_login(driver);
		FL2.clearmail();
		FL2.Email(pdata.getpropertydata("email"));
		FL2.clearpassword();
		FL2.Password(pdata.getpropertydata("invalidpassword"));
		FL2.Login();
		
		Facegenie_login FL3 = new Facegenie_login(driver);
		FL3.clearmail();
		FL3.Email(pdata.getpropertydata("invalidemail"));
		FL3.clearpassword();
		FL3.Password(pdata.getpropertydata("invalidpassword"));
		FL3.Login();
		
		
	}
}
