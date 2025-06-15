package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A {
	@DataProvider(name= "testdata")
	private Object[][] data() {
	 Object	object [][] = new Object [][] {{"mujju@gmail.com","mujju@123"},{"raja@gmail.com","raja@123"}};
		
return object;
	}
	
	
	
	
	
	
	//WebDriver driver;
	@Test(dataProvider = "testdata",dataProviderClass = A.class)
	@Parameters({"username","password"})
	public void method(String username, String passord ) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	WebElement u = driver.findElement(By.id("email"));
	u.sendKeys(username);
	
	WebElement p = driver.findElement(By.id("pass"));
	p.sendKeys(passord);

	}

}
