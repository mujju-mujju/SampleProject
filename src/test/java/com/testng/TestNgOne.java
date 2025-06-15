package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pom.LoginPage;
import com.pomTask.IntroPage;

public class TestNgOne{
@Test(retryAnalyzer = Retry.class)
public void browserlaun() {
	Assert.assertEquals(true, false);
	
}
@Test
public void Mujeeb() {
	Assert.assertEquals(true, false);
	
}
}