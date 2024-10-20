package com.KD.SeleniumBasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Java1 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("hi");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com");
		
		
		Thread.sleep(1500);
		driver.close();
		System.out.println("bye");
	}
	
}

