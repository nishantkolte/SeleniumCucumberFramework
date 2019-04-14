$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Smoke Test of IBCG2",
  "description": "This feature is to verify the health check scenarios for IBCG2 portal",
  "id": "smoke-test-of-ibcg2",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeFeature"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Verify successful login to IBCG2 with valid credentials",
  "description": "",
  "id": "smoke-test-of-ibcg2;verify-successful-login-to-ibcg2-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@smoke1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "IBCG2 login page in \"QAI\" environment is opened in \"chrome\" web browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enters valid username",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters valid password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user gets logged in successfully and home page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Close browser window",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "QAI",
      "offset": 21
    },
    {
      "val": "chrome",
      "offset": 52
    }
  ],
  "location": "SmokeTest_step.ibcg_login_page_is_opened_in_a_web_browser(String,String)"
});
formatter.result({
  "duration": 7203172658,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest_step.user_enters_valid_username()"
});
formatter.result({
  "duration": 1150493762,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest_step.user_enters_valid_password()"
});
formatter.result({
  "duration": 1120511229,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest_step.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 6498807978,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest_step.user_gets_logged_in_successfully_and_home_page_is_displayed()"
});
formatter.result({
  "duration": 2094367178,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest_step.Close_browser_window()"
});
formatter.result({
  "duration": 231504409,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verify login to IBCG2 with invalid credentials shows error message",
  "description": "",
  "id": "smoke-test-of-ibcg2;verify-login-to-ibcg2-with-invalid-credentials-shows-error-message",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@smoke2"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "IBCG2 login page in \"PROD\" environment is opened in \"chrome\" web browser",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "user enters valid username",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user enters valid password",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "error message is displayed on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Close browser window",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "PROD",
      "offset": 21
    },
    {
      "val": "chrome",
      "offset": 53
    }
  ],
  "location": "SmokeTest_step.ibcg_login_page_is_opened_in_a_web_browser(String,String)"
});
formatter.result({
  "duration": 6747274058,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest_step.user_enters_valid_username()"
});
formatter.result({
  "duration": 1095897512,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest_step.user_enters_valid_password()"
});
formatter.result({
  "duration": 1113777836,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest_step.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 3393743189,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest_step.error_displayed()"
});
formatter.result({
  "duration": 323618943,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.fail(Assert.java:95)\r\n\tat stepdefination.SmokeTest_step.error_displayed(SmokeTest_step.java:124)\r\n\tat ✽.Then error message is displayed on login page(SmokeTest.feature:21)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "SmokeTest_step.Close_browser_window()"
});
formatter.result({
  "status": "skipped"
});
});