@regression

Feature: User can do functions with products.

  Background:
    Given open Home

  Scenario: User can select different categories
    Given select category
    Then check category