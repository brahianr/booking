Feature: Add favorites lodging
  As a Booking user
  I want to add lodging to favorites
  to be able to consult them

  Background:
    Given that user open Booking home page
    When he submit username and password
      | email           | password    |
      | testr3@test.com | Testpass123 |
    Then he should be logged in

    @automatic
  Scenario: Add first hotel to favorites
    Given he enters the reservation data
      | destination | check in   | check out  |
      | Cartagena    | 2021-10-05 | 2021-10-10 |
    When he add hotel to favorites
    Then he should see the hotel in favorites