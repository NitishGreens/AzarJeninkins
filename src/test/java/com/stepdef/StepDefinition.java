package com.stepdef;

import org.junit.Assert;

import com.libglobal.LibGlobal;
import com.pages.LoginPage;
import com.pages.SignUpPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends LibGlobal {

	@Given("User is on facebook login page")
	public void user_is_on_facebook_login_page() {

	}

	@When("User enter {string} and {string}")
	public void user_enter_and(String userName, String password) {
		LoginPage loginPage = new LoginPage();
		loginPage.fillUserNameAndPassword(userName, password);
	}

	@When("User click on login Button")
	public void user_click_on_login_Button() {
		LoginPage loginPage = new LoginPage();
		loginPage.clickOnLogin();
	}

	@Then("User get error message")
	public void user_get_error_message() {
		System.out.println("error");
	}

	@When("User click on createNew Button")
	public void user_click_on_createNew_Button() {
		LoginPage loginPage = new LoginPage();
		loginPage.clickOnBtnCreateNewAccount();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String fName, String lName) {
		SignUpPage signUpPage = new SignUpPage();
		signUpPage.fillFirstNameAndSurName(fName, lName);
		String value = signUpPage.getFirstNameValue();
		System.out.println(value);
	}

	@Then("User Click on signup Button")
	public void user_Click_on_signup_Button() {
		SignUpPage signUpPage = new SignUpPage();
		signUpPage.clickOnSignUp();
		Assert.assertTrue(false);
	}

}
