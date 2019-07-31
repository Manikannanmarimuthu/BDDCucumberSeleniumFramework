package com.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Naveen Assignments\\BDDFramework\\src\\main\\java\\com\\qa\\feature\\Practicetags.feature", glue = {
		"com.qa.stepdefinition" }, format = { "pretty", "html:test-output", "json:json-output/cucumber.json",
				"junit:junit-output/Cucumber.xml" }, monochrome = true, strict = true, dryRun = true, 
				tags = {"~@SanityTest", "~@SmokeTest" })

//XORed =  tags = {"@SanityTest,@SmokeTest"} - execute tests tagged on SanityTest OR SmokeTest
//ANDed =  tags = {"@SanityTest","@SmokeTest"} - execute tests tagged on SanityTest AND SmokeTest
//not run =  tags = {"~@SanityTest"} - not run particular set of test cases

/*
 * What are Cucumber Tags?
 * 
 * Learn: How to run Cucumber Tests in Groups with Cucumber Tags How to ignore
 * Cucumber Tests Logically ANDing and ORing Tags
 * 
 * Cucumber has already provided a way to organize your scenario execution by
 * using tags in feature file. We can define each scenario with a useful tag.
 * Later, in the runner file, we can decide which specific tag (and so as the
 * scenario(s)) we want Cucumber to execute.
 * 
 * Tag starts with “@”. After “@” you can have any relevant text to define your
 * tag like @SmokeTests just above the scenarios you like to mark. Then to
 * target these tagged scenarios just specify the tags names in the
 * CucumberOptions as tags = {“@SmokeTests”}.
 * 
 * Tagging not just specifically works with Scenarios, it also works with
 * Features. Means you can also tag your features files. Any tag that exists on
 * a Feature will be inherited by Scenario, Scenario Outline or Examples.
 */

public class PracticeTagsTestRunner {
}
