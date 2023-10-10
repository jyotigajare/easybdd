package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
dryRun = false,
features= {"Allfeaturefile7"},glue= {"stepdefination"},plugin= {"html:target/report1/jyotigajare.html"}


)
		
public class RunnerTest {
	

}
