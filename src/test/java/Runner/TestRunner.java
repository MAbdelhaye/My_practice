package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Featuers/MoAbdelhay.feature",
glue="StepDefinition",
monochrome=true,
dryRun=false,
tags="@SmokeTest"

)
public class TestRunner {
	

}
