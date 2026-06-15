package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = "stepdefinitions",
    plugin = {
        "pretty",
        "json:target/cucumber.json",
        "html:target/cucumber-report.html"
    }
)
public class TestRunner extends AbstractTestNGCucumberTests {
}