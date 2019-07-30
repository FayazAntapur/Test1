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

public class LogoutPage extends TestBase {
	
	 public LogoutPage(WebDriver driver) throws Exception
	 {
		 PageFactory.initElements(driver, this);
	  }
	 
	 @FindBy(how = How.CLASS_NAME, using = "logout")
	  public WebElement SignOutBtn;
	 
	 public void logout()
	 {
		this.SignOutBtn.click();
	 }
	 
	// Method to verify  logout page
	public void Logout_Page()
		 {
		     String title= driver.getTitle();
			 System.out.println("Title is"+title);
			 Assert.assertTrue(title.contains("Login - My Store"));
			 System.out.println("Logout Page is displaying");
		 }
}
