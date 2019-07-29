package com.qa.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddPrepaidProgramStepDefinition {

	public WebDriver driver;

	@Given("^addpppgm user is already available on login page$")
	public void user_is_already_available_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://192.168.0.133:8080/divwebadmin/login.html");
		driver.manage().window().maximize();
	}

	@When("^addpppgm title of login page is Web admin$")
	public void title_loginpage_webadmin() {
		String title = driver.getTitle();
		System.out.println("Title is  : " + title);
		Assert.assertEquals("Web admin", title);
	}

	@Then("^addpppgm user enter \"(.*)\" and \"(.*)\"$")
	public void user_enter_username_and_password(String username, String pwd) {
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-primary btn-block']")));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);

	}

	@Then("^addpppgm user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
	}

	@Then("^addpppgm user is on Home page$")
	public void user_is_on_Home_page() {
		String title = driver.getTitle();
		System.out.println("Title is  : " + title);
		Assert.assertEquals("Web admin", title);
	}

	@Then("^addpppgm click on the Wallet Prepaid Program$")
	public void addpppgm_click_on_the_Wallet_Prepaid_Program() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[@href='/divwebadmin/prepaid.html']")).click();
	}

	@Then("^addpppgm click on the Add Prepaid program leftmenu$")
	public void addpppgm_click_on_the_Add_Prepaid_program_leftmenu() {
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("jQuery('.nav-bracket li.nav-parent ul').css({display: 'block'})");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[contains(text(),'Add Prepaid Program')]")).click();
	}

	@Then("^addpppgm enter the details\"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void addpppgm_enter_the_details(String ppname, String ppcode, String axpjcode, String axdjcode,
			String axtrcode, String accprefix) {
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='accountPrefix']")));
		driver.findElement(By.xpath("//input[@id='programName']")).sendKeys(ppname);
		driver.findElement(By.xpath("//input[@id='programCode']")).sendKeys(ppcode);
		driver.findElement(By.xpath("//input[@id='settlementCycleParam']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@id='allowManualEntryFlag2']")).click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.xpath("//input[@id='axProjectCode']")).sendKeys(axpjcode);
		driver.findElement(By.xpath("//input[@id='axDivisionCode']")).sendKeys(axdjcode);
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.xpath("//input[@id='axTransIdPrefix']")).sendKeys(axtrcode);
		driver.findElement(By.xpath("//input[@id='maxBalanceScr']")).sendKeys("800");
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.xpath("//input[@id='accountPrefix']")).sendKeys(accprefix);
	}

	@Then("^addpppgm clic ok button$")
	public void addpppgm_clic_ok_button() {
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		driver.quit();
	}

}
