package com.easemygst.automation.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.easemygst.automation.core.ExcelDataDriver;
import com.easemygst.automation.core.TestActions;
import com.easemygst.automation.core.TestData;
import com.easemygst.automation.pom.Apps;
import com.easemygst.automation.pom.Ewb_PanIndia;

public class Ewb_Pan_India {
	static TestActions action = CommonLogin.action;
	static String testCase;
	static String testStatus;
	static Apps app = new Apps(action);
	static Ewb_PanIndia ewbpan = new Ewb_PanIndia(action);

	@BeforeMethod(alwaysRun = true)
	public static void loadData() throws Exception {
		action.initialise();
		CommonLogin.login();

	}

	@BeforeClass
	public static void Data() {
		TestData.loadTestData();
	}

	@AfterMethod(alwaysRun = true)
	public static void logTestResult() {
		CommonLogin.logout();
		CommonLogin.endTesting();
	}

	@Test(enabled = true, priority = 0)
	public static void ewbPanIndia() throws Throwable {

		assertEquals(app.navigate(TestData.orgName, TestData.tenant), true);
		// assertEquals(app.searchApp("EWB-Pan-India"), true);
		assertEquals(app.Apphomepage_1("EWB-Pan-India", " enInvoice "), true);

		// assertEquals(app.processNow(), true);
		ExcelDataDriver.WriteData("Document No", TestData.panIndia);
		assertEquals(app.initiateProcess(TestData.panIndia, "Input Standard(XLSX)-1.03"), true);
		assertTrue(app.requestState());
		assertEquals(app.viewRequest(), true);
		assertEquals(app.selectRecord(), true);
		assertEquals(ewbpan.documentNumber(), true);
		assertEquals(ewbpan.ewdStatewide(TestData.panIndiaLevel1), true);
		// ewbpan.verifyDocNumber();
		assertEquals(app.selectRequestLogs(), true);
		assertTrue(app.requestState());
		assertEquals(app.viewRequest(), true);
		assertEquals(app.selectRecord(), true);
		assertEquals(ewbpan.panIndiaOutward(TestData.panIndiaLevel2), true);
		// ewbpan.verifyDocNumber();
		assertEquals(app.selectRequestLogs(), true);
		assertTrue(app.outwardRequestState());
		assertEquals(app.viewRequest(), true);
	}

}
