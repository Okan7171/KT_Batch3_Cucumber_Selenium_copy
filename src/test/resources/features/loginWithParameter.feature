@LoginWithParameter
Feature: Log in as different user

  Scenario: Log in as mike with parameter
    Given The user is on the login page
    When The user logs in using "mike@gmail.com" and "mike1234"
    Then The user should be able to login
    And The user name should be "mike"

  Scenario: Log in as Jhon with parameter
    Given The user is on the login page
    When The user logs in using "john@gmail.com" and "John1234."
    Then The user should be able to login
    And The user name should be "John"

  Scenario: Log in as Eddie with parameter
    Given The user is on the login page
    When The user logs in using "eddiem@kraft.com" and "eddiem12"
    Then The user should be able to login
    And The user name should be "Eddie Murphy"

  Scenario: Log in as Morgan with parameter
    Given The user is on the login page
    When The user logs in using "morganfreeman@kraft.com" and "mfreeman"
    Then The user should be able to login
    And The user name should be "Morgan Freeman"
