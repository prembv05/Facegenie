package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic_library.Stepgroup;

public class Facegenie_students extends Stepgroup
{
	@FindBy(xpath="(//button[contains(@class,'MuiButton-root')])[1]")
	private WebElement addstudent;
	
	@FindBy(name="admissionNo")
	private WebElement admissionno;
	
	@FindBy(name="firstName")
	private WebElement firstname;
	
	@FindBy(name="lastName")
	private WebElement lastname;
	
	@FindBy(name="fathersName")
	private WebElement fathername;
	
	@FindBy(xpath="(//div[contains(@id,'demo')])[5]")
	private WebElement classes;
	
	@FindBy(xpath="//li[text()='CLASS 4']")
	private WebElement class1;
	
	@FindBy(xpath="(//div[contains(@id,'demo')])[6]")
	private WebElement division;
	
	@FindBy(xpath="//li[text()='E']")
	private WebElement division1;
	
	@FindBy(xpath="(//div[contains(@id,'demo')])[7]")
	private WebElement gender;
	
	@FindBy(xpath="//li[text()='M']")
	private WebElement gender1;
	
	@FindBy(name="mobileNo")
	private WebElement mobile;
	
	@FindBy(xpath="(//div[contains(@id,'demo')])[8]")
	private WebElement busno;
	
	@FindBy(xpath="//li[text()='BUS NO 43']")
	private WebElement busno1;
	
	@FindBy(xpath=("(//input[@id=\"date\"])[1]"))
	private WebElement date;
	
	@FindBy(xpath="(//div[contains(@id,'demo')])[9]")
	private WebElement payment;
	
	@FindBy(xpath="//li[text()='Yes']")
	private WebElement payment1;
	
	@FindBy(xpath="(//div[contains(@id,'demo')])[10]")
	private WebElement registered;
	
	@FindBy(xpath="//li[text()='Yes']")
	private WebElement register1;
	
	
	@FindBy(xpath="(//div[contains(@id,'demo')])[11]")
	private WebElement area;
	
	@FindBy(xpath="//li[text()='Area 1']")
	private WebElement area1;
	
	@FindBy(name="address")
	private WebElement adress;
	
	@FindBy(name="studentId")
	private WebElement studentid;
	
	@FindBy(xpath="(//div[contains(@id,'demo')])[12]")
	private WebElement admissionstatus;
	
	@FindBy(xpath="//li[text()='Admitted']")
	private WebElement admissionstatus1;
	
	@FindBy(xpath=("(//input[@id=\"date\"])[2]"))
	private WebElement admissiondate;
	
	@FindBy(name="motherName")
	private WebElement mothername;
	
	@FindBy(name="motherMobileNo")
	private WebElement mothernumber;
	
	@FindBy(xpath="(//div[contains(@id,'demo')])[13]")
	private WebElement hostelordaysscholar;
	
	@FindBy(xpath="//li[text()='DaysScholar']")
	private WebElement hostelordaysscholar1;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div/div/main/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div/div[9]/button")
	private WebElement addstudentdetails;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div/div/main/div[2]/div/div/div/div[2]/div[3]/div[2]/div[1]/div[1]/button")
	private WebElement downloadQR;
	
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div/div/main/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[5]/button")
	private WebElement confirmaddstudent;
	
	@FindBy(name="nameorId")
	private WebElement nameorid;
	
	public Facegenie_students(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void AddStudent()
	{
		addstudent.click();
	}
	
	public void AdmissionNo(String num)
	{
		admissionno.sendKeys(num);
	}
	public void FirstName(String Fname)
	{
		firstname.sendKeys(Fname);
	}
	
	public void LastName(String Lname)
	{
		lastname.sendKeys(Lname);
	}
	
	public void FatherName(String Fathername)
	{
		fathername.sendKeys(Fathername);
	}
	public void MobileNo(String phone)
	{
		mobile.sendKeys(phone);
	}
	public void DOB(String date1)
	{
		date.sendKeys(date1);
	}
	public void Address(String address)
	{
		adress.sendKeys(address);
	}
    
	public WebElement Studentid() 
	{
		return studentid;
	}

	public void StudentID(String id)
	{
		studentid.sendKeys(id);
	}
	public void AdmissionDate(String date2)
	{
		admissiondate.sendKeys(date2);
	}
	public void MotherName(String momname)
	{
		mothername.sendKeys(momname);
	}
	public void MotherNumber(String momnumber)
	{
		mothernumber.sendKeys(momnumber);
	}
	public void Classes() 
	{
		 classes.click();
	}
	public void class1()
	{
		class1.click();
	}

	public void Division() 
	{
		 division.click();
	}
	public void Divison1()
	{
		division1.click();
	}

	public void Gender() 
	{
		 gender.click();
	}
	
	public void Gender1() 
	{
		 gender1.click();
	}
	public void Busno() 
	{
		 busno.click();
	}
	
	public void Busno1() 
	{
		 busno1.click();
	}
	
	public void Payment() 
	{
		payment.click();
	}
	
	public void Payment1() 
	{
		payment1.click();
	}
	public void Registered() 
	{
		registered.click();
	}
	public void Registered1() 
	{
		register1.click();
	}
	public void Area() 
	{
		 area.click();
	}
	public void Area1() 
	{
		 area1.click();
	}
	public void Admissionstatus() 
	{
		 admissionstatus.click();
	}
	public void Admissionstatus1() 
	{
		 admissionstatus1.click();
	}
	public void Hostelordaysscholar() 
	{
		hostelordaysscholar.click();
	}
	public void Hostelordaysscholar1() 
	{
		hostelordaysscholar1.click();
	}
	public void AddStudentDetail()
	{
		addstudentdetails.click();
	}
	public void DownloadQR()
	{
		downloadQR.click();
	}
	
	public WebElement getConfirmaddstudent() 
	{
		return confirmaddstudent;
	}

	public void ConfirmAdd()
	{
		confirmaddstudent.click();
	}
	
	public void NameorId(String idorname)
	{
		nameorid.sendKeys(idorname);
	}
}
