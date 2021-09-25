Feature: Create account
  I as a web user
  I want to register
  To interact with the page

  Scenario: Create successful account
    Given that a web user wants to register on booking
    When he fills all the requested fields
      | email          | password    |
      | testr5@test.com | Testpass123 |
    Then he should be logged in
