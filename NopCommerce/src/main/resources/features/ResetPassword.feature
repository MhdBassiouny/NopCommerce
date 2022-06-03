@regression

Feature: User can login, register and rest password correctly.

  Background:
    Given open Home

  Scenario: User can reset password
    Given user navigate to login
    And User clicks on forget Password
    When User resets password for email: 'test457@test.com'
    Then password reset message