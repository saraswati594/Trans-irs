Feature: As a trance user, skimmer editing

Scenario Outline: User should edit the skimmer part
Given open Trance-irss application
When User able see the Trance-IRSs Application Signin Page
Then user enter the valid admin usernames "<username>"
Then user enter the valid admin passwords "<password>"
When user clicks on the login button
Then user succesfullys reached to the pre-homepage
When user able to see the homepage DN processs
Then user able to clicks on the DN Workflow
When user succesfully reacheds to the DN Page
Then user click on the file option on menubars
When user click on the GetWriterJobs Page
Then user succesfully reacheds to the GetWriterJob Page


Examples:   
     | username | password |
     | shetty1   | dnis@123 |