Feature: Tourist attraction reservation on Booking

  Scenario: tourist attraction reservation
    Given that user open Booking home page
    When he enters the data to attraction reservation
      | pickUpPlace | destination         | pickUpDate      | pickUpTime | passengers |
      | Medellin    | Aeropuerto Medellin | 30, Septiembre 2021 | 10         | 2          |
    Then he should see the available tourist attractions