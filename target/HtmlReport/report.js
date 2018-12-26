$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/CucumberDemo/subcrib.feature");
formatter.feature({
  "name": "UC-FE01 As an end user I want the ability to provide my information,",
  "description": "so that I may receive the newsletters from provider",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Show popup message \"Bạn đã đăng ký thành công\"",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "I am staying testmaster",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter email as \"\u003cemail\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I do submit button Regis",
  "keyword": "And "
});
formatter.step({
  "name": "I enter Name value",
  "keyword": "And "
});
formatter.step({
  "name": "I do submit button Allow",
  "keyword": "And "
});
formatter.step({
  "name": "I see popup message \"success\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email"
      ]
    },
    {
      "cells": [
        "test14@cn.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Show popup message \"Bạn đã đăng ký thành công\"",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am staying testmaster",
  "keyword": "Given "
});
formatter.match({
  "location": "SubcribStepDefiniton.i_am_staying_testmaster()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter email as \"test14@cn.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "SubcribStepDefiniton.i_enter_email_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I do submit button Regis",
  "keyword": "And "
});
formatter.match({
  "location": "SubcribStepDefiniton.i_do_submit_button_Regis()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Name value",
  "keyword": "And "
});
formatter.match({
  "location": "SubcribStepDefiniton.i_enter_Name_value()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I do submit button Allow",
  "keyword": "And "
});
formatter.match({
  "location": "SubcribStepDefiniton.i_do_submit_button_Allow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see popup message \"success\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SubcribStepDefiniton.i_see_popup_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});