package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//features",
		glue={"stepDefinitions"},
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:target/HtmlReports.html"
				}
		)
public class TestRun {

}
