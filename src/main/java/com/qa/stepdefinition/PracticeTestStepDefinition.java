package com.qa.stepdefinition;

import cucumber.api.java.en.Given;

public class PracticeTestStepDefinition {

	@Given("^enter Username and Password click Singin button$")
	public void enter_Username_and_Password_click_Singin_button() {
		System.out.println("enter_Username_and_Password_click_Singin_button");
	}

	@Given("^clicks on the Home Page$")
	public void clicks_on_the_Home_Page() {
		System.out.println("clicks_on_the_Home_Page");
	}

	@Given("^clicks on the Add Prepaid Program Page$")
	public void clicks_on_the_Add_Prepaid_Program_Page() {
		System.out.println("clicks_on_the_Add_Prepaid_Program_Page");
	}

	@Given("^clicks on the Add Card Program Page$")
	public void clicks_on_the_Add_Card_Program_Page() {
		System.out.println("clicks_on_the_Add_Card_Program_Page");
	}

	@Given("^clicks on the Add Cash Program Page$")
	public void clicks_on_the_Add_Cash_Program_Page() {
		System.out.println("clicks on the Add Cash Program Page");
	}

}
