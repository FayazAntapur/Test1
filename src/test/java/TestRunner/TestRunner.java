package TestRunner;


import java.io.File;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
/**
 * Created by Dhruba Deka  on 26/07/2019.
 */

//@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src\\test\\java\\com\\crm\\qa\\feature\\Login.feature",
        glue = "com.crm.qa.StepDefinition",
       // format= {"pretty","html:test-output","Json:json_outputcucumber.json","junit:junit_xml/cucumber.xml"},
        		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		dryRun = false,
		monochrome = true,
		strict = false,
		tags= {"@SmokeTest"}
				 )

public class TestRunner extends AbstractTestNGCucumberTests {
	
	
	
	
	@AfterClass
	public static void after() {
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\crm\\qa\\config\\extent-config.xml"));
		Reporter.assignAuthor("Deka");
		Reporter.setSystemInfo("Username", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Selenium version", "3.14");
		
	
	}

}
