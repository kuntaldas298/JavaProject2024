package com.KD.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementFind {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("hi");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String allUrl[] = {"https://www.google.com/","https://www.facebook.com/",
		"https://www.amazon.in/","https://www.flipkart.com/account/login?ret=/"};
		
		//id
		//name
		//classname

		driver.get(allUrl[0]);
		driver.findElement(By.id("APjFqb"));
		System.out.println("Done11");
		driver.findElement(By.name("btnI"));
		System.out.println("Done12");
		driver.findElement(By.className("gNO89b"));
		System.out.println("Done13");
		System.out.println("one done");
		System.out.println("----------");
		
		driver.switchTo().newWindow(WindowType.TAB).get(allUrl[1]);
		driver.findElement(By.id("passContainer"));
		System.out.println("Done21");
		driver.findElement(By.name("login"));
		System.out.println("Done22");
		driver.findElement(By.className("_42ft"));
		System.out.println("Done23");
		System.out.println("two done");
		System.out.println("----------");

		driver.switchTo().newWindow(WindowType.TAB).get(allUrl[2]);
		driver.findElement(By.id("twotabsearchtextbox"));
		System.out.println("Done31");
		driver.findElement(By.name("field-keywords"));
		System.out.println("Done32");
		driver.findElement(By.className("nav-line-1"));
		System.out.println("Done33");
		System.out.println("three done");
		System.out.println("----------");
		
		//linkedText
		//partiallinkedText
		
		driver.switchTo().newWindow(WindowType.TAB).get(allUrl[3]);
		driver.findElement(By.linkText("Request OTP"));
		driver.findElement(By.partialLinkText("OTP"));
		
		driver.quit();
		
		System.out.println("bye");
	}
}
