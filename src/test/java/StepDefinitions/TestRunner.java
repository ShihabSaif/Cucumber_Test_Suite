package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue ={"StepDefinitions"},
        plugin = {"pretty","html:target/HtmlReports/report.html"})
public class TestRunner {
}
