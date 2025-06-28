Feature: feature to test google search functionality
  Scenario: validate google search is working
    Given browser is open
    And user is on google search page
    When user enters text in search box
    Then user is navigated here

