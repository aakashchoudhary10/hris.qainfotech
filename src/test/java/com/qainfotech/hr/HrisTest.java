package com.qainfotech.hr;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.NoSuchElementException;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class HrisTest extends TestSession {

//	public static void main(String[] args) throws InterruptedException {
//		test1();
//		test2();
//	}
	
	@Test
	public static void testTimeSheet(){
		HL.hrislaunch("chrome", "https://hris.qainfotech.com/login.php");
		HL.enterusername("aakashchoudhary");
		HL.enteruserpassword("Cengage@3");
		HL.usersignin();
		HTS.hrismenu();
		HTS.timesheet();
		HTS.punchdetails();
	}
	
	
	
}
