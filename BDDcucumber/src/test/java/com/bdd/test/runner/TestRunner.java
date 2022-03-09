package com.bdd.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./res/features", glue = "com.bdd.test.steps", monochrome = true, plugin = {
		"json:target/cucumber-jvm-report/cucumber.json" })
public class TestRunner {

}
