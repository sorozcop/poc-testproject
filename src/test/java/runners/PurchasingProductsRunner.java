package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/PurchasingProducts.feature",
        glue = {"stepsdefinition"},
        plugin = {"rerun:target/rerunFailed/AutenticacionRerun.txt",
                "io.testproject.sdk.internal.reporting.extensions.cucumber.CucumberReporter"},
        snippets = CAMELCASE)
public class PurchasingProductsRunner {
}
