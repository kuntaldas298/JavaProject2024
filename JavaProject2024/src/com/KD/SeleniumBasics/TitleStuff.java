package com.KD.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleStuff {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("hi");

		WebDriver driver = new ChromeDriver();
		
		String allUrl[] = {"https://www.google.com/","https://www.facebook.com/",
				"https://www.amazon.com"};
		
		driver.get(allUrl[0]);
		String actualTitle = driver.getTitle();
		String expectedTitleString = "Google";
		//String pgsrcString = driver.getPageSource();
		
		if (actualTitle.equals(expectedTitleString))
			System.out.println("pass");
		else {
			System.out.println("fail");
			System.out.println("Expected Title : "+ expectedTitleString +" \nActual Title : " + actualTitle);
		}
		
		driver.quit();
		//System.out.println(title);

		System.out.println("bye");
	}
}
