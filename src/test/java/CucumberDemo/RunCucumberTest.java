package CucumberDemo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src\\test\\resources\\CucumberDemo"
		},
		tags = {"@tag1"},
		plugin = {"pretty","html:target/HtmlReport"},
		glue="stepdefinitions",
		monochrome=true
		)
public class RunCucumberTest {
}

