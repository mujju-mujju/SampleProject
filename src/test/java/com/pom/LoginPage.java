package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private  WebElement textmail;
	
	@FindBy(id = "pass")
	private WebElement txtPass;
	
	@FindBy(xpath="//button[@value='login']")
	private WebElement btnlogin;
	
	
	
	public WebElement getTextmail() {
		return textmail;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}	
	public void login(String emailId,String password) {
		Elementsendkeys(textmail, emailId);
		Elementsendkeys(txtPass, password);
		elementClick(btnlogin);
		
		

	}
	
}
