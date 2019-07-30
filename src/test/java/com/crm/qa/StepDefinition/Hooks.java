package com.crm.qa.StepDefinition;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crm.qa.base.TestBase;
import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends TestBase{
	
	//TestBase testContext;
	

	@Before
	public void beforeScenario(Scenario scenario) {
	    Reporter.assignAuthor("Deka");
	}
	
	@After(order = 1)
	public void afterScenario(Scenario scenario) throws IOException {
		
		String screenshotName = scenario.getName().replaceAll(" ", "_");
		if (scenario.isFailed()) {
			
			
			try {
				//This takes a screenshot from the driver at save it to the specified location
				File sourcePath = ((TakesScreenshot) TestBase.driver).getScreenshotAs(OutputType.FILE);
				
				//Building up the destination path for the screenshot to save
				//Also make sure to create a folder 'screenshots' with in the cucumber-report folder
				File destinationPath = new File(System.getProperty("user.dir") + "\\target\\cucumber-reports\\screenshots\\" + screenshotName + ".png");
				
				//Copy taken screenshot from source location to destination location
				Files.copy(sourcePath, destinationPath);   

				//This attach the specified screenshot to the test
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
			} catch (IOException e) {
			} 
		}
		else if(!scenario.isFailed()) {
			
			File sourcePath = ((TakesScreenshot) TestBase.driver).getScreenshotAs(OutputType.FILE);
			
			//Building up the destination path for the screenshot to save
			//Also make sure to create a folder 'screenshots' with in the cucumber-report folder
			File destinationPath = new File(System.getProperty("user.dir") + "\\target\\cucumber-reports\\screenshots\\" + screenshotName + ".png");
			
			//Copy taken screenshot from source location to destination location
			Files.copy(sourcePath, destinationPath);   

			//This attach the specified screenshot to the test
			Reporter.addScreenCaptureFromPath(destinationPath.toString());

		}
	}
	
	

}