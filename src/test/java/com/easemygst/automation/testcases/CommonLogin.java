package com.easemygst.automation.testcases;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.easemygst.automation.core.TestActions;
import com.easemygst.automation.core.TestData;
import com.easemygst.automation.pom.Login;

/***
 * Class with Login functionality
 * 
 * 
 *
 */
public class CommonLogin {
	public static TestActions action = new TestActions();

	public static String userName = "";
	public static String passWord = "";
	public static String autURL = "";
	public static String securityQ1 = "";
	public static String securityQ2 = "";

	public static void loadData() {
		userName = TestData.userName;
		passWord = TestData.passWord;
		autURL = TestData.autURL;
		securityQ1 = TestData.securityQ1;
		securityQ2 = TestData.securityQ2;
	}

	@BeforeSuite
	public static void login() throws InterruptedException {
		TestData.loadTestData();
		
		CommonLogin.loadData();

		action.gotoURL(autURL);
		
		Login login = new Login(action);

		assertEquals(login.login(userName, passWord,securityQ1,securityQ2), true);
	}

	public static void logout() {
		Login login = new Login(action);

		login.logout();
		action.waitFor(2);
	}

	/**
	 * Private constructor to disable creation of object
	 */
	private CommonLogin() {
	}

	@AfterSuite
	public static void endTesting() {
		action.closeTab();
		
	}
}
