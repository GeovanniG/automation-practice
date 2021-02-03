package com.automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.common.driver.DriverBuilder;
import com.automation.common.driver.DriverProvider;
import com.automation.pageObjects.base.BasePage;
import com.automation.pageObjects.components.Nav;

public class HomePage extends BasePage {
	private Nav nav;
	
	public HomePage(WebDriver driver) {
		super(driver);
		super.setPageLocationAsBaseURL();
		this.nav = new Nav(driver);	
	}
	
	@FindBy(css = ".homefeatured")
	private WebElement popularSortingTab;
	
	
	@FindBy(css = ".blockbestsellers")
	private WebElement bestSellersSortingTab;
	
	@FindBy(css = ".homefeatured li")
	private List<WebElement> popularProducts;
	
	
	public Nav getNav() {
		return this.nav;
	}
	
	public String getHomePageURL() {
		return super.getPageURL();
	}
	
	public void clickPopularSortingTab() {
		popularSortingTab.click();
	}
	
	public void clickBestSellersSortingTab() {
		bestSellersSortingTab.click();
	}
	
	public static void main(String[] args) {
		WebDriver driver = DriverProvider.createDriver();
		HomePage hp = new HomePage(driver);
		hp.clickBestSellersSortingTab();
		hp.clickPopularSortingTab();
	}
}
