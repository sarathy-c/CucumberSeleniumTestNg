package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",
        glue = "tests", plugin = {"pretty","html:target/cucumber-reports/cucumberreports.html"})
public class TestNGRunner extends AbstractTestNGCucumberTests {
}