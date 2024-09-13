package org.locators;

import org.baseclass.BaseClass;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPage extends BaseClass{
		public LoginPage() {
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(name="email")
		private WebElement txtUserName;
		
		public WebElement getTxtUserName() {
			return txtUserName;
		}

		public WebElement getTxtPassword() {
			return txtPassword;
		}

		public WebElement getBtnLogin() {
			return btnLogin;
		}

		@FindBy(name="password")
		private WebElement txtPassword;
		
		@FindBy(xpath="//button[@type='submit']")
		private WebElement btnLogin;
		
		@FindBy(xpath="//div[text()='Invalid Credential.']")
		private WebElement loginErrorMessage;

		public WebElement getLoginErrorMessage() {
			return loginErrorMessage;
		}


	}

