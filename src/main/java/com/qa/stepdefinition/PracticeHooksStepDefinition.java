package com.qa.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PracticeHooksStepDefinition {

	@Before
	public void launchBrowser() {
		System.out.println("Browser Launched Successfully");

	}

	@Given("^User should be available in HomePage$")
	public void user_should_be_available_in_HomePage() {
		System.out.println("1");
	}

	@When("^Links should be loaded$")
	public void links_should_be_loaded() {
		System.out.println("2");
	}

	@Then("^Click on the Wallet Link$")
	public void click_on_the_Wallet_Link() {
		System.out.println("3");
	}

	@Given("^User should be available in HomePage1$")
	public void user_should_be_available_in_HomePage1() {
		System.out.println("11");
	}

	@When("^Links should be loaded1$")
	public void links_should_be_loaded1() {
		System.out.println("12");
	}

	@Then("^Click on the Wallet Link1$")
	public void click_on_the_Wallet_Link1() {
		System.out.println("13");
	}

	@Given("^User should be available in HomePage2$")
	public void user_should_be_available_in_HomePage2() {
		System.out.println("21");
	}

	@Before("@Second")
	@When("^Links should be loaded2$")
	public void links_should_be_loaded2() {
		System.out.println("22");
	}

	@Before("@First")
	@Then("^Click on the Wallet Link2$")
	public void click_on_the_Wallet_Link2() {
		System.out.println("23");
	}

	@After
	public void tearDown() {
		System.out.println("Browser Closed");

	}

}
