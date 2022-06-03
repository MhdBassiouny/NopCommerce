@regression

Feature: User can do functions with products.

  Background:
    Given open Home

  Scenario: User can switch currency
    Given change currency
    Then check currency