package com.automation.pageObjects.components;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.automation.common.driver.DriverBuilder;
import com.automation.pageObjects.base.BasePage;

public class Header extends BasePage {
	private WebDriver driver;
	
	public Header(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(css = "#header_logo")
	private WebElement headerLogo;
	
	@FindBy(css = "#search_query_top")
	private WebElement navSearchBarField;
	
	@FindBy(css = "[name=submit_search]")
	private WebElement searchIcon;
	
	@FindBy(css = ".menu-content > li")
	private List<WebElement> headerLinks;
	
	public void clickHeaderLogo() {
		headerLogo.click();	
	}
	
	public void inputTextIntoSearchField(String input) {
		navSearchBarField.sendKeys(input);
	}
	
	public void clickSearchIcon() {
		searchIcon.click();
	}
	
	public void clickHeaderLink(int index) {
		headerLinks.get(index).click();
	}
	
	public void hoverOverHeaderLink(int index) {
		Actions action = new Actions(this.driver);
		action.moveToElement(headerLinks.get(index)).build().perform();
	}
	
	public static void main(String[] args) {
		WebDriver driver = DriverBuilder.newDriver().useBaseBrowser().build();
		Header header = new Header(driver);
		header.setPageLocationAsBaseURL();
//		Actions actions = new Actions(driver);
//		for (WebElement link: header.headerLinks) {
//			actions.keyDown(Keys.CONTROL).click(link).build().perform();
//		}
		
		header.hoverOverHeaderLink(0);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {}
		
		driver.quit();
	}
}
