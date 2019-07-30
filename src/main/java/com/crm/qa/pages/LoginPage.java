package com.crm.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
/**
 * Created by Dhruba Deka  on 26/07/2019.
 */

public class LoginPage extends TestBase {
	
	 public LoginPage(WebDriver driver) throws Exception
	 {
		 PageFactory.initElements(driver, this);
	  }
	 
	 @FindBy(how = How.ID, using = "email")
	   public WebElement txtEmailaddress;
	  
	  @FindBy(how = How.NAME, using = "passwd")
	  public WebElement txtPassword;
	  
	  @FindBy(how = How.NAME, using = "SubmitLogin")
	  public WebElement txtSignin;


public void Enterlogindetails()
  { 
	 txtEmailaddress.sendKeys(prop.getProperty("email"));
	 txtPassword.sendKeys(prop.getProperty("old_passwd"));
  }
 
/*public void Enterlogindetails1()
 {
	 
 txtEmailaddress.sendKeys(prop.getProperty("email"));
 txtPassword.sendKeys(prop.getProperty("passwd"));
	 txtSignin.click(); 
	 
 }*/
 
 public void SingIn()
 {
	 txtSignin.click();
 }
 
 //Method to verify My Account Summery Page
 public void MyAccountSummaryPage(WebDriver driver)
 {
			 String title= driver.getTitle();
			 System.out.println("Title is"+title);
			 Assert.assertTrue(title.contains("My account - My Store"));
			 System.out.println("Page verified");
 }
  
}


		


