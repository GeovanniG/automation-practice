package com.automation.common.baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.automation.common.driver.DriverBuilder;

public class BaseTest {
	private WebDriver driver;
	
	public BaseTest() {
		this.driver = DriverBuilder.newDriver()
								   .useBaseBrowser()
								   .build();
	}
	
//	public BaseTest(String slug) {
//		this.driver = DriverBuilder.newDriver()
//								   .useBaseBrowser()
//								   .getBaseURLwithSlug(slug)
//								   .build();
//	}
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
	public void endSession() {
		this.driver.quit();
	}
}
