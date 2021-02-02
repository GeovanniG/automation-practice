package com.automation.common.baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.automation.common.driver.DriverBuilder;
import com.automation.common.driver.DriverProvider;

public class BaseTest {
	private WebDriver driver;
	
	public BaseTest() {
		this.driver = DriverProvider.createDriver();
	}
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
	public void endSession() {
		this.driver.quit();
	}
}
