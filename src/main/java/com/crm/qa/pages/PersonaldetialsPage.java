package com.crm.qa.pages;

import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class PersonaldetialsPage extends TestBase {
	/**
	 * Created by Dhruba Deka  on 29/07/2019.
	 */
	
	 public PersonaldetialsPage(WebDriver driver) throws Exception
	 {
		 PageFactory.initElements(driver, this);
	  }
	
	@FindBy(xpath="//a[@title ='Information']")
	WebElement MyPIbtn;
	
	@FindBy(xpath="//a[@title='Manage my personal information']")
	WebElement Manage_my_personal_information;
	
	@FindBy(name="firstname")
	WebElement txtFirstname;
	
	@FindBy(name="submitIdentity")
	WebElement Submitbtn;
	
	@FindBy(id = "old_passwd")
	 WebElement textOldPassword;

	@FindBy(id = "passwd")
	 WebElement textNewPassword;
	
	@FindBy(id = "confirmation")
	 WebElement textConfirmation;
	
	@FindBy(xpath="//p[@class=\"alert alert-success\"]")
	WebElement successMessage;
	
	public void Manage_my_personal_information()
	{
		this.Manage_my_personal_information.click();
	}
	
	 public void firstname(String Firstname)
	 {		 
		 txtFirstname.clear();
		 txtFirstname.sendKeys(Firstname);	 
	 }

		public void Submitbtn()
		{
			this.Submitbtn.click();
		}
		
		 public void ChangePassword() throws IOException
		 {		 
			 textOldPassword.sendKeys(prop.getProperty("old_passwd"));
			 textNewPassword.sendKeys(prop.getProperty("passwd"));	
			 textConfirmation.sendKeys(prop.getProperty("confirmation"));
			 
			FileOutputStream fio= new FileOutputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\crm\\qa\\config\\cofig.properties");
			 prop.setProperty("old_passwd", prop.getProperty("passwd"));
			 prop.store(fio, null);
			 fio.close();
			
			 
		 }
		 
		 public void verifyMessage() {
			 
			 Assert.assertTrue(this.successMessage.isDisplayed());
		 }
}


