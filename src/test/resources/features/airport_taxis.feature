Feature: Airport taxis on Booking

  Scenario: Airport taxis one way
    Given that user open Booking home page
    When he enters the taxi rental data
      | pickUpPlace | destination         | pickUpDate      | pickUpTime | passengers |
      | Medellin    | Aeropuerto Medellin | 30, Septiembre 2021 | 10         | 2          |
    Then he should see the available taxis