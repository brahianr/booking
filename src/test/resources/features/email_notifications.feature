Feature: Email notifications

  @manual-result:passed
  Scenario: Update email notifications for offers
    Given Given the user is in email notifications option of his profile
    When he update his notifications for offers
    Then he should see the message notifications updated correctly

  @manual-result:passed
  Scenario: Update email notifications for products and services
    Given Given the user is in email notifications option of his profile
    When he update his notifications for products and services
    Then he should see the message notifications updated correctly

  @manual-result:passed
  Scenario: Update email notifications for travel experiences
    Given Given the user is in email notifications option of his profile
    When he update his notifications for travel experiences
    Then he should see the message notifications updated correctly