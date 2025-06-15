package com.pom;

import java.sql.Driver;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class OrderConfirmationPage extends BaseClass {
	public OrderConfirmationPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/i[@class='fa fa-bell']")
	private WebElement bellIcon;
	
	public WebElement getBellIcon() {
		return bellIcon;
	}
	
	
	
	
	
	

}
