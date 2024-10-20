package com.KD.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upcasting {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("hi");
		//up-casting 
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");


		Thread.sleep(1500);
		driver.close();
		System.out.println("bye");
	}
}
