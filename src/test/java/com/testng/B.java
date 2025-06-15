package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class B {
	WebDriver driver;
	
	@BeforeTest
	private void Launch() {
		driver = new ChromeDriver();

	}
	@Test
	private void method2() {
		System.out.println("method2");

	}

	}


