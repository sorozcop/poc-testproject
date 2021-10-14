package stepsdefinition;

import assertions.MustSeeCongrats;
import assertions.PurchasingCart;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tasks.AddProducts;
import tasks.Checkout;
import tasks.GoToShopping;
import tasks.Login;
import tasks.RemoveItems;

import static stepsdefinition.Hooks.tearDown;

public class PurchasingProducts {
    private String removedProductName;

    @Given("a user was able to purchase products")
    public void aUserWasAbleToPurchaseProducts() {
        Login.toPurchaseProducts();
        AddProducts.toPurchasingCart();
    }

    @When("he checks out his purchasing cart")
    public void heChecksOutHisPurchasingCart() {
        Checkout.process();
    }

    @Then("he must see CONGRATS")
    public void heMustSeeCONGRATS() {
        MustSeeCongrats.message();
        tearDown();
    }

    @When("^he does not want to purchase the product (.*)$")
    public void heDoesNotWantToPurchaseAProduct(String removedProductName) {
        this.removedProductName = removedProductName;
        GoToShopping.cart();
        RemoveItems.fromPurchasingCart(removedProductName);
    }

    @Then("he must be able to delete it from purchasing cart")
    public void heMustBeAbleToDeleteItFromPurchasingCart() {
        PurchasingCart.mustNotShow(removedProductName);
        tearDown();
    }
}