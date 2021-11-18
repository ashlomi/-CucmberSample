package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features/Login.feature",
glue = "stepDefination",
monochrome = true,
dryRun = true,
plugin = {"pretty","html:test-output"})
public class TestRun 
{
	
	

}
