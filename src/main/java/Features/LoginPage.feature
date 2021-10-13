#Author: Saraswati Panda

@Login
Feature: As a Trance user I should be able to login and logout with valid credentials
@ValidLogin
  Scenario Outline: Login into the application with valid credentials
  	Given user on the Login page URL
    Then user able see Sign In Page
    Then user enter username as "<username>"
    Then user enter password as "<password>"
    When user click on login button
    Then user able to login successfully
    And user click on Sign out function
	  Then user got logout from the application and land on sign in page
   
		Examples:   
     | username | password |
     | shetty   | dnis@123 |
 
 @InvalidLogin    
 Scenario Outline: Login into the application with Invalid credentials
  	Given user on the Login page URL
    Then user able see Sign In Page
    Then user enter username as "<username>"
    Then user enter password as "<password>"
    When user click on login button
    Then user not be able to login successfully
    
	  
	  Examples:
	   | username | password |
     | shetty   | Dnis@124 |