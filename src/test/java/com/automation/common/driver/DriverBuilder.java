package com.automation.common.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.automation.utilities.Config;

public class DriverBuilder {
	private DriverBuilder() {}
	
	public static BrowserStep newDriver() {
		return new Steps();
	}
	
	public static interface BrowserStep {
		public BuildStep useChromeBrowser();
		public BuildStep useFirefoxBrowser();
		public BuildStep useBaseBrowser();
	}
	
	public static interface URLStep extends BuildStep {
		public BuildStep getURL(String url);
		public BuildStep getBaseURL();
		public BuildStep getBaseURLwithSlug(String url);
	}
	
	public static interface BuildStep {
		public WebDriver build();
	}
	
	private static class Steps implements BrowserStep, BuildStep {
		private Config configs = new Config();
//		private String url;
		private WebDriver driverType;
		
		
		public BuildStep useChromeBrowser() {
			String chromeDriverLoc = this.configs.getChromeDriverLoc();
			System.setProperty("webdriver.chrome.driver", chromeDriverLoc);
			this.driverType = new ChromeDriver();
			return this;
		}
		
		public BuildStep useFirefoxBrowser() {
			String firefoxDriverLoc = this.configs.getFirefoxDriverLoc();
			System.setProperty("webdriver.firefox.driver", firefoxDriverLoc);
			this.driverType = new FirefoxDriver();
			return this;
		}
		
		public BuildStep useBaseBrowser() {
			String baseBrowser = this.configs.getBrowser();
			if (baseBrowser.equalsIgnoreCase("chrome")) return useChromeBrowser();
			else if (baseBrowser.equalsIgnoreCase("firefox")) return useFirefoxBrowser();
			// output to logs a message, i.e. using chrome as default
			return useChromeBrowser();
		}
		
//		public BuildStep getURL(String url) {
//			this.url = url;
//			return this;
//		}
//		
//		public BuildStep getBaseURL() {
//			String baseURL = configs.getSite();
//			this.url = baseURL;
//			return this;
//		}
//		
//		public BuildStep getBaseURLwithSlug(String slug) {
//			String url = configs.getSite() + slug;
//			this.url = url;
//			return this;
//		}
		
		public WebDriver build() {
			WebDriver driver = this.driverType;
//			driver.get(this.url);
			return driver;
		}
	}
}
