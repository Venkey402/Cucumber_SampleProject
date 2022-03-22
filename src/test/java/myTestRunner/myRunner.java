package myTestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/Features",
        glue = {"stepDefinitions","myHooks"},
        tags= "@manual or @regression",
        publish = true,
        plugin = "pretty"
)
public class myRunner {
}
