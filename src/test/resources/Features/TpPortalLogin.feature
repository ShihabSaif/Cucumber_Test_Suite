Feature: tp portal login feature functionality

  Scenario Outline:
    Given chrome browser is open
    And user is on portal login page
    When user enters valid <username> and <password>
    And user clicks login button
    When user enters otp number
    And user clicks submit button
    Then user is navigated to the portal homepage

    Examples:
      | username | password |
      | shihab   | Shihab@007!  |
