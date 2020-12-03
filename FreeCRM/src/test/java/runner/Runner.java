package runner;

//import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
//import cucumber.api.junit.Cucumber;


//@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"features/process.feature"},
		glue={"stepdefinition"},
				
		monochrome=true,
	
		
		plugin = {"html:target/Destination"}
		

)

public class Runner extends AbstractTestNGCucumberTests   {

}
