@Chrome
Feature: HomeScenarios
  These scenarios can be used in any project
  Background:
    Given a user is on the base page

  Scenario: 01. Validate the title of a website
    Then they see the page title contains "My Store"

  Scenario: 02. Validate the Url of the website
    Then they see the page Url contains "http://automationpractice.com/index.php"

  Scenario: 03. Validate Sign in button is displayed
    Then they see the Sign in button

  Scenario: 04. Validate Authentication page is displayed
    When they click on Sign in button
    Then they see the Authentication page
