package com.automation.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
	private final String PROPS_PATH = System.getProperty("user.dir")+"/src/test/resources/config/config.properties";
	private Properties props = null;
	
	public Config() {
		this.props = new Properties();
		try {
			props.load(new FileInputStream(PROPS_PATH));
		} catch (IOException e) {
			System.out.println("Unable to open file");
		}
	}
	
	public String getSite() {
		String url = this.props.getProperty("site");
		return url;
	}
	
	public String getChromeDriverLoc() {
		String driverLoc = this.props.getProperty("chromedriver");
		return driverLoc;
	}
	
	public String getFirefoxDriverLoc() {
		String driverLoc = this.props.getProperty("firefoxdriver");
		return driverLoc;
	}
	
	public String getBrowser() {
		String browser = this.props.getProperty("browser");
		return browser;
	}
	
	public static void main(String[] args) {
		System.out.println(new Config().getSite());
		System.out.println(new Config().getChromeDriverLoc());
		System.out.println(new Config().getFirefoxDriverLoc());
	}

}
