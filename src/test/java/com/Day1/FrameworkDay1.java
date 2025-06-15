package com.Day1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameworkDay1 {
	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("mujeeb");
			
	}

	
	
	
	
	
}
