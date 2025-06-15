package com.pomTask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class IntroPage extends BaseClass{
	public IntroPage() {
		PageFactory.initElements(driver, this);
	}
     @FindBy(id = "first-name")
     private WebElement txtName;
     
     @FindBy(id = "last-name")
     private WebElement txtLastName;
     
     @FindBy(id = "email")
     private WebElement txtEmail;
     
     @FindBy(id = "mobile")
     private WebElement txtMobile;
     
     @FindBy(id = "country")
     private WebElement ddnCountry;
     
     @FindBy(id = "city")
     private WebElement ddnCity;
     
     @FindBy(id ="message")
     private WebElement txtMessage;
     
     
     @FindBy(xpath = "//button[text()='Send']")
     private WebElement btnSend;

	public WebElement getTxtName() {
		return txtName;
	}

	
	public WebElement getTxtLastName() {
		return txtLastName;
	}

	
	public WebElement getTxtEmail() {
		return txtEmail;
	}

	

	public WebElement getTxtMobile() {
		return txtMobile;
	}

	
	public WebElement getDdnCountry() {
		return ddnCountry;
	}


	public WebElement getDdnCity() {
		return ddnCity;
	}
	
	public WebElement getTxtMessage() {
		return txtMessage;
	}

	public WebElement getBtnSend() {
		return btnSend;
	}

     
     public void demoqa(String txtName1, String lastname1, String email1, String mobile1,String country, String city, String txtmessage1) {
		Elementsendkeys(txtName, txtName1);
		Elementsendkeys(txtLastName, lastname1);
		Elementsendkeys(txtEmail, email1);
		Elementsendkeys(txtMobile, mobile1);
		Elementsendkeys(txtMessage, txtmessage1);
        selectByText(ddnCountry, country);
        selectByText(ddnCity, city);
        elementClick(btnSend);
	}
     
     
     
     


}
