Feature: Update personal information
  As a Booking user
  I want to be able to update my data
  To have my data updated

  @manual
  @manual-result:passed
  Scenario: update personal information successful
    Given Given the user is in personal information option of his profile
    When he enter the data to update
    Then he should see the message data updated correctly