Feature: As a trance user, user need to manage XML

Scenario Outline: user should need to manage XML

Given opan trans-irs application
When User ables see the Trance-IRS Application Signin Page
Then user enters the valid admin username "<username>"
Then user enters the valid admin password "<password>"
When user click ons the login button
Then user succesfully reached tos the pre-homepage
When user able to see the homepages DN process
Then user able to click on the DN Workflows
When user succesffully reached to the DN Page
Then user click on the file opttion on menubar
When user click on the ManageXML Option
Then user succesfully reached to the ManageXML Page
And user enter the from date "<fromdate>"
And user enter the to date "<todate>"
And user select the event or ticker "<eventid>"
And user enter the eventid or ticker "<>"
Then user click on load events button
And user check the eventid is showing "<eventidshow>"
And user select the raw format
And user click on load button
Then user click on view xml
When user can able to see the xml
And user enter the period end date "<perioddate>"
And user select the industry type
And user click on save option
Then user download the xml 
And user click on uplaod option
Then user uplaod the audio click on audio uplaod button
And user click on uplaod audio file
And user upload raw xml file 
And user uplaod corrected xml file
Then user able to sucessfully uplaod the file
Then user logout the page

Examples:   
     | username  | password | fromdate | todate | eventid | eventid | eventidshow | perioddate |
     | shetty1   | dnis@123 |          |        |         |         |             |            |