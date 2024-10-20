package com.KD.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentUrl {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("hi");

		WebDriver driver = new ChromeDriver();

		String allUrl[] = {"https://www.google.com/","https://www.facebook.com/",
		"https://www.amazon.com/"};

		driver.get(allUrl[2]);
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = allUrl[0];
		//String pgsrcString = driver.getPageSource();

		
		if (actualUrl.equals(expectedUrl))
			System.out.println("pass");
		else {
			System.out.println("fail");
			System.out.println("Expected URL : "+ expectedUrl +" \nActual URL : " + actualUrl);
		}

		driver.quit();
		//System.out.println(title);

		System.out.println("bye");
	}
}
