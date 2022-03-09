package com.bdd.test.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bdd.test.Setup;

public class Registration {

	public WebDriver driver;

	public Registration(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath =  "//input[@id = 'firstName']")
	WebElement firstName ;
	
	@FindBy(id = "middleName")
	WebElement middelName;
	
	@FindBy(name = "txtLName")
	WebElement lastName;
	
	public void verifyRegistrationPageLanding() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Register a profile with Western Union IN");

		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.westernunion.com/in/en/web/user/register");

		WebElement ele = driver.findElement(By.xpath("//img[@alt = 'logo']"));
		Assert.assertTrue(ele.isDisplayed());
	}
	
	public void enterFirstName(String fName) {
		firstName.sendKeys(fName);
	}
	
	public void enterMiddleName(String mName) {
		middelName.sendKeys(mName);
	}
	
	public void enterLastName(String lName) {
		lastName.sendKeys(lName);
	}

}
