Feature: As a Trance user, lunch the application

Scenario Outline: User should lunch the application

Given open Trance-Irs application
When User able see Trance-IRS Application Signin Page
Then user enter valid admin username "<username>"
Then user enter valid admin password "<password>"
When click on login button 
Then user succesfully reached to pre-homepage
When user able to see homepage DN process
Then user able click on DN Workflow
When user succesfully reached to DN Page
Then user click on manage option on menubar
And user click on call management function
#Then user select the event date
#And user select search by ticker or event
#And user enter id
#And user select timezone
Then user click on display button
Then user able to logout
Then user able to see signin page
		Examples:   
     | username | password |
     | shetty   | dnis@123 |