package com.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Naveen Assignments\\BDDFramework\\src\\main\\java\\com\\qa\\feature\\login.feature", glue = {
		"com.qa.stepdefinition.login.feature" }, format = { "pretty", "html:test-output", "json:json-output/cucumber.json",
				"junit:junit-output/Cucumber.xml" }, monochrome = true, strict = true, dryRun = false)

// Feature used to mention the feature  file location. 
//glue used to mention the Step Definition file location.
// format is used to generate the different type of output in the format of HTML, JSON and XML
//monochrome used to generate pretty output in console. 
//It will check if any features is missed out means will run remaining feature and log displays the To DO implement. 
//will check if any feature missed out without run will tell some feature will displays some step definition not available. 

//Naveen Explantion
//features = the path of the feature files
//glue=the path of the step definition files
//format= to generate different types of reporting
//monochrome = display the console output in a proper readable format
//strict = it will check if any step is not defined in step definition file
//dryRun = to check the mapping is proper between feature file and step def file

public class LoginTestRunner {
}
