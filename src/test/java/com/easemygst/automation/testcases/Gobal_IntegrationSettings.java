package com.easemygst.automation.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.easemygst.automation.common.TaxillaCommon;
import com.easemygst.automation.core.TestActions;
import com.easemygst.automation.core.TestData;
import com.easemygst.automation.core.TestResult;
import com.easemygst.automation.pom.Apps;
import com.easemygst.automation.pom.GobalIntegrationSettings;
import com.easemygst.automation.pom.OutwardEWayBills;

public class Gobal_IntegrationSettings {
	static TestActions action = CommonLogin.action;
	static String testCase;
	static String testStatus;
	static Apps app = new Apps(action);
	static GobalIntegrationSettings gi = new GobalIntegrationSettings(action);
	static OutwardEWayBills ewb = new OutwardEWayBills(action);
	
	@BeforeMethod(alwaysRun = true)
	public static void loadData() throws Exception {
		action.initialise();
		CommonLogin.login();

	};

	@BeforeClass
	public static void Data() {
		TestData.loadTestData();

	}

	@AfterTest
	public void endReport() {

	}

	@AfterMethod(alwaysRun = true)
	public static void logTestResult(ITestResult result) {
		TestResult.processTestResult(testCase, result);
		CommonLogin.logout();
		CommonLogin.endTesting();
	}
	
	@Test(enabled = true, priority = 0)
	public static void gIntSettings() throws Throwable {
		testCase = "gIntSettings";
		//assertEquals(app.navigatelandingpage(TestData.orgName, TestData.tenant), true);
		//action.getScreenShot(testCase);
		assertEquals(gi.quickclick(), true);
		action.getScreenShot(testCase);
        assertEquals(gi.IntSetings(),true);
		action.getScreenShot(testCase);
		assertEquals(gi.AddCon(),true);
		action.getScreenShot(testCase);
		assertEquals(gi.Name(),true);
		action.getScreenShot(testCase);
		assertEquals(gi.SerAddr("3.110.124.47"), true);
		action.getScreenShot(testCase);
		assertEquals(gi.Port("22"), true);
		action.getScreenShot(testCase);
        assertEquals(gi.FolPath("/local"), true);
		action.getScreenShot(testCase);
		assertEquals(gi.UserName("sftptester"), true);
		action.getScreenShot(testCase);
		assertEquals(gi.SshFTP1(),true);
		action.getScreenShot(testCase);
		assertEquals(gi.AddKey(),true);
        action.getScreenShot(testCase);
        assertEquals(gi.AddKey(),true);
		action.getScreenShot(testCase);
		assertEquals(gi.TxtArea("-----BEGIN RSA PRIVATE KEY-----\r\n"
				+ "MIIEpAIBAAKCAQEAxPiQxNlso4ltz9uy4O3nurBcGVfsPIjjm0UTF6Z35QBIbK5i\r\n"
				+ "+gJPE6PwQx8dA0XiPupSWTLw07Mjj2jQ8xgDCFNLWMyAU092NK1vBHj/jGYmnm1t\r\n"
				+ "YTimxfmGmyB6bkwQI+Dou/Q2GL+uMEFQ7pzflVoKJsDfc3MAT4yf0fY/5IERRus3\r\n"
				+ "wSgVDBkdAxfc8PNuPr61kaC5/I9a3yMrEUvXWQFJStr9gaP/JsE3df6kTM1rydpV\r\n"
				+ "YjTbbXY72Q//xrugjFxmq9tHeQkescfdjLRH8H4GCasd/gkxs109G//nJy9GVIZ1\r\n"
				+ "G4oVqoq1FbNhRy3OvJW1NUejWe6Gpk4/yFtxSwIDAQABAoIBAQCM3tTy5ClNgKFX\r\n"
				+ "0mHJenyLyUvlGDutQ52805cHCBihYCVsDQBem74gZtQTvTHLwHRB2OYSQ1t3nJvn\r\n"
				+ "Geiuo1Kv5ppxpLh2XNNGc299vGfP6tLd5ZcfvBuSZZY+ZekJ7z5v2o+4tLzn0Fbs\r\n"
				+ "zhnqvakuMJooAzMMZ4gmXIWE7V/etKoBQ20jhPEBUZJExnyxKV0vVno48RWXuGhj\r\n"
				+ "0jPEdj3pnYG2HphfS8EvYzsSggKmHIOkiPt2kNgjhTlSOPcm0bEkgS9YbCW1l7d0\r\n"
				+ "K+d2qJb0Vw6h/QVs+/ZMB4tHKu3sAL16HvKqYVbVZHE2akElS0nFheEPPGb7N/jJ\r\n"
				+ "VLpsAyq5AoGBAPNTffMr/VQjMZ/BAOBw4yn7PdecF4RxFlxnQo4ylkX+ovEps9St\r\n"
				+ "tyVHWJOSHtkOqt33LDae/jj3tFG/eXbp3iX4zBv8lvuXY2dWZwPZu/uL17Ctzzog\r\n"
				+ "rzwBJrb3wiZ7Gm2+eu7RiCOwSVEz+WHNHr3d+NkZPjH/WhhVF3tF5453AoGBAM86\r\n"
				+ "+Vr7WI2no1g8dykdOJbXnklj8zV2xby2YQWc2zVdvHXPm0vnc0/+hx63bPVvOCKJ\r\n"
				+ "XO43D9znm1EYm9o03dQdt9M3IyR/cR0HaYD9rnv7ccqDoNGHhGFIYAbKVVpCJAhd\r\n"
				+ "36EWnhScv3ePtw/ZKEb22qbDdHRjH1BDx9LMj4TNAoGBALUwScxmyEf7wPsFvAJk\r\n"
				+ "7TMYq88+o2By2UTLe4rpbm8Gkwzjkc5f4M34l6OjnibhPij04k52DDYddX+eBfOf\r\n"
				+ "aFV8M3jvmPoVm+aaNzFt1AYW9vDQLExLhFE5RjveuArxhheMTHxDOI3iumWmPyAt\r\n"
				+ "nqOhg6kdm+udCtitnEOmJSw3AoGABnXFLjPlp8zRB8AiytJRYEpqcck+3KzOLzrU\r\n"
				+ "PXONVdWNOXL2WWBmtNivZ6K6L9B+xHzZu8dVpEJIEjgdK6k4PROMFnaCjvG2GfyQ\r\n"
				+ "Kmg+FzlYa8K8saty0gGKlMub64tiSix6+y+UT/ou8dA2GbVgTw4E9Ovk5nfskvj5\r\n"
				+ "8rVTyAUCgYBgJyuVKXtXRd29nvG0TFhaJrGhOJQHCtp/LPLj89ZAe/wQfYV5wrbO\r\n"
				+ "20SnR4QCvVu6Qmm3g3zyqiktym/MYyIWrGZnCm1+XrZBe0g0oqEyBQrnPoRfJc2D\r\n"
				+ "U6oWR5szVyGS7srJLLdNWj/sH/Atp5XxIjfcGBYfElg+OfVet/v3rA==\r\n"
				+ "-----END RSA PRIVATE KEY-----\r\n"
				+ ""), true);
		action.getScreenShot(testCase);
		assertEquals(gi.TestConn(), true);
		action.getScreenShot(testCase);
		assertEquals(gi.verifyconnectionStatus("Connected successfully"), true);
		action.getScreenShot(testCase);
	}
			

}
