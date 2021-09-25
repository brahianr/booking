Feature: Hotel reservation

  Background:
    Given that user open Booking home page
    When he submit username and password
      | email           | password    |
      | testr3@test.com | Testpass123 |

  Scenario: Hotel reservation Successful
    When he enters the reservation data
      | destination | check in   | check out  |
      | Medellin    | 2021-09-29 | 2021-10-10 |
    Then he should see the confirmed reservation message