package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.libglobal.LibGlobal;

public class LoginPage extends LibGlobal {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement txtUserName;

	@FindBy(id = "pass")
	private WebElement txtPassword;

	@FindBy(name = "login")
	private WebElement btnLogin;

	@FindBy(xpath = "//a[text()='Create New Account']")
	private WebElement btnCreateNew;

	public WebElement getBtnCreateNew() {
		return btnCreateNew;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void fillUserNameAndPassword(String userName, String password) {
		setText(getTxtUserName(), userName);
		setText(getTxtPassword(), password);
	}

	public void clickOnLogin() {
		btnClick(getBtnLogin());
	}

	public void clickOnBtnCreateNewAccount() {
		btnClick(getBtnCreateNew());
	}

}
