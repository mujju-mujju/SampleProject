package com.pom;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ProductSearchPage extends BaseClass {
	public ProductSearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id= "search")
   private  WebElement txtSearchBox;

	public void searchProductName(String productName) {
		Elementsendkeys(txtSearchBox, productName);
		elementClick(txtSearchBox);		
	}
	
     public WebElement getTxtSearchBox() {
	return txtSearchBox;
}

      @FindBy(xpath="//a[@data-testid='username']")
      private  WebElement loginSuccessMessage;
      
      public WebElement getLoginSuccessMsgElement() {
		return loginSuccessMessage;
		
	}
      

   //   ProductSearchPage product = new ProductSearchPage();
      
    //   String textFromWebPage = getTextFromWebPage(loginSuccessMessage);

	


}
	
	















