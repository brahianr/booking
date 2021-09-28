Feature: Add travel companion
  As a Booking user
  I want to add a travel companion
  To have your data when making reservations

  Background:
    Given that user open Booking home page
    When he submit username and password
      | email           | password    |
      | testcompanion@test.com | Testpass123 |
    Then he should be logged in

  Scenario: Add travel companion successful
    Given that user is in travel companion option
    When he enters the data of his companion
      | name     | lastname | birthDay | birthMonth | birthYear |
      | nameTest | LasTest  | 12       | 05         | 1997      |
    Then he should see nameTest added