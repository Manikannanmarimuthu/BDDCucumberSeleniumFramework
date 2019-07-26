package com.qa.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {

	public WebDriver driver;

	@Given("^user is already available on login page$")
	public void user_already_on_loginpage() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://192.168.0.133:8080/divwebadmin/login.html");
		driver.manage().window().maximize();
	}

	@When("^title of login page is Web admin$")
	public void title_loginpage_webadmin() {
		String title = driver.getTitle();
		System.out.println("Title is  : " + title);
		Assert.assertEquals("Web admin", title);
	}

	@Then("^user enter username and password$")
	public void user_enter_username_and_password() {
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-primary btn-block']")));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("password");
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() {
		String title = driver.getTitle();
		System.out.println("Title is  : " + title);
		Assert.assertEquals("Web admin", title);
		driver.quit();
	}

}
