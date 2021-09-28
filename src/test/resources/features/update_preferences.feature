Feature: Update preferences
  As a Booking user
  I want to be able to update my preferences
  to keep them updated

  @manual
  @manual-result:passed
  Scenario: update preferences successful
    Given Given the user is in preferences option of his profile
    When he update his preferences
    Then he should see the message preferences updated correctly