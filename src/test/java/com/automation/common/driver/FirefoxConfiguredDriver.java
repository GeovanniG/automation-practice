package com.automation.common.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.automation.utilities.Config;

public class FirefoxConfiguredDriver implements ConfiguredDriver {
	private Config configs = new Config();
	private WebDriver driverType;
	
	public FirefoxConfiguredDriver() {
		String firefoxDriverLoc = this.configs.getFirefoxDriverLoc();
		System.setProperty("webdriver.firefox.driver", firefoxDriverLoc);
		this.driverType = new FirefoxDriver();
	}

	public WebDriver getDriver() {
		return this.driverType;
	}

}
