package com.easemygst.automation.pom;

import org.openqa.selenium.By;

import com.easemygst.automation.core.TestActions;
import com.easemygst.automation.common.TaxillaCommon;

public class Login {
	TestActions action = null;

	By UserName = By.xpath("//*[@id='userId']");
	By PassWord = By.xpath("//*[@id='userPassword']");
	By LoginButton = By.xpath("//*[text()=' Submit ']");
	By Person = By.xpath("//span[@class='mat-button-wrapper']/descendant::*[text()='person']");
	By SecurityQ1 = By
			.xpath("(//input[@type='password'])[3]");
	By SecurityQ2 = By
			.xpath("(//input[@type='password'])[4]");
	By Submit = By.xpath(
			"//*[@id=\"signinmaindiv\"]/div/mat-card/div/div[2]/mat-drawer-container/mat-drawer/descendant::*[text()=' Submit ']");
	By Logout = By.xpath("//*[text()='Sign Out']");

	public Login(TestActions action) {
		this.action = action;
	}

	public boolean login(String username, String password, String securityQue1, String securityQue2)
			throws InterruptedException {
		boolean passed = false;

		if (action.countOf(TaxillaCommon.LevelOne.Home) > 0)
		action.waitFor(1);
		passed = action.waitFor(UserName, 4, true);
		passed = action.sendDataTo(UserName, username);
		passed = action.waitFor(PassWord, 4, true);
		passed = action.sendDataTo(PassWord, password);
		passed = action.waitFor(LoginButton, 4, true);
		passed = action.clickOn(LoginButton);
		Thread.sleep(10);
		passed = action.waitFor(LoginButton, 4, false);
		passed = action.waitFor(SecurityQ1, 4, true);
		passed = action.sendDataTo(SecurityQ1, securityQue1);
		passed = action.waitFor(SecurityQ2, 4, true);
		passed = action.sendDataTo(SecurityQ2, securityQue2);
		passed = action.waitFor(Submit, 4, true);
		passed = action.clickOn(Submit);
		
		return passed;
	}

	public boolean logout() {
		boolean passed = false;
		action.waitFor(2);
		action.scrollIntoElement(Person);
		passed = action.waitFor(Person, 4, true);
		passed = action.clickOn(Person);
		passed = action.waitFor(Logout, 4, true);
		passed = action.clickOn(Logout);
		passed = action.waitFor(Logout, 4, false);

		return passed;
	}

}
