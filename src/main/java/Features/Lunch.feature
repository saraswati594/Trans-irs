Feature: As a Trance user, lunch the application

Scenario Outline: User should lunch the application

Given open ecs application
Then user enter valid username "<ecsusername>"
Then user enter valid password "<ecspassword>"
When click on signin button 
Then user succesfully reached to homepage
Then user click on add event
When user can see new eventpage 
Then user choose event type as
Then user enter company name as "<ecscompanyname>"
Then user enter date and time as "<ecsdatewithtime>"
Then user choose final quarter as "<ecsquater>"
Then user choose final year as "<ecsyear>"
Then user choose source url as "<ecsurl>"
Then user enter live phonecall as "<ecsphonecall>"
Then user enter passcode as "<ecspasscode>"
Then user enter replay livecall as "<ecslivecall>"
Then user enter replay passcode as "<ecslivepass>"
Then User enter live webcasturl as "<ecswebcasturl>"
Then user enter replay webcast url as "<ecslivewebcasturl>"
When user click on next button
Then user need to wait for event create
Then user click on procesed data
Then user check the event is created or not by "<ecscheckcompanyname>"
Then user able to logout

Given open Trance-Irs application
When User able see Trance-IRS Application Signin Page
Then user enter valid admin username "<username>"
Then user enter valid admin password "<password>"
When click on login button
Then user succesfully reached to pre-homepage
Then user able click on DN Workflow for call management
Then user click on manage option on menubar for call management
And user click on call management function
And user select the job date as "<jobdate>"
And user enter the ticker name as "<searchticker>"
And user select the timezone as "<timezone>"
And user click on display button
Then user verify the tiker present or not "<ticker>"
And user select the team management
And user select the team for skimmer
And user select the team for editor
And user select the team for qc
And user select the all prority
Then user logout to homepage
When user able to clicks on the DN Workflow for skimmer
Then user succesfully reacheds to the DN Page for skimer
Then user click on the file option on menubars for skimer
When user click on the GetWriterJobs Page
Then user succesfully reacheds to the GetWriterJob Page
Then user verify text should present in text filed
And user push the text to upper text filed
And user save the process for skimmer
Then user click on file option on menubar 
Then user click on jobcomplete option for skimmer
When user able to see popup option for skimmer
Then user click on logout for skimmer	
Then users able to click on the DN Workflow for editor
When users succesfully reached to the DN Page for editor
Then users click on the file option on menubar for editor
When users click on the GetEditorJob Page
Then users succesfully reached to the GetEditorJob Page
Then user click on move up button
And user click on save button for editor
Then user click on file option on menubar 
And user click on job complete option for editor
When user able to see popup job complete for editor
Then user click on logout button editor
Then user able to click on the DN Workfloow for qc
When user succesfuly reached to the DN Page for qc
Then user click on the file optiion on menubar for qc
When user click on the GetQCJoob Page
Then user succesfully reached to the GetQCJoob Page
Then user click on save option for qc
Then user click on file option for qc
And user click on close job button for qc
When user can able to see popup for confirmation for qc
Then user click on logout option
Then user able to click on the DN Workflows for xmlpage
Then user click on the file opttion on menubar for xmlpage
When user click on the ManageXML Option for xml
Then user succesfully reached to the ManageXML Pages
And user enters the from date "<fromdate>"
And user enters the to date "<todate>"
And user select the ticker
And user enter the ticker searchby "<searchticker>"
Then user click on load events button
And user select the raw formats
And user click on load button for xml page
Then user click on view xmls
When user can able to see the xmls tag script
And user enter the periods end date "<perioddate>"
And user select the industry types
And user click on save option for xml 
And user click on uplaod options
And user enter the ticker "<searchticker>"
Then user uplaod the audio click on audio uplaod buttons
And user upload raw xml files 
And user uplaod corrected xml files
Then user able to sucessfully uplaod the file for xml
Then user logout the page for xml page

	
		Examples:  
		
| ecsusername| ecspassword | ecscompanyname   | ecsdatewithtime     | ecsquater | ecsyear | ecsurl         | ecsphonecall | ecspasscode | ecslivecall | ecslivepass | ecswebcasturl                             | ecslivewebcasturl | ecscheckcompanyname | username | password | jobdate    | searchticker | timezone | ticker    | fromdate | todate      | searchticker |  perioddate  |
| shetty     | dnis@123    |   Apple          | 2021-10-29 06:55    |    Q2     | 2021    | www.abc.com    |8558592056    | 8870579     |             |             |https://www.youtube.com/watch?v=Iv2WgJ3YM9o|                   |    APPLE            | shetty1  | dnis@123 | 2021-10-26 |  APPLECREDT  |   UTC    |APPLECREDT |          |           	 | APPLECREDT        |   2021-09-30 |