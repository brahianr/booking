Feature: Update preferences

  @manual-result:passed
  Scenario: update preferences successful
    Given Given the user is in preferences option of his profile
    When he update his preferences
    Then he should see the message preferences updated correctly