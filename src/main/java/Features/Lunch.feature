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
Then user verify the tiker present or not "KFI53"
And user verify the recording is availble or not 
And user select the team management
And user select the team for skimmer "574"
And user select the team for editor "574"
And user select the team for qc "574"
And user select the all prority
Then user able to logout
Then user able to see signin page
		Examples:   
     | username | password |
     | shetty   | dnis@123 |