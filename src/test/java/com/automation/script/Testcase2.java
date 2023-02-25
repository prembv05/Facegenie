package com.automation.script;


import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import com.generic_library.Stepgroup;
import com.pom.Facegenie_login;
import com.pom.Facegenie_modules;
import com.pom.Facegenie_students;

public class Testcase2 extends Stepgroup
{
	@Test
	public void tc2() throws IOException
	{
		Facegenie_login FL = new Facegenie_login(driver);
		FL.Email(pdata.getpropertydata("email"));
		FL.Password(pdata.getpropertydata("password"));
		FL.Login();
		
		Facegenie_modules FM = new Facegenie_modules(driver);
		FM.Manage_students();
		
		Facegenie_students FS = new Facegenie_students(driver);
		FS.AddStudent();
		FS.AdmissionNo(pdata.getpropertydata("admissionnum"));
		FS.FirstName(pdata.getpropertydata("Firstname"));
		FS.LastName(pdata.getpropertydata("Lastname"));
		FS.FatherName(pdata.getpropertydata("Fathername"));
		FS.Classes();
		FS.class1();
		FS.Division();
		FS.Divison1();
		FS.Gender();
		FS.Gender1();
		FS.MobileNo(pdata.getpropertydata("Mobilenumber"));
		FS.Busno();
		FS.Busno1();
		FS.DOB(pdata.getpropertydata("DOB"));
		FS.Payment();
		FS.Payment1();
		FS.Registered();
		FS.Registered1();
		FS.Area();
		FS.Area1();
		FS.Address(pdata.getpropertydata("Adress"));
		Point loc = FS.Studentid().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		Wutil.Scrollbar(driver,x,y);
		FS.StudentID(pdata.getpropertydata("StudentID"));
		FS.Admissionstatus();
		FS.Admissionstatus1();
		FS.AdmissionDate(pdata.getpropertydata("AdmissionDate"));
		FS.MotherName(pdata.getpropertydata("Mothername"));
		FS.MotherNumber(pdata.getpropertydata("Mothernumber"));
		FS.Hostelordaysscholar();
		FS.Hostelordaysscholar1();
		FS.AddStudentDetail();
		Point loc1 = FS.getConfirmaddstudent().getLocation();
		int x1 = loc1.getX();
		int y1 = loc1.getY();
		Wutil.Scrollbar(driver,x1,y1);
		FS.ConfirmAdd();
		
		FS.NameorId(pdata.getpropertydata("Firstname"));
		
		
		
	}	
		
	
}
