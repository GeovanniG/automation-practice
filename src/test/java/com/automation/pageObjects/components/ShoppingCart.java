package com.automation.pageObjects.components;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.automation.common.driver.DriverBuilder;
import com.automation.common.driver.DriverProvider;
import com.automation.pageObjects.base.BasePage;

public class ShoppingCart extends BasePage {
	private WebDriver driver;
	
	public ShoppingCart(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(css = ".shopping_cart > a")
	private WebElement shoppingCart;
	
	@FindBy(css = "#button_order_cart")
	private WebElement shoppingCartCheckoutButton;
	
	@FindBy(css = ".products .remove_link")
	private List<WebElement> removeIconOnProducts;
	
	public void clickShoppingCart() {
		shoppingCart.click();
	}
	
	public void hoverOverShoppingCart() {
		Actions action = new Actions(this.driver);
		action.moveToElement(shoppingCart).build().perform();
	}
	
	public void clickShoppingCartCheckoutButton() {
		shoppingCartCheckoutButton.click();
	}
	
	public static void main(String[] args) {
		WebDriver driver = DriverProvider.createDriver();
		ShoppingCart shoppingCart = new ShoppingCart(driver);
		shoppingCart.setPageLocationAsBaseURL();
		//	Actions actions = new Actions(driver);
		//	for (WebElement link: header.headerLinks) {
		//		actions.keyDown(Keys.CONTROL).click(link).build().perform();
		//	}

		shoppingCart.hoverOverShoppingCart();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {}

		driver.quit();
	}
}
