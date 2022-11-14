Feature: Creating new account
  Scenario: New user registration
    Given user is on register page
    And user add nickname, email and password
    When user fill the form
    Then new account will be created