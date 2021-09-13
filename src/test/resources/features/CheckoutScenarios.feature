@Chrome
Feature: CheckoutScenarios
  These scenarios can be used in any project
  Background:
    Given a user is on the base page

  Scenario: 01. Complete the checkout process
    When they click on Sign in button
    And they enter the email "test.automations.scripts@gmail.com"
    And they enter the password "AutTest123"
    And they click the Submit Sign in Button
    Then they see the page title contains "My account - My Store"
    And they search the product "Faded Short Sleeve T-shirts"
    And they click on product search result
    And they click the Add To Cart button
    And they click the Proceed To Checkout button
    And they confirm shopping cart products
    And they process the address
    And they click on checkbox
    And they process the carrier
    And they click on Pay by bank wire button
    And they click on confirm my order
    And they see the order status message  "Your order on My Store is complete."