@Login
Feature: To test the login function of the application

  @Validlogin
  Scenario Outline: Checking login functionality with valid credential
    Given User is on TodayTix webpage and try to login
    When User enters valid "<username>" and "<password>"
    Then User should be able to login successfully

    Examples: 
      | username | password |
      | testuser12@gmail.com | Test@123 |
