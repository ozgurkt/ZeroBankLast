@activity @full
Feature: Account Activity Functions

  Background:
    Given the user is on the login page
    When User logins with username "username" and password "password"

  Scenario: Verifying Account Drop Down Options
    And User navigates to "Account Activity"
    Then the "Account Activity" page should be displayed
    And user select "Loan" option
    Then Account drop down should have "Loan" selected