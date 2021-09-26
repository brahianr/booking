Feature: Update personal information

  @manual-result:passed
  Scenario: update personal information successful
    Given Given the user is in personal information option of his profile
    When he enter the data to update
    Then he should see the message data updated correctly