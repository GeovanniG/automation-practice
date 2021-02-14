package com.automation.common.driver;

import org.openqa.selenium.WebDriver;

import com.automation.utilities.Config;
import com.automation.utilities.Config.Browser;

public class DriverProvider {
	private static Config configs = new Config();
	
	private DriverProvider() {}
	
	
	public static WebDriver createDriver() {
		ConfiguredDriver configDriver;
		Browser browser = configs.getBrowser();
		
		switch (browser) {
		case FIREFOX:
			configDriver = new FirefoxConfiguredDriver();
			break;
		case CHROME:
		default:
			configDriver = new ChromeConfiguredDriver();
		}
		
		return configDriver.getDriver();
	}
		
	
	public static void main(String[] args) {
		WebDriver driver = DriverProvider.createDriver();
		driver.get("https://www.google.com/");
		driver.quit();
	}
}