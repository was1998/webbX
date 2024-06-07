package com.webX;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;

import ActionHelper.ActionHelper;
import Screens.LoginScreen;

public class Login extends BaseClass {
	ActionHelper actionHelper=new ActionHelper();
	LoginScreen loginScreen=new LoginScreen();
	@Test
	public void loginTest() {
		Page page=launchBrowser();
		actionHelper.enterText(page, "student","[data-qa='login-email']");
		actionHelper.enterText(page,"Password123", "[data-qa='login-password']");
		page.click("[data-qa='login-button']");
		
	}

}
