@Chrome
Feature: HomeScenarios
  These scenarios can be used in any project
  Background:
    Given a user is on the base page

  Scenario: 01. Validate Authentication page is displayed
    When they click on Sign in button
    Then they see the Authentication page

  Scenario: 02. Validate empty email error message
    When they click on Sign in button
    And they click the Submit Sign in Button
    Then they see the error message "An email address required."

  Scenario: 03. Validate invalid email error message
    When they click on Sign in button
    And they enter the email "testInvalidEmail"
    And they click the Submit Sign in Button
    Then they see the error message "Invalid email address."

  Scenario: 04. Validate empty password error message
    When they click on Sign in button
    And they enter the email "test@gmail.com"
    And they click the Submit Sign in Button
    Then they see the error message "Password is required."

  Scenario: 05. Validate invalid password error message
    When they click on Sign in button
    And they enter the email "test.automations.scripts@gmail.com"
    And they enter the password "wrongPassword"
    And they click the Submit Sign in Button
    Then they see the error message "Authentication failed."

  Scenario: 06. Validate invalid password error message
    When they click on Sign in button
    And they enter the email "test.automations.scripts@gmail.com"
    And they enter the password "AutTest123"
    And they click the Submit Sign in Button
    Then they see the page title contains "My account - My Store"