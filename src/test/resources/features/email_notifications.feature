Feature: Email notifications
  As a Booking user
  I want a notification option
  To manage them

  Background:
    Given that user open Booking home page
    When he submit username and password
      | email           | password    |
      | testnotify@test.com | Testpass123 |
    Then he should be logged in
  @automatic
  Scenario: Unsubscribe from email notifications for reservations
    Given that user is in email notifications for reservation option
    When unsubscribe from email notifications for reservations
    Then he should see the message you have unsubscribed

  @manual
  @manual-result:passed
  Scenario: Update email notifications for offers
    Given that user is in email notifications option of his profile
    When he update his notifications for offers
    Then he should see the message notifications updated correctly

  @manual
  @manual-result:passed
  Scenario: Update email notifications for products and services
    Given that user is in email notifications option of his profile
    When he update his notifications for products and services
    Then he should see the message notifications updated correctly

  @manual
  @manual-result:passed
  Scenario: Update email notifications for travel experiences
    Given that user is in email notifications option of his profile
    When he update his notifications for travel experiences
    Then he should see the message notifications updated correctly