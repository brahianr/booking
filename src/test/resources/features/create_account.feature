Feature: Create account
  I as a web user
  I want to register
  To interact with the page

  @manual-result:passed
  Scenario: Create successful account
    Given that a web user wants to register on booking
    When he fills all the requested fields
      | email          | password    |
      | testr5@test.com | Testpass123 |
    Then he should see the welcome message

  @@manual-result:failed
  Scenario: Failed account creation by password does not meet the requirements
    Given that a web user wants to register on booking
    When he fills all the requested fields
      | email          | password    |
      | testr5@test.com | Testpass |
    Then He should see the message the password does not meet the requirements

  @@manual-result:failed
  Scenario: Account creation failed due to passwords mismatch
    Given that a web user wants to register on booking
    When he fills all the requested fields
      | email          | password    |
      | testr5@test.com | Testpass |
    Then He should see the message the ppasswords do not match


