@regression

Feature: User can login, register and rest password correctly.

  Background:
    Given open Home

  Scenario: User can register a new account
    Given User clicks on register
    And register User 'test457@test.com' and 'Test@123'
    When Click register
    Then A new account is created