package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ProductListingPage extends BaseClass {
	public ProductListingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(@class,'hover1 font16 fontsemibold colorWhite bgTheme px-4 py-1 radius50 dyna_btn addBtn-17')")
	private WebElement btnAdd;
	
	@FindBy(xpath="//button[@id='cart-22']")
	private WebElement btnSecondProduct;
	
public WebElement getBtnAdd() {
	return btnAdd;
}
public WebElement getBtnSecondProduct() {
	return btnSecondProduct;
}

public void SelectFirstProduct() {
	elementClick(btnAdd);
	elementClick(btnSecondProduct);
}





}








