package stepsdefinition;

import assertions.MustSeeCongrats;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tasks.AddProducts;
import tasks.Checkout;
import tasks.Login;

import static stepsdefinition.Hooks.tearDown;

public class PurchasingProducts {
    @Given("a user was able to purchase products")
    public void aUserWasAbleToPurchaseProducts() {
        Login.toPurchaseProducts();
    }

    @When("he checks out his purchasing cart")
    public void heChecksOutHisPurchasingCart() {
        AddProducts.toPurchasingCart();
        Checkout.process();
    }

    @Then("he must see CONGRATS")
    public void heMustSeeCONGRATS() {
        MustSeeCongrats.message();
        tearDown();
    }

    @Given("a user has products on his shopping cart")
    public void aUserHasProductsOnHisShoppingCart() {
    }

    @When("he doesn't want to purchase a product")
    public void heDoesnTWantToPurchaseAProduct() {

    }

    @Then("he must be able to delete it from purchasing cart")
    public void heMustBeAbleToDeleteItFromPurchasingCart() {
        tearDown();
    }
}