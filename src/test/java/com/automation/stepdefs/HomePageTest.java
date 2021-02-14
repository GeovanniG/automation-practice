package com.automation.stepdefs;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.automation.common.baseTest.BaseTest;
import com.automation.pageObjects.HomePage;
import com.automation.pageObjects.components.Nav;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageTest extends BaseTest {
	private HomePage homepage;
	WebDriver driver;
	
	public HomePageTest() {
		this.driver = super.getDriver();
		this.homepage = new HomePage(driver);
	}

	@Given("I click homepage banner")
	public void i_click_homepage_banner() {
	    // Write code here that turns the phrase above into concrete actions
//		this.homepage.clickOnHomePageBanner();
	}

	@Then("I remain on homepage")
	public void i_remain_on_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("here in remains in homepage");
		assertEquals(homepage.getPageURL(), driver.getCurrentUrl());
	}

//	@Given("^I am on homepage\"$")
//	public boolean NavigateToHomePage() {
//		throw new io.cucumber.java.PendingException();
//	}
//	
//	@When("^I click homepage banner\"$")
//	public boolean clickHomePageBanner() {
//		throw new io.cucumber.java.PendingException();
//	}
//	
//	@Then("^I remain on homepage\"$")
//	public boolean onHomePage() {
//		throw new io.cucumber.java.PendingException();
//	}
}
