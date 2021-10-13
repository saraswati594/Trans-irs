Feature: As a Trance user, create the event manually

Scenario Outline: User should create the event manually

Given open Trance application
When User able see the Trance-IRS Application Signin Page
Then user enter the valid admin username "<username>"
Then user enter the valid admin password "<password>"
When user click on the login button 
Then user succesfully reached to the pre-homepage
When user able to see the homepage DN process
Then user able to click on the DN Workflow
When user succesfully reached to the DN Page
Then user click on the manage option on menubar
When user click on the jobscheduler page
Then user succesfully reached to the jobscheduler page
When user click on the addjob button
Then one popup form will be displayed
Then user enter the event key
And user enter the event date
And user select the time zone
And user select the type
And user enter the exchange
And user select the category
And user enter the company
And user select the client
And user enter the ticker
And user enter the event title
And user enter the job date
And user select the AT1 Model
And user select the sk team
And user select the year
And user select the period
And user select the stream status
Then user click on submit button


Examples:   
     | username | password |
     | shetty   | dnis@123 |