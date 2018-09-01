package com.qainfotech.hr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class HrisLogin extends HrisActionClass{

	HrisLogin(WebDriver driver,String tier) {
		super(driver,tier);
		// TODO Auto-generated constructor stub
	}

	static String INPUT_USERNAME = "//input[@id='txtUserName']";
	static String INPUT_PASSWORD = "//input[@id='txtPassword']";
	static String INPUT_SIGNIN = "//input[@value='Sign In']";

	public static void hrislaunch(String browser, String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void enterusername(String username) {

		WebElement username_hris = element(INPUT_USERNAME, "xpath");
		sendkeys(username_hris, username);
	}

	public static void enteruserpassword(String x) {
		WebElement password_hris = element(INPUT_PASSWORD, "xpath");
		sendkeys(password_hris, x);
	}

	public static void usersignin() {
		WebElement signin_hris = element(INPUT_SIGNIN, "xpath");
		click(signin_hris);
	}
}
