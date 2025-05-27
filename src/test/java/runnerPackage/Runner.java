package runnerPackage;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// Tells JUnit to run Cucumber tests
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Users\\Ramanjaneyulu\\eclipse-workspace\\SeleniumAndCucumber\\src\\test\\resources\\LoginFuture.feature",
    glue = "stepDefinationFiles",
    plugin = { "pretty", "html:target/cucumber-report.html" }                              
)
public class Runner {
}
