@regression

Feature: User can do functions with products.

  Background:
    Given open Home

  Scenario: User can select Tags
    Given select category
    Given select tag
    Then check tag