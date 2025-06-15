package com.baseandexcel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BaseClass;

public class TaskUsingReuse extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {
	 
		TaskUsingReuse task = new TaskUsingReuse();
		task.orderIdCreation();

	}

	public void orderIdCreation() throws IOException, InterruptedException {
		// Login
		BrowserLaunch();
		maximizeWindow();
		enterUrl("https://www.omrbranch.com/");
		implicitWait(60);

		WebElement txtUsername = findlocatorby("email");
		Elementsendkeys(txtUsername, getcelldata("login", 1, 0));

		WebElement txtpassword = findlocatorby("pass");
		Elementsendkeys(txtpassword, getcelldata("login", 1, 1));

		WebElement btnLogin = FindlocatorByxpath("//button[@value='login']");
		elementClick(btnLogin);

		// Search Product
		Thread.sleep(3000);
		WebElement txtSearch = findlocatorby("search");
		SendkeysEnter(txtSearch, "nuts");
		//elementClick(txtSearch);

		// WebElement searchText = FindlocatorByxpath("//h5[@class='sectionTitle font35
		// font-weight-bold color11']");
		// String textFromWebPage = getTextFromWebPage(searchText);

		// Select first product
//	webDriverWait("//a[@class='hover1 font16 fontsemibold colorWhite bgTheme px-4 py-1 radius50 dyna_btn addBtn-17']", 30);
		Thread.sleep(5000);
		WebElement btnAdd = FindlocatorByxpath("(//a[contains(text(),'Add')])[1]");
		clickByJavaScript(btnAdd);
		// Select 2nd varient
		WebElement btnAdd2 = FindlocatorByxpath("//button[@id='cart-22']");
		clickByJavaScript(btnAdd2);

		// Add product into cart
		WebElement btnGocart = FindlocatorByxpath("//a[@class='hover1']");
		clickByJavaScript(btnGocart);

		// Add address
		WebElement btnAddress = FindlocatorByxpath(
				"//div[@class='diffAddres addAddress d-flex justify-content-center align-items-center mb-md-0 mb-2']");
		elementClick(btnAddress);

		WebElement ddnAddress = FindlocatorByxpath("//select[@id='address_type']");
		selectByIndex(ddnAddress, 3);

		WebElement txtFirstName = FindlocatorByxpath("(//input[@name='first_name'])[1]");
		Elementsendkeys(txtFirstName, "Mujeeb");

		WebElement txtLastName = FindlocatorByxpath("(//input[@name='last_name'])[1]");
		Elementsendkeys(txtLastName, "Rahaman");

		WebElement txtMbl = FindlocatorByxpath("//input[@name='mobile']");
		Elementsendkeys(txtMbl, "8667269260");

		WebElement txtHouseNo = FindlocatorByxpath("//input[@name='apartment']");
		Elementsendkeys(txtHouseNo, "23/9");

		WebElement txtAddress = FindlocatorByxpath("//input[@name='address']");
		Elementsendkeys(txtAddress, "washermenpet");

	//	WebElement ddnCountry = FindlocatorByxpath("//select[@name='country']");
	//	selectByIndex(ddnCountry, 1);

		Thread.sleep(3000);
		WebElement ddnState = FindLocatorByName("state");
		selectByText(ddnState, "Tamil Nadu");

		Thread.sleep(5000);
		WebElement ddnCity = FindlocatorByxpath("//select[@name='city']");
		selectByText(ddnCity, "Chennai");

		WebElement txtZip = FindLocatorByName("zipcode");
		Elementsendkeys(txtZip, "600021");

		WebElement btnSave = FindlocatorByxpath("(//button[@type='submit'])[3]");
		elementClick(btnSave);

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

		WebElement btnOrder = FindlocatorByxpath("//button[@id='placeOrder']");
		elementClick(btnOrder);

		quitWindow();

	}

}
