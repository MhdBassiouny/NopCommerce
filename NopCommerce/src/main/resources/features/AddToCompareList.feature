@regression

Feature: User can do functions with products.

  Background:
    Given open Home

  Scenario: add product to compare list
    Given add product to compare list
    Then check compare list