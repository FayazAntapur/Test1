Feature: Responsible for verfiying  submiting  an T-shirt order, Create cart, verifying pages such as : TShirts My Store page,  shopping cart summary page ,
address section, address section, payment page and  order history


  Scenario:  User successfully place an Order for a T-Shirt
  Given I have navigated to the applications
  Then I click Signin link
  When I enter EmailAddress and Password 
      | EmailAddress                            | Password |
      | dhruba.deka621@gmail.com| Password123|
   Then I click Sign in button
   Then I see the My Account page
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
    