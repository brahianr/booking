Feature: add data for payments

  As a Booking user
  I want to add my credit card
  to be able to pay with her

  @manual
  @manual-result:passed
  Scenario: Add valid credit card
    Given the user is in the payment details option of his profile
    When he enter your credit card details
    Then he should see the message added credit card

  @manual
  @manual-result:failed
  Scenario: Add invalid credit card
    Given the user is in the payment details option of his profile
    When he enter your credit card details
    Then he should see the message can not add credit card