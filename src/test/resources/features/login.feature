@login @full
Feature: Online Banking Login Feature

  Background:
    Given the user is on the login page

  Scenario: Authorized users should be able to login to the application
    And User logins with username "username" and password "password"
    Then the "Account Summary" page should be displayed


  Scenario Outline: Unauthorized users should NOT be able to login <usernameInput>
    And User logins with username "<usernameInput>" and password "<passwordInput>"
    Then Error message "Login and/or password are wrong." should be displayed
    Examples:
      |usernameInput|passwordInput|
      |username     |wrong        |
      |wrong        |password     |
      |username     |             |
      |             |password     |
      |             |             |
