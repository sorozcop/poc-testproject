Feature: As user I want to purchase products that are in stock

  Scenario: Purchasing products that has stock
    Given a user was able to purchase products
    When he checks out his purchasing cart
    Then he must see CONGRATS

  Scenario: Deleting products from shopping cart
    Given a user was able to purchase products
    When he does not want to purchase the product Luz de bicicleta Sauce Labs
    Then he must be able to delete it from purchasing cart