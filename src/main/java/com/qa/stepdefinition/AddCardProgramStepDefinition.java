package com.qa.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddCardProgramStepDefinition {

	public WebDriver driver;

	@Given("^addCrdpgm user is already available on login page$")
	public void user_is_already_available_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://192.168.0.133:8080/divwebadmin/login.html");
		driver.manage().window().maximize();
	}

	@When("^addCrdpgm title of login page is Web admin$")
	public void title_loginpage_webadmin() {
		String title = driver.getTitle();
		System.out.println("Title is  : " + title);
		Assert.assertEquals("Web admin", title);
	}

	@Then("^addCrdpgm user enters username and password$")
	public void user_enter_username_and_password(DataTable credentials) {
		List<List<String>> data = credentials.raw();
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-primary btn-block']")));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(data.get(0).get(0));
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(data.get(0).get(1));
	}

	@Then("^addCrdpgm user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
	}

	@Then("^addCrdpgm user is on Home page$")
	public void user_is_on_Home_page() {
		String title = driver.getTitle();
		System.out.println("Title is  : " + title);
		Assert.assertEquals("Web admin", title);
	}

	@Then("^addCrdpgm click on the Card Program$")
	public void addCrdpgm_click_on_the_Wallet_Prepaid_Program() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[@href='/divwebadmin/card.html']")).click();
	}

	@Then("^addCrdpgm click on the Add Card program leftmenu$")
	public void addCrdpgm_click_on_the_Add_Prepaid_program_leftmenu() {
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("jQuery('.nav-bracket li.nav-parent ul').css({display: 'block'})");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[contains(text(),'Add Card Program')]")).click();
	}

	@Then("^addCrdpgm enter the details bin and name and code and ppgm$")
	public void addCrdpgm_enter_the_details(DataTable cardDate) {
		List<List<String>> cardData = cardDate.raw();
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='bin']")));
		driver.findElement(By.xpath("//input[@id='bin']")).sendKeys(cardData.get(0).get(0));
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(cardData.get(0).get(1));
		driver.findElement(By.xpath("//input[@id='code']")).sendKeys(cardData.get(0).get(2));
		WebElement element = driver.findElement(By.xpath("//select[@id='prepaidProgramId']"));
		Select oSelect = new Select(element);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		oSelect.selectByVisibleText(cardData.get(0).get(3));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^addCrdpgm click ok button$")
	public void addCrdpgm_clic_ok_button() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,550)");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}
