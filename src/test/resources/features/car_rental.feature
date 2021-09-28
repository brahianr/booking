Feature: Search car for rental on Booking
  As a Booking user
  I want to rent a car
  to transport me

  @manual
  @manual-result:passed
  Scenario: Search car for rental and return elsewhere
    Given that user open Booking home page
    When he enter the data to rent the car
      | pickUpPlace | destinationPlace | pickUpMonth | pickUpDay | returnMonth | returnDay |
      | Bogota      | Medellin         | Octubre     | 1         | Octubre     | 5         |
    Then he should see the available cars