$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/CucumberDemo/subcrib.feature");
formatter.feature({
  "name": "UC-FE01 As an end user I want the ability to provide my information,",
  "description": "so that I may receive the newsletters from provider",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Show popup message \"success\"",
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
        "test23@cn.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Show popup message \"success\"",
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
  "name": "I enter email as \"test23@cn.com\"",
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
  "error_message": "org.openqa.selenium.NoAlertPresentException: no such alert\n  (Session info: chrome\u003d71.0.3578.98)\n  (Driver info: chromedriver\u003d2.45.615291 (ec3682e3c9061c10f26ea9e5cdcf3c53f3f74387),platform\u003dWindows NT 10.0.15063 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027VBS-HOACT3-P\u0027, ip: \u002710.61.185.162\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.45.615291 (ec3682e3c9061c..., userDataDir: C:\\Users\\ChuHoa\\AppData\\Loc...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:50874}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 71.0.3578.98, webStorageEnabled: true}\nSession ID: 11231aed722ad7e6dce4049b75413143\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:605)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteTargetLocator.alert(RemoteWebDriver.java:928)\r\n\tat stepdefinitions.SubcribStepDefiniton.i_see_popup_message(SubcribStepDefiniton.java:125)\r\n\tat ✽.I see popup message \"success\"(src/test/resources/CucumberDemo/subcrib.feature:56)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});