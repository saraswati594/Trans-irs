Feature: As a trance user, create the event manually

Scenario Outline: User should create the event manually


Given open Trance applications
When User able see the TranceIRS Application Signin Page
Then user enter the valid admins username "<username>"
Then user enter the valid admins password "<password>"
When user click on the logins button
Then user succesfully reached to the prehomepage
When user able to sees the homepage DN process
Then user able to click on the DN Workfloow
When user succesfuly reached to the DN Page
Then user click on the file optiion on menubar
When user click on the GetQCJoob Page
Then user succesfully reached to the GetQCJoob Page


Examples:   
     | username | password |
     | shetty3   | dnis@123 |