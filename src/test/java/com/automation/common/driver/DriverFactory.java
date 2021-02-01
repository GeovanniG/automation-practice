package com.automation.common.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
//	public enum Browser {
//		CHROME,
//		FIREFOX,
////		EDGE
//	}
//	
//	private DriverFactory() {}
//	
//	public static DriverStep selectBrowser(Browser browser) {
//		return new BrowserFactory(browser);
//	}
//	
//	public interface DriverStep {
//		public WebDriver createDriver();
//	}
//	
//	private static class BrowserFactory implements DriverStep {
//		private Browser browser = null;
//		
//		public BrowserFactory(Browser browser) {
//			this.browser = browser;
//		}
//		
//		private void getBrowser(Browser browser) {
//			String chromeDriverLoc = "/ChromeDriver/chromedriver";
//			String firefoxDriverLoc = "/FirefoxDriver/geckodriver";
//			StringBuilder driverPath = new StringBuilder(System.getProperty("user.dir") + "/src" + "/test" + "/resources");
//			
//			switch (browser) {
//				case FIREFOX:
//					driverPath = driverPath.append(firefoxDriverLoc);
//					System.setProperty("webdriver.gecko.driver", driverPath.toString());
//					 this.driver = new FirefoxDriver();
//					break;
//				case CHROME:
//				default:
//					driverPath = driverPath.append(chromeDriverLoc);
//					System.setProperty("webdriver.chrome.driver", driverPath.toString());
//					this.driver = new ChromeDriver();
//					break;
//			}
//		}
//		
//	}
//		
//	
//	
//	public static void main(String[] args) {
//		for(Browser browser: Browser.values()) {
//			DriverFactory driverFactory = new DriverFactory(browser);
//			WebDriver driver = driverFactory.createDriver();
//			driver.get("https://www.google.com/");
//			driver.quit();
//		}
//	}
}
