@SmokeFeature
Feature: Smoke Test of IBCG2
  This feature is to verify the health check scenarios for IBCG2 portal

  @smoke1
  Scenario: Verify successful login to IBCG2 with valid credentials
    Given IBCG2 login page in "QAI" environment is opened in "chrome" web browser
    When user enters valid username
    And user enters valid password
    And user clicks on login button
    Then user gets logged in successfully and home page is displayed
    And Close browser window
    

  @smoke2
  Scenario: Verify login to IBCG2 with invalid credentials shows error message
    Given IBCG2 login page in "PROD" environment is opened in "chrome" web browser
    When user enters valid username
    And user enters valid password
    And user clicks on login button
    Then error message is displayed on login page
    And Close browser window
    
