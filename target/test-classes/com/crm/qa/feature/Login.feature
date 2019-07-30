Feature: This feature is responsible for testing all the scenarios for Login of application


Background: 
  Given I have navigated to the applications
  Then I click Signin link
   When I enter EmailAddress and Password 
  Then I click Sign in button
  Then I see the My Account page
  
 @SmokeTest
 Scenario:  User successfully place an Order for a T-Shirt
   When I click on TShirts link
   Then I directed to the TShirts My Store page
   Then I add a TShirt in to cart by clicking Add cart button 
   Then I click on Proceed to checkout button from cart window
   And I directed to shopping cart summary page
   Then I click on Proceed to checkout button from cart summary page
   And I directed to the address section
   Then I click on Proceed to checkout button from address section
   And I directed to the shipping section
   Then I click on Terms of service and Proceed to checkout button shipping section
   And I directed to the payment section
   Then I selected pay by bank wire payment option
   And I directed to the order summary page
   Then I click on confirm my order button
   And I directed to the order confirmation page
   Then Verify the presence of purchase order in order history page
   When I click on Back to your account button
   Then I see the My Account page
   Then I click on Logout button
   And I directed to the logout page
  
@RegressionTest
Scenario Outline: Update Personal Information (First Name) in My Account
   When I click on My personal information button from My account page
   Then I directed to the Identity My Store Page
   When I Update "<First Name>",Current Password,New Password and Confirmation and click on save from 
   Then I display with a successfull message in Your Personal Information section

   Examples:
   |First Name|
   |Deka|
  