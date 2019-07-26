package com.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Naveen Assignments\\BDDFramework\\src\\main\\java\\com\\qa\\feature\\login.feature", 
glue = {"com.qa.stepdefinition" },format= {"pretty","html:test-output"})
public class TestRunner {

}
