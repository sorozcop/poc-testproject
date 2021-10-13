Feature: As user I want to purchase products that are in stock

  Scenario: Purchasing products that has stock
    Given a user was able to purchase products
    When he checks out his purchasing cart
    Then he must see CONGRATS

  Scenario: Deleting products from shopping cart
    Given a user has products on his shopping cart
    When he doesn't want to purchase a product
    Then he must be able to delete it from purchasing cart