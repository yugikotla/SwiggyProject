package in.swiggy.tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "Feature"
		,glue ="in.swiggy.tests"
		,tags = "@Regression"		
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
