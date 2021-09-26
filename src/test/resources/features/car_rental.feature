Feature: Search car for rental on Booking

#  Background:
#    Given that user open Booking home page
#    When he submit username and password
#      | email           | password    |
#      | testr3@test.com | Testpass123 |

  Scenario: Search car for rental and return elsewhere
    Given that user open Booking home page
    When he enter the data to rent the car
      | pickUpPlace | destinationPlace | pickUpMonth | pickUpDay | returnMonth | returnDay |
      | Bogota      | Medellin         | Octubre     | 1         | Octubre     | 5         |
    Then he should see the available cars