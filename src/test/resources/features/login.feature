Feature: Login
  I as a Boking  user
  I want to Login
  To interact with the page

  Scenario: Login successful
    Given that user open Booking home page
    When he submit username and password
      | email           | password    |
      | testr3@test.com | Testpass123 |
    Then he should be logged in

