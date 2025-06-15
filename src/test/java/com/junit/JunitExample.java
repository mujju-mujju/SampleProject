package com.junit;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.jspecify.annotations.Nullable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.BaseClass;
import com.pom.LoginPage;
import com.pom.MyCartPage;
import com.pom.ProductListingPage;
import com.pom.ProductSearchPage;

public class JunitExample extends BaseClass {

@BeforeClass
public static void beforeClass() {
BrowserLaunch();
maximizeWindow();
enterUrl("https://www.omrbranch.com/");


	}
//@AfterClass
//public static void afterClass() {
//driver.quit();
//}
//@Before
//public void beforeMethod() throws IOException {
	//TakesScreenshot screen = (TakesScreenshot) driver;
	//File file = screen.getScreenshotAs(OutputType.FILE);
	//File desigfile = new File("D:\\User Data\\Desktop\\sample.png");
	//FileUtils.copyFile(file, desigfile);

//}
@After
//public void afterMethod() {

//

@Test
public  void TestMethod() throws IOException {
	LoginPage login = new LoginPage();
	login.login(getcelldata("login", 1, 0), getcelldata("login", 1, 1));
	ProductSearchPage p = new ProductSearchPage();
	p.searchProductName(getcelldata("login", 0, 3));
	ProductListingPage list = new ProductListingPage();
	list.SelectFirstProduct();
	MyCartPage cart = new MyCartPage();
	cart.myCart(getcelldata("login", 0, 16), 1, 1, getcelldata("login", 0, 1), "123", getcelldata("login", 0, 2), getcelldata("login", 0, 9), getcelldata("login", 0, 10), getcelldata("login",0, 11), 1, getcelldata("login", 0, 12), getcelldata("login", 0, 13), getcelldata("login", 0, 14));
}
}
		
	
	
	/*
public void OrderIdCreation() throws IOException, InterruptedException {
	// Login
	WebElement txtEmail = findlocatorby("email");
	Elementsendkeys(txtEmail, getcelldata("login", 1, 1));
	
	WebElement txtpassword = findlocatorby("pass");
	Elementsendkeys(txtpassword, getcelldata("login", 1, 2));
	
	WebElement btnLogin = FindlocatorByxpath("//button[@value='login']");
	elementClick(btnLogin);
	
	// VerifyLoginMessage
	WebElement LoginSuccessMessage = FindlocatorByxpath("//a[@data-testid='username']");
	String textFromWebPage = getTextFromWebPage(LoginSuccessMessage);
	Assert.assertEquals("verify", "Welcome Mujeebur", textFromWebPage);
	
	// Search Product
	WebElement txtSearch = findlocatorby("search");
	SendkeysEnter(txtSearch, "nuts");
	
	// verify search nuts
	WebElement textNuts = FindlocatorByxpath("//h5[contains(text(),'nuts')]");
	String text = textNuts.getText();
	Assert.assertEquals("verify", "Search Result - nuts", text);
	
	//Add product into cart
	WebElement btnAdd= FindlocatorByxpath("//a[contains(@class,'hover1 font16 fontsemibold colorWhite bgTheme px-4 py-1 radius50 dyna_btn addBtn-17')]");
	clickByJavaScript(btnAdd);
	
	// Select 2nd varient
		WebElement btnAdd2 = FindlocatorByxpath("//button[@id='cart-22']");
		clickByJavaScript(btnAdd2);
		
		// verify my cart
		WebElement element = FindlocatorByxpath("//h5[text()='My Cart']");
		String textFromWebPage2 = getTextFromWebPage(element);
		Assert.assertEquals("verify", "My Cart", textFromWebPage2);

		// Add address
		WebElement btnAddress = FindlocatorByxpath("//div[@class='diffAddres addAddress d-flex justify-content-center align-items-center mb-md-0 mb-2']");
		elementClick(btnAddress);
		
		WebElement ddnAddress = FindlocatorByxpath("//select[@id='address_type']");
		selectByIndex(ddnAddress, 3);
		
		WebElement txtFirstName = FindlocatorByxpath("(//input[@name='first_name'])[1]");
		Elementsendkeys(txtFirstName, "Mujeeb");
		
		WebElement txtLastName = FindlocatorByxpath("//input[@name='last_name'])[1]");
		Elementsendkeys(txtLastName, "Rahaman");
		
		WebElement txtMbl = FindlocatorByxpath("//input[@name='mobile']");
		Elementsendkeys(txtMbl, "8667269260");
		
		WebElement txtHouseNo = FindlocatorByxpath("//input[@name='apartment'");
		Elementsendkeys(txtHouseNo, "23/9");
		
		WebElement txtAddress = FindlocatorByxpath("//input[@name='address']");
		Elementsendkeys(txtAddress, "washermenpet");
		
		WebElement ddnCountry = FindlocatorByxpath("//select[@name='country']");
		selectByIndex(ddnCountry, 1);
		
		WebElement ddnState = FindLocatorByName("state");
		selectByText(ddnState, "Tamil Nadu");
		
		WebElement ddnCity = FindlocatorByxpath("//select[@name='city']");
		selectByText(ddnCity, "chennai");
		
		WebElement txtZip = FindLocatorByName("zipcode");
		Elementsendkeys(txtZip, "600021");
		
		WebElement btnSave = FindlocatorByxpath("(//button[@type='submit'])[3]");
		elementClick(btnSave);
		
		// verify delivery Address
		WebElement element2 = FindlocatorByxpath("//div[text()='Delivery Address']");
		String textFromWebPage3 = getTextFromWebPage(element2);
		Assert.assertEquals("verify", "Delivery Address", textFromWebPage3);
		
		// payment
		WebElement ddnPayment = FindlocatorByxpath("payment_type");
		selectByIndex(ddnPayment, 1);
		
		WebElement btnType = FindlocatorByxpath("//label[@for='visa_card']");
		elementClick(btnType);
		
		WebElement txtCardNo = FindLocatorByName("card_no");
		Elementsendkeys(txtCardNo, "5555555555552222");
		
		WebElement ddnMonth = findlocatorby("month");
		selectByIndex(ddnMonth, 1);
		
		WebElement ddnYear = findlocatorby("year");
		selectByIndex(ddnYear, 1);
		
		WebElement txtCvv = FindLocatorByName("cvv");
		Elementsendkeys(txtCvv, "123");
		
		// verify payment
		WebElement paymentText = FindlocatorByxpath("//div[text()='  Payment Method ']");
		String textFromWebPage4 = getTextFromWebPage(paymentText);
		Assert.assertEquals("verify", "Payment Method", textFromWebPage4);
		
		// Order it
		WebElement btnOrder = FindlocatorByxpath("//button[@id='placeOrder']");
		elementClick(btnOrder);
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
	
	

