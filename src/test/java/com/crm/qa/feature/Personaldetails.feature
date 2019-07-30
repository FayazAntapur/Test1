Feature: Responsible for update Update Personal Information (First Name) &  check if the functionality works


  Scenario: Update Personal Information (First Name) in My Account
    Given I have navigated to the applications
  Then I click Signin link
   When I enter EmailAddress and Password 
      | EmailAddress                            | Password |
      | dhruba.deka621@gmail.com| Password123|
   Then I click Sign in button
   Then I see the My Account page
   When I click on My personal information button from My account page
   Then I directed to the Identity My Store Page
   When I Update First Name,Current Password,New Password and Confirmation and click on save from 
   Then I display with a successfull message in Your Personal Information section
   

