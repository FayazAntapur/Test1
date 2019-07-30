package com.crm.qa.StepDefinition;

import org.junit.Assert;
import org.junit.runner.RunWith;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.PersonaldetialsPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class PersonalInfoUpdate extends TestBase{

	
	@When("^I click on My personal information button from My account page$")
	public void i_click_on_My_personal_information_button_from_My_account_page() throws Throwable {
		
		PersonaldetialsPage PDP= new PersonaldetialsPage(driver);
		PDP.Manage_my_personal_information();
	}

	@Then("^I directed to the Identity My Store Page$")
	public void i_directed_to_the_Identity_My_Store_Page() throws Throwable {
	}

	@When("^I Update \"(.*?)\",Current Password,New Password and Confirmation and click on save from$")
	public void i_Update_First_Name_Current_Password_New_Password_and_Confirmation_and_click_on_save_from(String Firstname) throws Throwable {
		
		PersonaldetialsPage PDP= new PersonaldetialsPage(driver);
		PDP.firstname(Firstname);
		PDP.ChangePassword();
		PDP.Submitbtn();
		
	}

	@Then("^I display with a successfull message in Your Personal Information section$")
	public void i_display_with_a_successfull_message_in_Your_Personal_Information_section() throws Throwable {
		
		PersonaldetialsPage PDP= new PersonaldetialsPage(driver);
		PDP.verifyMessage();
	}

}
