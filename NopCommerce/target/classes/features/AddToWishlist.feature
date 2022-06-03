@regression

Feature: User can do functions with products.

  Background:
    Given open Home

  Scenario: add product to wish list
    Given add product to wish list
    Then check wish list