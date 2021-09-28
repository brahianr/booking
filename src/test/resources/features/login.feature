Feature: Login
  I as a Boking  user
  I want to Login
  To interact with the page

  @automatic
  Scenario: Login successful
    Given that user open Booking home page
    When he submit username and password
      | email           | password    |
      | userLogin@test.com| Testpass123 |
    Then he should be logged in

  @manual
  @manual-result:failed
   Scenario: Login Falied
     Given that user open Booking home page
     When he submit username and password
       | email           | password    |
       | testr3@test.com | Testpass |
     Then he should see the wrong email or pass message

