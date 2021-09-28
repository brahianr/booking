Feature: Search Flight on Booking
  As a Booking user
  I want to look for a flight
  To go around

  @manual
  @manual-result:passed
  Scenario: Search flight round trip
    Given that user open Booking home page
    When he enters the flight data
      |origin| destination | depurtateDate   | arrivalDate  |
      |Cartagena| Medellin    | octubre 1 | octubre 10 |
    Then he should see the available flights