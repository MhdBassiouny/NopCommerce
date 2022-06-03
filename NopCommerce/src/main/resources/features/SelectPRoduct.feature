@regression

Feature: User can do functions with products.

  Background:
    Given open Home

  Scenario: User can search for a product
    Given Search for computer
    Then Check search result