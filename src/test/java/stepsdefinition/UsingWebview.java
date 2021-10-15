package stepsdefinition;

import assertions.UserMustBeAbleTo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tasks.Login;
import tasks.UseWebview;

import static stepsdefinition.Hooks.tearDown;

public class UsingWebview {
    @Given("user is able to use a webview")
    public void userIsAbleToUseAWebview() {
        Login.toPurchaseProducts();
    }

    @When("^he visits (.*)$")
    public void heVisitsWwwDevcoComCo(String url) {
        UseWebview.toVisit(url);
    }

    @Then("he must be able to interact with the web elements")
    public void heMustBeAbleToInteractWithTheWebElements() {
        UserMustBeAbleTo.InteractWithWebView();
        tearDown();
    }
}
