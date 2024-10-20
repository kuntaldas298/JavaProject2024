package com.KD.SeleniumBasics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naviagtee {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		System.out.println("hi");

		WebDriver driver = new ChromeDriver();

		String allUrl[] = {"https://www.google.com/","https://www.facebook.com/",
		"https://www.amazon.com/","https://www.flipkart.com/","https://www.myntra.com/"};

		URL url = new URL("https://www.myntra.com/");
		driver.get(allUrl[0]);
		Thread.sleep(1500);
		
		
		driver.navigate().to(url);	
		Thread.sleep(1500);
		
		driver.navigate().back();
		Thread.sleep(1500);
		
		driver.navigate().refresh();
		Thread.sleep(1500);
		
		driver.navigate().forward();
		Thread.sleep(1500);
		
		driver.navigate().to(allUrl[3]);
		Thread.sleep(1500);
		driver.quit();
//
		System.out.println("bye");
	}
}
