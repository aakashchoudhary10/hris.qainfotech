package com.qainfotech.hr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSession {

	static HrisTimeSheet HTS;
	static HrisLogin HL;
	static {
		WebDriver driver = getDriver("chrome");
		HTS = new HrisTimeSheet(driver, "QA");
		HL = new HrisLogin(driver, "QA");

	}
	
	public static WebDriver getDriver(String browser) {
		switch (browser) {
		case "chrome":
			System.setProperty("ChromeDriver.driver",
					"C:\\Users\\aakashchoudhary\\MindTap-New_Workspace\\hr\\chromedriver.exe");
			return new ChromeDriver();
		case "firefox":
			return getDriver("firefox");
		}
		return new ChromeDriver();

	}

	
}
