package com.qainfotech.hr;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.NoSuchElementException;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

public class HrisTest {

	public static void main(String[] args) throws InterruptedException {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));
	
		System.setProperty("ChromeDriver.driver", "C:\\Users\\aakashchoudhary\\MindTap-New_Workspace\\hr\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://hris.qainfotech.com");
		driver.manage().window().maximize();
		
		WebElement username_hris = driver.findElementByXPath("//input[@id='txtUserName']");
		username_hris.sendKeys("aakashchoudhary");
		
		WebElement password_hris = driver.findElementByXPath("//input[@id='txtPassword']");
		password_hris.sendKeys("Cengage@3");
		
		WebElement signin_hris = driver.findElementByXPath("//input[@value='Sign In']");
		signin_hris.click();
		
		WebElement menu_hris = driver.findElementByXPath("//a[@id='hamburger']");
		menu_hris.click();
		
		WebElement time_hris = driver.findElementByXPath("//a[@title='Time']");
		time_hris.click();
		
		Thread.sleep(2000);
		
		/*WebElement punches_hris = driver.findElementByXPath("(//h1[contains(text(),'"+dtf.format(now)+"')]/..//b)[2]");
		System.out.println(punches_hris);
		String val=punches_hris.getAttribute("innerText");
		System.out.println(val);*/
		
		try{
		WebElement punches_hris = driver.findElementByXPath("(//h1[contains(text(),'"+dtf.format(now)+"')]/..//b)[2]");
		String val=punches_hris.getAttribute("innerText");
		System.out.println(val);
		}catch(NoSuchElementException  e){
			System.out.println("Exception details:" + e);
			System.out.println("No Punches Found Till Now");

		}
		 
		System.out.println("Rest of the code..");

}

}
