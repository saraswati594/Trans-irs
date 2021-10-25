Feature: As a trance user, create the event manually

Scenario Outline: User should create the event manually

Given open Trances application
When User able see the Trance-IRS Application Sign-in Page
Then user enter the valid admin user-name "<username>"
Then user enter the valid admin pass-word "<password>"
When users click on the login button
Then users succesfully reached to the pre-homepage
When users able to see the homepage DN process
Then users able to click on the DN Workflow
When users succesfully reached to the DN Page
Then users click on the file option on menubar
When users click on the GetEditorJob Page
Then users succesfully reached to the GetEditorJob Page
And user able to check ticker "<ticker>"
And user able to check eventid "<eventid>"
And user click on save button
Then user click on file option on menubar
And user click on job complete option
When user able to see popup job complete
Then user click on logout button
Then user successfully logout 


Examples:   
     | username | password | ticker | eventid |
     | shetty2  | dnis@123 |        |         |