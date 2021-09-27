Feature: Add favorites lodging

  Background:
    Given that user open Booking home page
    When he submit username and password
      | email           | password    |
      | testr3@test.com | Testpass123 |

  Scenario: Add Hotel to favorites
    Given he enters the reservation data
      | destination | check in   | check out  |
      | Cartagena    | 2021-09-29 | 2021-10-10 |
    When he add hotel to favorites
    Then he should see the hotel in favorites