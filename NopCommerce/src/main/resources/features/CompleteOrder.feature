@regression

Feature: User can do functions with products.

  Background:
    Given open Home

  Scenario: create order
    Given user navigate to login
    And Login User 'test457@test.com' and 'Test@123'
    Given add product to cart
    And complete order
    Then check order