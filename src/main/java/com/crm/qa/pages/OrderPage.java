	package com.crm.qa.pages;
	
	import java.util.concurrent.TimeUnit;

import org.junit.Assert;
	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
	/**
	 * Created by Dhruba Deka  on 29/07/2019.
	 */	
	    public class OrderPage extends TestBase{
		public OrderPage(WebDriver driver) throws Exception
				 {
			 PageFactory.initElements(driver, this);
				 }
		
		 @FindBy(xpath="(//a[text()='T-shirts'])[last()]")
			WebElement TShirtslnk;
				
		 @FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts']")
			 WebElement AddToCartbtn;
				 
		 @FindBy(xpath="//a[@title='Proceed to checkout']")
				   WebElement ProceedToChkOutBtn;
				 
		 @FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']")
				   WebElement ProceedToChkOutBtn1;
		
		 @FindBy(name="processAddress")
				 WebElement ProceedToChkOutBtn2;
				 
		 @FindBy(xpath="//input[@type='checkbox']")
				   WebElement Checkbox;
				 
		 @FindBy(xpath="//button[@name='processCarrier']")
				   WebElement ProceedToChkOutBtn3;
				 
		 @FindBy(xpath="//a[@class='bankwire']")
				   WebElement BankWirePaymentTab ;
				 
		 @FindBy(xpath="//button[@class='button btn btn-default button-medium']")
				   WebElement ConfirmOrderbtn;
				 
		 @FindBy(xpath="//strong[contains(text(),'Your order on My Store is complete.')]")
				   WebElement YourOrder;
				 
		 @FindBy(xpath="//a[@class='button-exclusive btn btn-default']")
				   WebElement BackToOrderslnk;
				 
		 @FindBy(xpath="//h1[contains(text(),'Order history')]")
				   WebElement OrderHistory;
				 
		 @FindBy(xpath="//div/h1[contains(text(),'Shopping-cart summary')]")
				   WebElement ShopCartSumyPage;
				 //Addresses page
		 @FindBy(xpath="//*[@id='columns']/div[1]/span[2]")
				   WebElement AddressesPage;
				 //   And I directed to the shipping section 
		 @FindBy(xpath="//span[@class='navigation_page']")
				   WebElement ShippingSectn;
				 //   And I directed to the payment section
		 @FindBy(xpath="//span[@class='navigation_page']")
				   WebElement PaymentSectn;
				 //   And I directed to the order summary page
		 @FindBy(xpath="//span[@class='navigation_page']")
				   WebElement  OrderSumryPg;
				 
		 	 //   When I click on Back to your account button
		 @FindBy(xpath=" //*[@id='center_column']/ul/li[1]/a/span")
				   WebElement  BackBtn;
		  
 
	 //All Methods 
	 
	// Then Verify the presence of purchase order in order history page		 
	 public void MyTshirtStorePage(WebDriver driver)
			 {
	//	 JavascriptExecutor js = (JavascriptExecutor)driver;
		// js.executeScript("arguments[0].scrollIntoView();",AddToCartbtn);

						 String title= driver.getTitle();
						 System.out.println("Title is"+title);
						 Assert.assertTrue(title.contains("T-shirts - My Store"));
						 System.out.println("Page verified");
			 }
	
	 //   Then Verify the presence of purchase order in order history page
	 public void VerifyPurchasOrder(WebDriver driver)
			 {
						String s = driver.findElement(By.xpath("//div[@class='box']")).getText();
						String[] items = s.split("-");
						String orderPlaced = items[5].substring(46, 55);
						System.out.println("orderPlaced: "+orderPlaced);
						driver.findElement(By.xpath("//a[@title='Back to orders']")).click();
						String orderHistory =driver.findElement(By.xpath("//a[contains(text(),'"+orderPlaced+"')]")).getText();
						System.out.println("orderHistory: "+orderHistory);
						
						if(orderPlaced.equals(orderHistory))
						{
						 System.out.println("Purchase Order is Present in Order History Page ");
						}
						else
						{
						System.out.println("Purchase Order is not Present Order History Page");
						}
			 }
			
	//Method for Mouse Hover 		 
		 public void  Add_To_Cartbtn(WebDriver driver )
			 	 {
					 Actions action = new Actions(driver);
					 action.moveToElement(driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"))).clickAndHold().click(driver.findElement(By.xpath("//span[text()='Add to cart']"))).click().build().perform();
					  }
		 
	 //  Method to verify  shopping cart summary page
		 public void  Shop_CartSumyPage() {
					 String bodyText = ShopCartSumyPage.getText();
					Assert.assertTrue("Text  found!", bodyText.contains("Your shopping cart"));
				 }
			 	 
		//  Method to verify  to the address section
			 public void  Address_Page() {
					 String bodyText = AddressesPage.getText();
					Assert.assertTrue("Text  found!", bodyText.contains("Addresses"));
				 }	  	 
			 	  	 //   And I directed to the shipping section
	     public void  Shipping_Sectn() {
						 String bodyText = ShippingSectn.getText();
						Assert.assertTrue("Text  found!", bodyText.contains("Shipping"));
					 }
				 	  	 
				  	 // Method to verify  to the payment section
		 public void  Payment_Sectn() {
						 String bodyText = PaymentSectn.getText();
						Assert.assertTrue("Text  found!", bodyText.contains("Your payment method"));
					 }
				  	
		 // Method to verify order summary page
		public void  Order_Sumry_Pg() {
							 String bodyText = OrderSumryPg.getText();
							Assert.assertTrue("Text  found!", bodyText.contains("Bank-wire payment."));
						 }	
			//Method to verify order confirmation page
		 public void  Ordertext() {
						 String bodyText = YourOrder.getText();
						Assert.assertTrue("Text  found!", bodyText.contains("Your order on My Store is complete."));			 
					 }	
			// Method to verify Order history page
		 public void  OrderHistory() {
					 String bodyText = OrderHistory.getText();
					Assert.assertTrue("Text  found!", bodyText.contains("Order history"));
				 }
		 
			//Method for T-Shirts link	 
			public void Click_on_Tshirtlnk()
			{
				this.TShirtslnk.click();
			}
			
		//Method for Proceed Checkout button from  cart window
			public void Proceed_To_ChkOutBtn()
				{
					//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					this.ProceedToChkOutBtn.click();
				}
			//Method for Proceed Checkout button cart from summary page
				public void Proceed_To_ChkOutBtn1()
				{
					this.ProceedToChkOutBtn1.click();
				}
			//Method for Proceed to checkout button from address section
				public void Proceed_To_ChkOutBtn2()
				{
					this.ProceedToChkOutBtn2.click();
				}
	     //Method for Terms of service checkbox button shipping section
				public void Click_On_Checkbox()
				{
					this.Checkbox.click();
				}
				//Method for  checkout button shipping section
				public void Proceed_To_ChkOutBtn3()
				{
					this.ProceedToChkOutBtn3.click();
				}
				//Method for bank wire payment option
				public void BankWirePayment_Tab()
				{
					this.BankWirePaymentTab.click();
				}
							//I click on confirm my order button
				public void ConfirmOrder()
				{
					this.ConfirmOrderbtn.click();
				}
				//Method for  Back to your account button
				public void Back_To_Myaccount()
				{
					this.BackBtn.click();
				}
						
		}


	
