Feature: Hotel reservation

  Background:
    Given that user open Booking home page
    When he submit username and password
      | email           | password    |
      | testr3@test.com | Testpass123 |

  Scenario: Hotel reservation Successful
    #Given that user open Booking home page
    When he enters the reservation data
      | destination | check in   | check out  |
      | Cartagena    | 2021-09-29 | 2021-10-10 |
    And he add hotel to favorites
    #Then he should see the available lodging on Cartagena
    Then he should see the hotel in favorites