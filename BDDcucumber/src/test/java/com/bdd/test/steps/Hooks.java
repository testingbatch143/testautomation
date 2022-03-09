package com.bdd.test.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.bdd.test.Setup;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.AfterStep;

public class Hooks {

	@AfterStep
	public static void takeScreenShotAfterEveryStep(Scenario scenario) {
		byte[] screenshot = ((TakesScreenshot) Setup.getDriver()).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
	}
	
}
