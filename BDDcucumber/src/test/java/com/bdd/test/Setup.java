package com.bdd.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Setup {

	public static WebDriver driver;
	
	public static final String USERNAME = "testingbatch_V9yidD";
	public static final String AUTOMATE_KEY = "wSsq2o4sMrg4AERyAkQs";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	public static WebDriver getDriver() {
		if (driver == null) {
			if (AppConstants.runMode.equalsIgnoreCase("Local")) {
				if (AppConstants.browserValue.equalsIgnoreCase("Chrome")) {
					System.setProperty("webdriver.chrome.driver", "./res/drivers/chromedriver.exe");
					driver = new ChromeDriver();

				} else if (AppConstants.browserValue.equalsIgnoreCase("Firefox")) {

					System.setProperty("webdriver.gecko.driver", "./res/drivers/geckodriver.exe");
					driver = new FirefoxDriver();

				} else if (AppConstants.browserValue.equalsIgnoreCase("Edge")) {

					System.setProperty("webdriver.edge.driver", "./res/drivers/msedgedriver.exe");
					driver = new EdgeDriver();
				}
			} else if (AppConstants.runMode.equalsIgnoreCase("Remote")) {

				try {
					DesiredCapabilities caps = new DesiredCapabilities();
					caps.setCapability("os_version", "10");
					caps.setCapability("resolution", "2048x1536");
					caps.setCapability("browser", "Chrome");
					caps.setCapability("browser_version", "96.0");
					caps.setCapability("os", "Windows");

					caps.setCapability("name", "WU Registration"); 
					caps.setCapability("build", "Build 001"); 
					caps.setCapability("browserstack.debug", "true");
//					caps.setCapability("browserstack.video", "false");
					driver = new RemoteWebDriver(new URL(URL), caps);
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
			}

		}
		return driver;
	}

}
