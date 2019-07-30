package com.crm.qa.StepDefinition;
	
	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.And;
	import cucumber.api.junit.Cucumber;
	import org.junit.runner.RunWith;
	import com.crm.qa.base.TestBase;
	import com.crm.qa.pages.LogoutPage;
	import com.crm.qa.pages.OrderPage;

	/**
	 * Created by Dhruba Deka  on 29/07/2019.
	 */
	
	@RunWith(Cucumber.class)
	public class OrderStep extends  TestBase{

		//OrderPage orderpage=null;
		
	 @When("^I click on TShirts link$")
	    public void i_click_on_tshirts_link() throws Exception
	      {
		 OrderPage orderpage = new OrderPage(driver);
		orderpage.Click_on_Tshirtlnk();
		  }
	 
	 @When("^I click on Back to your account button$")
	    public void i_click_on_back_to_your_account_button() throws Exception
	  {
		 OrderPage orderpage = new OrderPage(driver);
	       orderpage.Back_To_Myaccount();
	    }

	  @Then("^I directed to the TShirts My Store page$")
	    public void i_directed_to_the_tshirts_my_store_page() throws Exception
	    {
		  OrderPage orderpage = new OrderPage(driver);
	        orderpage.MyTshirtStorePage(driver);
	    }

	  @Then("^I add a TShirt in to cart by clicking Add cart button$")
	    public void i_add_a_tshirt_in_to_cart_by_clicking_add_cart_button() throws Exception 
	   {
		  OrderPage orderpage = new OrderPage(driver);
		  orderpage.Add_To_Cartbtn(driver);
	    }

	   @Then("^I click on Proceed to checkout button from cart window$")
	    public void i_click_on_proceed_to_checkout_button_from_cart_window() throws Throwable {
		   OrderPage orderpage = new OrderPage(driver);
		   orderpage.Proceed_To_ChkOutBtn();
	    }

	   @Then("^I click on Proceed to checkout button from cart summary page$")
	    public void i_click_on_proceed_to_checkout_button_from_cart_summary_page() throws Exception 
	    {
		   OrderPage orderpage = new OrderPage(driver);
	    	orderpage.Proceed_To_ChkOutBtn1();
	    }

	   @Then("^I click on Proceed to checkout button from address section$")
	    public void i_click_on_proceed_to_checkout_button_from_address_section() throws Exception 
	    {
		   OrderPage orderpage = new OrderPage(driver);
	    	orderpage.Proceed_To_ChkOutBtn2();
	    }

	   @Then("^I click on Terms of service and Proceed to checkout button shipping section$")
	    public void i_click_on_proceed_to_checkout_button_shipping_section() throws Exception
	    {
		   OrderPage orderpage = new OrderPage(driver);
	    	orderpage.Click_On_Checkbox();
	    	orderpage.Proceed_To_ChkOutBtn3();
	    }
	    
	   @Then("^I selected pay by bank wire payment option$")
	    public void i_selected_pay_by_bank_wire_payment_option() throws Exception
	    {
		   OrderPage orderpage = new OrderPage(driver);
	    	orderpage.BankWirePayment_Tab();
	    }
	    
	   @Then("^I click on confirm my order button$")
	    public void i_click_on_i_confirm_my_order_button() throws Exception
	    {
		   OrderPage orderpage = new OrderPage(driver);
	    	orderpage.ConfirmOrder();
	    }
	    
	   @Then("^Verify the presence of purchase order in order history page$")
	    public void verify_the_presence_of_purchase_order_in_order_history_page() throws Exception 
	   {
		   OrderPage orderpage = new OrderPage(driver);
	      orderpage.VerifyPurchasOrder(driver);
	    }

	   @Then("^I click on Logout button$")
	    public void i_click_on_logout_button() throws Exception
	    {
		   LogoutPage logoutPage= new LogoutPage(driver);
		    logoutPage.logout();
	    }

	   @And("^I directed to shopping cart summary page$")
	    public void i_directed_to_shopping_cart_summary_page() throws Exception 
	    {
		   OrderPage orderpage = new OrderPage(driver);
		   orderpage.Shop_CartSumyPage();
	    }

	   @And("^I directed to the address section$")
	    public void i_directed_to_the_address_section() throws Exception 
	    {
		   OrderPage orderpage = new OrderPage(driver);
		   orderpage.Address_Page();
	    }

	   @And("^I directed to the shipping section$")
	    public void i_directed_to_the_shipping_section() throws Exception
	    {
		   OrderPage orderpage = new OrderPage(driver);
	       orderpage.Shipping_Sectn();
	    }

	   @And("^I directed to the payment section$")
	    public void i_directed_to_the_payment_section() throws Exception
	    {
		   OrderPage orderpage = new OrderPage(driver);
	       orderpage.Payment_Sectn();
	    }
	    
	   @And("^I directed to the order summary page$")
	    public void i_directed_to_the_order_summary_page() throws Exception
	    {
		   OrderPage orderpage = new OrderPage(driver);
	       orderpage.Order_Sumry_Pg();
	    }

	   @And("^I directed to the order confirmation page$")
	    public void i_directed_to_the_order_confirmation_page() throws Exception
	    {
		   OrderPage orderpage = new OrderPage(driver);
	        orderpage.Ordertext();
	    }
	   
	   @And("^I directed to the logout page$")
	    public void i_directed_to_the_logout_page() throws Exception 
	    { 
		   LogoutPage logoutPage= new LogoutPage(driver);
		   logoutPage.Logout_Page();
	    }

	}


