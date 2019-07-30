package com.crm.qa.StepDefinition;

import java.util.List;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
/**
 * Created by Dhruba Deka  on 26/07/2019.
 */

@RunWith(Cucumber.class)
public class LoginStep extends TestBase {
	
	@Given("^I have navigated to the applications$")
	public void i_have_navigated_to_the_applications() 
	{
		initialization();
	}

    @When("^I enter EmailAddress and Password$")
    public void i_enter_emailaddress_and_password() throws Exception
    {
    	
    	 LoginPage loginpage = new LoginPage(driver);
    	loginpage.Enterlogindetails();   
    }

	@Then("^I click Signin link$")
	public void i_click_signin_link() throws Exception
	  {
		 HomePage home = new HomePage(driver);		
		 home.singin();
	   }
	 
	@Then("^I click Sign in button$")
	 public void i_click_sign_in_button() throws Exception 
	    {
	    	LoginPage loginpage = new LoginPage(driver);
	    	loginpage.SingIn();
	    }
 
	@Then("^I see the My Account page$")
	    public void i_see_the_my_account_page() throws Exception 
	    {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.MyAccountSummaryPage(driver);
	    }
}