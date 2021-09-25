Feature: Airport taxis on Booking

  Scenario: Airport taxis one way
    Given that user open Booking home page
    When he enters the taxi rental data
      | pickUpPlace | destination | pickUpDate          | pickUpTime | passengers |
      | Jardin   | Medellin    | 28, Septiembre 2021 | 13         | 3          |
    Then he should see the available taxis