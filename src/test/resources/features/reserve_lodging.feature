Feature: Reserve lodging
  As a Booking user
  I want to book an accommodation
  To my stay

  Background:
    Given that user open Booking home page
    When he submit username and password
      | email           | password    |
      | reservetest@test.com | Testpass123 |
    Then he should be logged in

  Scenario: Reserve lower price lodging
    Given he enters the reservation data
      | destination | check in   | check out  |
      | Medellin    | 2021-10-05 | 2021-10-10 |
    When he choose the lowest priced hotel
    Then he should see the message reservation confirmed