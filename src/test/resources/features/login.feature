Feature: Login
  #As a user, I should be able to login with my valid credentials so that I
  #can reach out to the app to use.
  #Acceptance Criteria:
  #     1. User should be able to login with valid credentials.
  #     2. User should not be able to login with invalid credentials.
  #     3. ...
  #     4. ...

  Scenario: Login as Mike
    Given The user is on the login page
    When The user enters valid credentials that belongs to Mike
    Then The user should be able to login

  Scenario:  Login as Jack
    Given The user is on the login page
    When The user enters valid credentials that belongs to Jack
    Then The user should be able to login

    Scenario: Login as Sebastian
      Given The user is on the login page
      When The user enters valid credentials that belongs to Sebastian
      Then The user should be able to login
