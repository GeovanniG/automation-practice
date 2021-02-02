package com.automation.pageObjects.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.pageObjects.base.BasePage;

public class Nav extends BasePage {
	
	public Nav(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "#header .banner a")
	private WebElement navImgLink;
	
	@FindBy(css = ".shop-phone strong")
	private WebElement phoneNumber;
	
	@FindBy(css = "#contact-link a")
	private WebElement contactLink;
	
	@FindBy(css = ".header_user_info a")
	private WebElement signInLink;
	
	public void clickSignInLink() {
		signInLink.click();
	}
	
	public void clickContactLink() {
		contactLink.click();
	}
	
	public String getPhoneNumber() {
		return phoneNumber.getText();
	}
	
	public void clickNavImgLink() {
		navImgLink.click();
	}

	public static void main(String[] args) {

	}
}