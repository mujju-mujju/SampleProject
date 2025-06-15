package com.junit;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {
	static WebDriver driver;
	@BeforeClass
	public static void beforeclass() {
	 driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	}
	@AfterClass
	public static void afterclass() {
		System.out.println("afterclass");
	}
	@Test
	public void login() {
		System.out.println("start......");
		System.out.println("verify username",true);
		
		
		
		
		
		
				
	}

}
