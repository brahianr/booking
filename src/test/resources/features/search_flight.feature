Feature: Search Flight on Booking

  Background:
    Given that user open Booking home page
    When he submit username and password
      | email           | password    |
      | testr3@test.com | Testpass123 |

  Scenario: Search flight round trip
    #Given that user open Booking home page
    When he enters the flight data
      |origin| destination | depurtateDate   | arrivalDate  |
      |Cartagena| Medellin    | octubre 1 | octubre 10 |
    Then he should see the available flights