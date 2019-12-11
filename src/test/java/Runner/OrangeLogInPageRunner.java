package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumberHTML-report", "pretty", "json:target/cucumber.json"},
        features = "src/test/Resources/UIFeatures/OrangeHRM.feature",
        glue = "StepDefs",
        dryRun = false,
        tags = "@ORTEST-LDays"

)
public class OrangeLogInPageRunner {


}
