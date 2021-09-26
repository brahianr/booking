Feature: add data for payments

  @manual-result:passed
  Scenario: Add valid credit card
    Given the user is in the payment details option of his profile
    When he enter your credit card details
    Then he should see the credit card added

  @manual-result:failed
  Scenario: Add invalid credit card
    Given the user is in the payment details option of his profile
    When he enter your credit card details
    Then he should see the message can not add credit card