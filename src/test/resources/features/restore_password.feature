Feature: Restore password

  @manual-result:passed
  Scenario: Restore password in login page
    Given Given the user is in secutity option of his profile
    When he press the forgot password option
    Then he should see the message link to reset password sent to email

  @manual-result:passed
  Scenario: Restore password in security option
    Given Given the user is in secutity option of his profile
    When he press the reset password option
    Then he should see the message link to reset password sent to email