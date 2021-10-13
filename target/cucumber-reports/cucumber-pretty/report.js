$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/hp/eclipse-workspace/Digital-Nirvana/Trance-Irs/src/main/java/Features/Lunch.feature");
formatter.feature({
  "line": 1,
  "name": "As a Trance user, lunch the application",
  "description": "",
  "id": "as-a-trance-user,-lunch-the-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User should lunch the application",
  "description": "",
  "id": "as-a-trance-user,-lunch-the-application;user-should-lunch-the-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "open Trance-Irs application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User able see Trance-IRS Application Signin Page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter valid admin username \"\u003cusername\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enter valid admin password \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user succesfully reached to pre-homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user able to see homepage DN process",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user able click on DN Workflow",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user succesfully reached to DN Page",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user click on manage option on menubar",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user click on call management function",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 16,
      "value": "#Then user select the event date"
    },
    {
      "line": 17,
      "value": "#And user select search by ticker or event"
    },
    {
      "line": 18,
      "value": "#And user enter id"
    },
    {
      "line": 19,
      "value": "#And user select timezone"
    }
  ],
  "line": 20,
  "name": "user click on display button",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user able to logout",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user able to see signin page",
  "keyword": "Then "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "as-a-trance-user,-lunch-the-application;user-should-lunch-the-application;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 24,
      "id": "as-a-trance-user,-lunch-the-application;user-should-lunch-the-application;;1"
    },
    {
      "cells": [
        "shetty",
        "dnis@123"
      ],
      "line": 25,
      "id": "as-a-trance-user,-lunch-the-application;user-should-lunch-the-application;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 25,
  "name": "User should lunch the application",
  "description": "",
  "id": "as-a-trance-user,-lunch-the-application;user-should-lunch-the-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "open Trance-Irs application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User able see Trance-IRS Application Signin Page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter valid admin username \"shetty\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enter valid admin password \"dnis@123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user succesfully reached to pre-homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user able to see homepage DN process",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user able click on DN Workflow",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user succesfully reached to DN Page",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user click on manage option on menubar",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user click on call management function",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 16,
      "value": "#Then user select the event date"
    },
    {
      "line": 17,
      "value": "#And user select search by ticker or event"
    },
    {
      "line": 18,
      "value": "#And user enter id"
    },
    {
      "line": 19,
      "value": "#And user select timezone"
    }
  ],
  "line": 20,
  "name": "user click on display button",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user able to logout",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user able to see signin page",
  "keyword": "Then "
});
formatter.match({
  "location": "LunchStep.lunchTrance()"
});
formatter.result({
  "duration": 6594651300,
  "status": "passed"
});
formatter.match({
  "location": "LunchStep.seeSignPage()"
});
formatter.result({
  "duration": 2090189399,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shetty",
      "offset": 33
    }
  ],
  "location": "LunchStep.enterUserName(String)"
});
formatter.result({
  "duration": 297225400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dnis@123",
      "offset": 33
    }
  ],
  "location": "LunchStep.enter_Pass(String)"
});
formatter.result({
  "duration": 156920300,
  "status": "passed"
});
formatter.match({
  "location": "LunchStep.submitLogin()"
});
formatter.result({
  "duration": 1462610101,
  "status": "passed"
});
formatter.match({
  "location": "LunchStep.succuessfullHomepage()"
});
formatter.result({
  "duration": 1076580299,
  "status": "passed"
});
formatter.match({
  "location": "LunchStep.seeHomepage()"
});
formatter.result({
  "duration": 1071348299,
  "status": "passed"
});
formatter.match({
  "location": "LunchStep.clickDn()"
});
formatter.result({
  "duration": 1936470400,
  "status": "passed"
});
formatter.match({
  "location": "LunchStep.welcomeDn()"
});
formatter.result({
  "duration": 47449801,
  "status": "passed"
});
formatter.match({
  "location": "LunchStep.manage()"
});
formatter.result({
  "duration": 128290601,
  "status": "passed"
});
formatter.match({
  "location": "LunchStep.call_management()"
});
formatter.result({
  "duration": 2582649200,
  "status": "passed"
});
formatter.match({
  "location": "LunchStep.click_display()"
});
formatter.result({
  "duration": 609361100,
  "status": "passed"
});
formatter.match({
  "location": "LunchStep.logout()"
});
formatter.result({
  "duration": 11196573100,
  "status": "passed"
});
formatter.match({
  "location": "LunchStep.ableToSeeSignPage()"
});
formatter.result({
  "duration": 63171899,
  "status": "passed"
});
});