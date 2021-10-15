package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/UsingWebview.feature",
        glue = {"stepsdefinition"},
        plugin = {"rerun:target/rerunFailed/UsingWebviewRerun.txt",
                "io.testproject.sdk.internal.reporting.extensions.cucumber.CucumberReporter"},
        snippets = CAMELCASE)
public class UsingWebviewRunner {
}
