Feature: Airport taxis on Booking

  #  Background:
#    Given that user open Booking home page
#    When he submit username and password
#      | email           | password    |
#      | testr3@test.com | Testpass123 |

  Scenario: Airport taxis one way
    Given that user open Booking home page
    When he enters the taxi rental data
      | pickUpPlace | destination         | pickUpDate      | pickUpTime | passengers |
      | Medellin    | Aeropuerto Medellin | 30, Septiembre 2021 | 10         | 2          |
    Then he should see the available taxis