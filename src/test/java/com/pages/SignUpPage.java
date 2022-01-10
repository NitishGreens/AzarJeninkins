package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.libglobal.LibGlobal;

public class SignUpPage extends LibGlobal {

	public SignUpPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "firstname")
	private WebElement txtFirstName;

	@FindBy(name = "lastname")
	private WebElement txtSurName;

	@FindBy(xpath = "//button[text()='Sign Up']")
	private WebElement btnSignUp;

	public WebElement getBtnSignUp() {
		return btnSignUp;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtSurName() {
		return txtSurName;
	}

	public void fillFirstNameAndSurName(String fName, String lName) {
		setText(getTxtFirstName(), fName);
		setText(getTxtSurName(), lName);
	}

	public void clickOnSignUp() {
		btnClick(getBtnSignUp());
	}

	public String getFirstNameValue() {

		String value = getAttributeByValue(txtFirstName);
		return value;

	}

}
