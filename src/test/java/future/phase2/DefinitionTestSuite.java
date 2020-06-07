package future.phase2;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        junit = "--step-notifications",
        features="src/test/resources/features"
)
public class DefinitionTestSuite {}
