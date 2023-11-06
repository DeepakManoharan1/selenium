Feature: Login to HRM Application

  @validcredentials
  Scenario: Login  with the valid credentials
    Given User is on HRMLogin page
    When User enters to username and password
      | Username | Password |
      | Admin    | admi123  |
    And User clicks to login button
    Then User should be able to login sucessfully and Home page opens verified

  @invalidcredentials
  Scenario: Login  with the valid credentials
    Given User is on HRMLogin page
    When User enters to username and password
      | Username | Password |
      | Admin1   | admi123  |
      | Admin    | admi1234 |
    And User clicks to login button
    Then User should be able to login sucessfully and Home page opens verified
