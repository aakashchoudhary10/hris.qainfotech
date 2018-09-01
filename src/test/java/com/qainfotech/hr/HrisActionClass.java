package com.qainfotech.hr;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HrisActionClass {

	static WebDriver driver;
	static String tier;

	HrisActionClass(WebDriver driver,String tier){
		this.driver = driver;
		this.tier = tier;
	}
	public static String currentdate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		String x = dtf.format(now);
		return x;
	}

	public static WebElement element(String locator, String locatortype) {
		By ele;
		switch (locatortype) {
		case "xpath":
			ele = By.xpath(locator);
			break;
		case "css":
			ele = By.cssSelector(locator);
			break;
		case "id":
			ele = By.id(locator);
			break;
		case "class":
			ele = By.className(locator);
			break;
		}

		return driver.findElement(By.xpath(locator));
	}

	public static void click(WebElement ele) {
		ele.click();

	}

	public static void sendkeys(WebElement x, String y) {
		x.sendKeys(y);
		System.out.println("passing string" + y);
	}

	public static void waits(By element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));

	}

}
