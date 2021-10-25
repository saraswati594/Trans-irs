Feature: As a trance user, skimmer editing

Scenario Outline: User should edit the skimmer part

Given opening Trance-irs application
When User able see the Trance-IRSs Application Signing Page
Then user able to enter skimmer valid usernames "<username>"
And user able to enter skimmer valid password "<password>"
Then user able to clicks on the login button
When user succesfullys reached to the pre-homepage
Then user able to see the homepage DN processs
When user able to clicks on the DN Workflow
Then user succesfully reacheds to the DN Page
Then user click on the file option on menubars
When user click on the GetWriterJobs Page
Then user succesfully reacheds to the GetWriterJob Page
When user checks the ticker name it should match with given ticker "<ticker>"
Then user check the eventid it should match with given eventid "<eventid>"
Then user verify text should present in text filed
And user push the text to upper text filed
And user save the process
Then user click on file option on menubar
Then user click on jobcomplete option
When user able to see popup option
Then user click on logout

Examples:   
     | username  | password | ticker | eventid |
     | shetty1   | dnis@123 |        |         |