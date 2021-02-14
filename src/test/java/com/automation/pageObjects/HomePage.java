package com.automation.pageObjects;

import java.util.List;

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
	
	@FindBy(css = ".homefeatured li .product-image-container")
	private List<WebElement> popularProductsImages;
	
	@FindBy(css = ".homefeatured li .quick-view-mobile")
	private List<WebElement> popularProductsQuickView;
	
	@FindBy(css = ".homefeatured li .ajax_add_to_cart_button")
	private List<WebElement> popularProductsAddToCartButton;
	
	@FindBy(css = ".homefeatured li .lnk_view")
	private List<WebElement> popularProductsMoreButton;
	
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
	
	public void clickPopularProductImage(int index) {
		popularProductsImages.get(index).click();
	}
	
	public void clickPopularProductQuickView(int index) {
		popularProductsQuickView.get(index).click();
	}
	
	public void clickPopularProductCart(int index) {
		popularProductsMoreButton.get(index).click();
	}
	
	
	public static void main(String[] args) {
		WebDriver driver = DriverProvider.createDriver();
		HomePage hp = new HomePage(driver);
		hp.clickPopularProductQuickView(4);;
	}
}
