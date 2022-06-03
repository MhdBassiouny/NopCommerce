@regression

Feature: User can do functions with products.

  Background:
   Given open Home

  Scenario: add product to shipping cart
    Given add product to cart
    Then check cart