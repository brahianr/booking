Feature: Reserve lodging

  Background:
    Given that user open Booking home page
    When he submit username and password
      | email           | password    |
      | testr3@test.com | Testpass123 |

  Scenario: Reserve lower price lodging
    Given he enters the reservation data
      | destination | check in   | check out  |
      | Medellin    | 2021-09-29 | 2021-10-10 |
    When he choose the lowest priced hotel
    Then he should see the message reservation confirmed