package com.bdd.test.pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bdd.test.Setup;

public class HomePage {

	public WebDriver driver;
	JavascriptExecutor jse = (JavascriptExecutor)driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text() = 'Register']")
	WebElement ele;

	public void clickRegistrationButton() {
		Assert.assertTrue(ele.isDisplayed());
		Assert.assertTrue(ele.isEnabled());
		ele.click();
		
		Setup.markTestStatus("passed", "Registration link Clicked Successfully", driver);
	}

}
