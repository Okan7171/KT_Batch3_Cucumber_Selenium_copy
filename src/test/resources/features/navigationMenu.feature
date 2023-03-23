Feature: Navigation Menu

  Scenario: Navigation to Developers menu
    Given The user is on the login page
    When The user enters valid credentials that belongs to Mike
    Then The user should be able to see Dashboard text
    And The user navigates to Developer menu
    Then The user able to see Developers text

  @wip
  Scenario: Navigation to Forms Input menu
    Given The user is on the login page
    When The user enters valid credentials that belongs to Mike
    Then The user should be able to see Dashboard text
    And The user navigates to Forms Input menu
    Then The user able to see General Form Elements - Input text

  @wip
  Scenario: Navigation to My Profile menu
    Given The user is on the login page
    When The user enters valid credentials that belongs to Mike
    Then The user should be able to see Dashboard text
    And The user navigates to My Profile menu
    Then The user able to see User Profile text
