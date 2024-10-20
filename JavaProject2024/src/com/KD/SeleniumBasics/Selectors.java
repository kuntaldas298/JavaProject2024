package com.KD.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectors {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("hi");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.cssSelector("input[type='text'][id='email'][aria-label='Email address or phone number']")).click();
		driver.findElement(By.cssSelector("input[type='text'],[id='Meao']")).click();
		
		Thread.sleep(1500);
		driver.quit();
		
		System.out.println("bye");
		//input[type="text"]
}
}
