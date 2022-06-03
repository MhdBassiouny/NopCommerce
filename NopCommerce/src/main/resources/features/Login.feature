@regression

Feature: User can login, register and rest password correctly.

  Background:
    Given open Home

  Scenario: User can login with correct username/password
    Given user navigate to login
    And Login User 'test457@test.com' and 'Test@123'
    Then Successful login

