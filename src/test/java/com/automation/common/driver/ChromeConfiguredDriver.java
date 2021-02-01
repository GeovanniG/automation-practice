package com.automation.common.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.utilities.Config;

public class ChromeConfiguredDriver implements Driver {
	private Config configs = new Config();
	private WebDriver driverType;
	
	public ChromeConfiguredDriver() {
		String chromeDriverLoc = this.configs.getChromeDriverLoc();
		System.setProperty("webdriver.chrome.driver", chromeDriverLoc);
		this.driverType = new ChromeDriver();
	}
	
	public WebDriver createDriver() {
		// TODO Auto-generated method stub
		return null;
	}
}
