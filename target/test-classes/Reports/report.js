$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Facebook.feature");
formatter.feature({
  "name": "Verify facebook application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate facebook login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    },
    {
      "name": "@Reg"
    }
  ]
});
formatter.step({
  "name": "User enter \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User click on login Button",
  "keyword": "And "
});
formatter.step({
  "name": "User get error message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ]
    },
    {
      "cells": [
        "abu@gmail.com",
        "abu@123"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate facebook login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    },
    {
      "name": "@Reg"
    }
  ]
});
formatter.step({
  "name": "User enter \"abu@gmail.com\" and \"abu@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on login Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_on_login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User get error message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_get_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate facebook singup page with invalid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@Reg"
    }
  ]
});
formatter.step({
  "name": "User click on createNew Button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_click_on_createNew_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Nitish\" and \"Selvakumar\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on signup Button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Click_on_signup_Button()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat com.stepdef.StepDefinition.user_Click_on_signup_Button(StepDefinition.java:55)\r\n\tat ✽.User Click on signup Button(src/test/resources/Features/Facebook.feature:20)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
});