package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles",glue="stepDefinitions",plugin={"com.cucumber.listener.ExtentCucumberFormatter:Reports/myreport.html"},tags= {"@test2"})
public class LoginTestRunner {
	
	

}
