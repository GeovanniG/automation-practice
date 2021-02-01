package com.automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.automation.common.driver.DriverBuilder;
import com.automation.pageObjects.base.BasePage;
import com.automation.pageObjects.components.Nav;

public class HomePage extends BasePage {
	private Nav nav;
	
	public HomePage(WebDriver driver) {
		super(driver);
		super.setPageLocationAsBaseURL();
		this.nav = new Nav(driver);	
	}
	
	public void clickOnHomePageBanner() {
		this.nav.clickNavImgLink();
	}
	
	public String getHomePageURL() {
		return super.getPageURL();
	}
	
	public static void main(String[] args) {
		WebDriver driver = DriverBuilder.newDriver().useBaseBrowser().build();
		HomePage hp = new HomePage(driver);
		hp.clickOnHomePageBanner();
	}
}
