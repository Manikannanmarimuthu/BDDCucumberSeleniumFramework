package com.qa.stepdefinition;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class CreateCardManufacturerStepDefinition {

	public WebDriver driver;

	@Given("^addCrdMfr user is already available on login page$")
	public void user_is_already_available_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://192.168.0.133:8080/divwebadmin/login.html");
		driver.manage().window().maximize();
	}

	@When("^addCrdMfr title of login page is Web admin$")
	public void title_loginpage_webadmin() {
		String title = driver.getTitle();
		System.out.println("Title is  : " + title);
		Assert.assertEquals("Web admin", title);
	}

	@Then("^addCrdMfr user enters username and password$")
	public void user_enter_username_and_password(DataTable credentials) {
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			WebDriverWait wait = new WebDriverWait(driver, 1000);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-primary btn-block']")));
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(data.get("username"));
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(data.get("password"));
		}
	}

	@Then("^addCrdMfr user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
	}

	@Then("^addCrdMfr user is on Home page$")
	public void user_is_on_Home_page() {
		String title = driver.getTitle();
		System.out.println("Title is  : " + title);
		Assert.assertEquals("Web admin", title);
	}

	@Then("^addCrdMfr click on the Card Program$")
	public void addCrdpgm_click_on_the_Wallet_Prepaid_Program() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[@href='/divwebadmin/card.html']")).click();
	}

	@Then("^addCrdMfr enter the details name and mailID and contactNo and publicKey then click Ok button and repeat$")
	public void addCrdpgm_enter_the_details(DataTable cardData) {
		for (Map<String, String> data : cardData.asMaps(String.class, String.class)) {
			JavascriptExecutor jse1 = ((JavascriptExecutor) driver);
			jse1.executeScript("jQuery('.nav-bracket li.nav-parent ul').css({display: 'block'})");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//a[contains(text(),'Create Card Manufacturer')]")).click();
			WebDriverWait wait = new WebDriverWait(driver, 1000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys(data.get("name"));
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(data.get("emailAddress"));
			driver.findElement(By.xpath("//input[@id='contactNo']")).sendKeys(data.get("ContactNo"));
			driver.findElement(By.xpath("//textarea[@id='pgpPublicKey']")).sendKeys(data.get("pgpKey"));
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,650)");
			driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		}
	}

	@Then("^close the browser$")
	public void addCrdpgm_clic_ok_button() {
		driver.quit();
	}
}
