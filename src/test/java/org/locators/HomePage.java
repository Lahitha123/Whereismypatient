package org.locators;


import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass{
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserLoginLink() {
		return userLoginLink;
	}

	@FindBy(linkText="Click to login as user")
	private WebElement userLoginLink;
	
	
}