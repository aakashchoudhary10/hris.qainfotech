package com.qainfotech.hr;

import java.io.File;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HrisTimeSheet extends HrisActionClass{

	HrisTimeSheet(WebDriver driver, String tier) {
		super(driver,tier);
		// TODO Auto-generated constructor stub
	}

	static String ANCHOR_HRISMENU = "//a[@id='hamburger']";
	static String ANCHOR_TIMESHEET = "//a[@title='Time']";
	static String HEADING_TIMESHEET = "(//h1[contains(text(),'dynamic')]/..//b)[2]";
	
	public static void hrismenu() {
		WebElement menu_hris = element(ANCHOR_HRISMENU, "xpath");
		click(menu_hris);
	}

	public static void timesheet() {
		WebElement time_hris = element(ANCHOR_TIMESHEET, "xpath");
		click(time_hris);
	}

	public static void punchdetails() {
		String x = currentdate();
		try {
			WebElement punches_hris = element(HEADING_TIMESHEET.replace("dynamic", x), "xpath");
			String val = punches_hris.getAttribute("innerText");
			System.out.println(val);
		} catch (NoSuchElementException e) {
			System.out.println("Exception details:" + e);
			System.out.println("No Punches Found Till Now");

		}

		System.out.println("Rest of the code..");
	}

}
