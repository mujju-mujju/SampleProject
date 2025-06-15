package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class MyCartPage extends BaseClass{
	public MyCartPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='hover1']")
	private WebElement btnGocart;
	
	@FindBy(xpath="//div[@class='diffAddres addAddress d-flex justify-content-center align-items-center mb-md-0 mb-2']")
	private WebElement btnaddress;
	
	@FindBy(xpath="(//input[@name='first_name'])[1]")
	 private WebElement firstName;
	
	@FindBy(xpath="//input[@name='last_name'])[1]")
	private WebElement TxtLastName;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement txtMbl;
	
	@FindBy(xpath="//input[@name='apartment'")
	private WebElement txtHouseNo;
	
	@FindBy(xpath="/input[@name='address']")
	private WebElement txtAddress;
	
	@FindBy(xpath="//select[@name='country']")
	private WebElement ddnCountry;
	
	@FindBy(name="state")
	private WebElement ddnState;
	
	@FindBy(xpath="//select[@name='city']")
	private WebElement ddnCity;
	
	@FindBy(name="zipcode")
	private WebElement txtZip;
	
	@FindBy(xpath="//button[@type='submit'])[3]")
	private WebElement tnSave;
	
	@FindBy(xpath="payment_type")
	private WebElement ddnPayment;
	
	@FindBy(xpath="//label[@for='visa_card']")
	private WebElement btnType;
	
	@FindBy(name="card_no")
	private WebElement txtCardNo;
	
	@FindBy(id="month")
	private WebElement ddnMonth;
	
	@FindBy(id="year")
	private WebElement ddnYear;
	
	@FindBy(name="cvv")
	private WebElement txtCvv;
	

	public WebElement getBtnGocart() {
		return btnGocart;
	}
	public WebElement getBtnaddress() {
		return btnaddress;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	
	public WebElement getTxtLastName() {
		return TxtLastName;
	}
	public WebElement getTxtMbl() {
		return txtMbl;
	}
	public WebElement getTxtHouseNo() {
		return txtHouseNo;
	}
	public WebElement getTxtAddress() {
		return txtAddress;
	}
	public WebElement getDdnCountry() {
		return ddnCountry;
	}
	public WebElement getDdnState() {
		return ddnState;
	}
	public WebElement getDdnCity() {
		return ddnCity;
	}
	public WebElement getTxtZip() {
		return txtZip;
	}
	public WebElement getTnSave() {
		return tnSave;
	}
	public WebElement getDdnPayment() {
		return ddnPayment;
	}
	public WebElement getBtnType() {
		return btnType;
	}
	public WebElement getTxtCardNo() {
		return txtCardNo;
	}
	public WebElement getDdnMonth() {
		return ddnMonth;
	}
	public WebElement getDdnYear() {
		return ddnYear;
	}
	public WebElement getTxtCvv() {
		return txtCvv;
	}
	public void myCart(String txtCardno1 , int ddnMonth,int ddnYear, String firstName1, String cvv1,String TxtLastName1, String txtMbl1, String HouseNo1,String txtAddress1, int ddnCountry1, String ddnState1, String ddnCity1, String txtZip1 ) {
elementClick(btnGocart);
elementClick(btnaddress);
Elementsendkeys(firstName, firstName1);
Elementsendkeys(TxtLastName, TxtLastName1);
Elementsendkeys(txtMbl, txtMbl1);
Elementsendkeys(txtHouseNo, HouseNo1);
Elementsendkeys(txtAddress, txtAddress1);
elementClick(ddnCountry);
elementClick(ddnState);
elementClick(ddnCity);
elementClick(tnSave);
elementClick(ddnPayment);
Elementsendkeys(txtCvv, cvv1);
}
}