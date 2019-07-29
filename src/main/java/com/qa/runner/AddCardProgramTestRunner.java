package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Naveen Assignments\\BDDFramework\\src\\main\\java\\com\\qa\\feature\\AddCardProgram.feature",
glue = {"com.qa.stepdefinition" }, 
format = { "pretty", "html:test-output","json:json-output/cucumber.json","junit:junit-output/Cucumber.xml" },
monochrome = true, 
strict = true, 
dryRun = false)

public class AddCardProgramTestRunner {

}
