package com.bdd.test.steps;

import org.openqa.selenium.WebDriver;

import com.bdd.test.Setup;
import com.bdd.test.pages.HomePage;
import com.bdd.test.pages.Registration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HiveLoginSteps {

	WebDriver driver = Setup.getDriver();

	HomePage homePage = new HomePage(driver);
	Registration regPage = new Registration(driver);

	@Given("user launches the application")
	public void user_launches_the_application() {
		driver.manage().window().maximize();
		driver.get("https://www.westernunion.com/in/en/home.html");
	}

	@When("user click on register tab in the home page")
	public void user_click_on_register_tab_in_the_home_page() {
		homePage.clickRegistrationButton();
	}

	@Then("verify that user landed on registration page")
	public void verify_that_user_landed_on_registration_page() {
		regPage.verifyRegistrationPageLanding();
	}

	@Then("^user enter the first name as (.*) in the first name field$")
	public void user_enter_the_first_name_in_the_first_name_field(String firstNameValue) {
		regPage.enterFirstName(firstNameValue);
	}

	@Then("^user enter the middle name as (.*) in the middle name field$")
	public void user_enter_the_middle_name_in_the_middle_name_field(String middleNameValue) {
		regPage.enterMiddleName(middleNameValue);
	}

	@Then("^user enter the last name as (.*) in the last name field$")
	public void user_enter_the_last_name_in_the_last_name_field(String lastNameValue) {
		regPage.enterLastName(lastNameValue);
	}

}
