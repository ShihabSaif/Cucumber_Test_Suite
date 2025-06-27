Feature: feature to test login functionality
  Scenario Outline: check login is successful with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And click login button
    Then user is navigated to the homepage
    Examples:
      | username | password |