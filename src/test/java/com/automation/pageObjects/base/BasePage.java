package com.automation.pageObjects.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.automation.common.driver.DriverBuilder;
import com.automation.utilities.Config;

public class BasePage {
	private WebDriver driver;
	private Config configs = new Config();
	private String baseURL = configs.getSite();
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void setPageLocationFromBaseURL(String slug) {
		this.appendToBaseURL(slug);
	}
	
	public void setPageLocationAsBaseURL() {
		this.driver.get(baseURL);
	}
	
	private void appendToBaseURL(String slug) {
		String newURL = baseURL + slug;
		this.driver.get(newURL);
	}
	
	public String getPageURL() {
		return this.driver.getCurrentUrl();
	}
	
//	public void applyHeadless();
	
	public static void main(String args[]) {
	}
}
