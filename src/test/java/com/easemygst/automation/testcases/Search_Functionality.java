package com.easemygst.automation.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.easemygst.automation.core.TestActions;
import com.easemygst.automation.core.TestData;
import com.easemygst.automation.pom.Apps;
import com.easemygst.automation.pom.OutwardEWayBills;
import com.easemygst.automation.pom.SearchFunctionality;

public class Search_Functionality extends TestActions {
	static TestActions action = CommonLogin.action;
	static String testCase;
	static String testStatus;
	static Apps app = new Apps(action);
	static OutwardEWayBills ewb = new OutwardEWayBills(action);
	static SearchFunctionality sf = new SearchFunctionality(action);

	@BeforeMethod(alwaysRun = true)
	public static void loadData() throws Exception {
		action.initialise();
		CommonLogin.login();

	}

	@BeforeClass
	public static void Data() {
		TestData.loadTestData();

	}

	@AfterTest
	public void endReport() {

	}

	@AfterMethod(alwaysRun = true)
	public static void logTestResult() {
		CommonLogin.logout();
		CommonLogin.endTesting();
	}

	@Test(enabled = true, priority = 0) // passed
	public static void searchGenerated() throws Throwable {
		testCase = "SearchGenerated";
		assertEquals(app.navigate(TestData.orgName, TestData.tenant), true);
		action.getScreenShot(testCase);
		assertEquals(app.Apphomepage("Outward E-Way Bills", " enInvoice "), true);
		// assertEquals(app.searchApp("Outward E-Way Bills"), true);
		action.getScreenShot(testCase);
		// assertEquals(app.allProcesses(), true);
		assertEquals(app.selectRecord(), true);
		assertEquals(sf.filters(), true);
		assertEquals(sf.ewbBillStatus(), true);
		assertTrue(sf.verifyEWBGenerated(" Generated "));
		assertEquals(sf.clear(), true);

	}

	@Test(enabled = true, priority = 1) // not there 
	public static void searchRejected() throws Throwable {
		testCase = "SearchRejected";
		assertEquals(app.navigate(TestData.orgName, TestData.tenant), true);
		action.getScreenShot(testCase);
		// assertEquals(app.searchApp("Outward E-Way Bills"), true);
		assertEquals(app.Apphomepage("Outward E-Way Bills", " enInvoice "), true);
		//assertEquals(app.allProcesses(), true);
		action.getScreenShot(testCase);
		assertEquals(app.selectRecord(), true);
		assertEquals(sf.filters(), true);
		assertEquals(sf.ewbBillStatus(), true);
		assertTrue(sf.verifyEWBRejected(" Rejected "));
		assertEquals(sf.clear(), true);

	}

	@Test(enabled = true, priority = 2) // passed
	public static void searchCancelled() throws Throwable {
		testCase = "SearchCancelled";
		assertEquals(app.navigate(TestData.orgName, TestData.tenant), true);
		action.getScreenShot(testCase);
		// assertEquals(app.searchApp("Outward E-Way Bills"), true);
		assertEquals(app.Apphomepage("Outward E-Way Bills", " enInvoice "), true);
		//assertEquals(app.allProcesses(), true);
		assertEquals(app.selectRecord(), true);
		assertEquals(sf.filters(), true);
		assertEquals(sf.ewbBillStatus(), true);
		assertTrue(sf.verifyEWBCancelled(" Cancelled "));
		assertEquals(sf.clear(), true);
	}

	@Test(enabled = true, priority = 3) // passed
	public static void searchUpdated() throws Throwable {
		testCase = "SearchUpdated";
		assertEquals(app.navigate(TestData.orgName, TestData.tenant), true);
		action.getScreenShot(testCase);
		// assertEquals(app.searchApp("Outward E-Way Bills"), true);
		assertEquals(app.Apphomepage("Outward E-Way Bills", " enInvoice "), true);
		//assertEquals(app.allProcesses(), true);
		assertEquals(app.selectRecord(), true);
		assertEquals(sf.filters(), true);
		assertEquals(sf.ewbBillStatus(), true);
		assertTrue(sf.verifyEWBUpdated(" Updated "));
		assertEquals(sf.clear(), true);
	}

	@Test(enabled = true, priority = 4) // not available
	public static void searchExtended() throws Throwable {
		assertEquals(app.navigate(TestData.orgName, TestData.tenant), true);
		// assertEquals(app.searchApp("Outward E-Way Bills"), true);
		assertEquals(app.Apphomepage("Outward E-Way Bills", " enInvoice "), true);
		//assertEquals(app.allProcesses(), true);
		assertEquals(app.selectRecord(), true);
		assertEquals(sf.filters(), true);
		assertEquals(sf.ewbBillStatus(), true);
		assertTrue(sf.verifyEWBExtended(" Extended "));
		assertEquals(sf.clear(), true);
	}

	@Test(enabled = true, priority = 5) // passed
	public static void searchNewOrProgress() throws Throwable {
		assertEquals(app.navigate(TestData.orgName, TestData.tenant), true);
		// assertEquals(app.searchApp("Outward E-Way Bills"), true);
		assertEquals(app.Apphomepage("Outward E-Way Bills", " enInvoice "), true);
		//assertEquals(app.allProcesses(), true);
		assertEquals(app.selectRecord(), true);
		assertEquals(sf.filters(), true);
		assertEquals(sf.ewbBillStatus(), true);
		assertTrue(sf.verifyEWBNeworInprogress(" New or Inprogress "));
		assertEquals(sf.clear(), true);
	}

	@Test(enabled = true, priority = 6) // 2 conditions
	public static void postExecuteStatus() throws Throwable {
		assertEquals(app.navigate(TestData.orgName, TestData.tenant), true);
		// assertEquals(app.searchApp("Outward E-Way Bills"), true);
		assertEquals(app.Apphomepage("Outward E-Way Bills", " enInvoice "), true);
		//assertEquals(app.allProcesses(), true);
		assertEquals(app.selectRecord(), true);
		assertEquals(sf.filters(), true);
		assertEquals(sf.processStatuses(), true);
		assertTrue(sf.verifyPostexecutedApiCompleted());
		assertEquals(sf.clear(), true);
	}

	@Test(enabled = true, priority = 7) // not available
	public static void preExecuteStatus() throws Throwable {
		assertEquals(app.navigate(TestData.orgName, TestData.tenant), true);
		// assertEquals(app.searchApp("Outward E-Way Bills"), true);
		assertEquals(app.Apphomepage("Outward E-Way Bills", " enInvoice "), true);
		//assertEquals(app.allProcesses(), true);
		assertEquals(app.selectRecord(), true);
		assertEquals(sf.filters(), true);
		assertEquals(sf.processStatuses(), true);
		assertTrue(sf.verifyPreexecutedApiCompleted(" Generated "));
		assertEquals(sf.clear(), true);
	}

	@Test(enabled = true, priority = 8) // not available
	public static void updateCancelGenerated() throws Throwable {
		assertEquals(app.navigate(TestData.orgName, TestData.tenant), true);
		// assertEquals(app.searchApp("Outward E-Way Bills"), true);
		assertEquals(app.Apphomepage("Outward E-Way Bills", " enInvoice "), true);
		//assertEquals(app.allProcesses(), true);
		assertEquals(app.selectRecord(), true);
		assertEquals(sf.filters(), true);
		assertEquals(sf.processStatuses(), true);
		assertTrue(sf.verifyUpdateCancelGenerate(" Generated "));
		assertEquals(sf.clear(), true);
	}

	@Test(enabled = true, priority = 9) // passed
	public static void updateCancelTerminated() throws Throwable {
		assertEquals(app.navigate(TestData.orgName, TestData.tenant), true);
		// assertEquals(app.searchApp("Outward E-Way Bills"), true);
		assertEquals(app.Apphomepage("Outward E-Way Bills", " enInvoice "), true);
		//assertEquals(app.allProcesses(), true);
		assertEquals(app.selectRecord(), true);
		assertEquals(sf.filters(), true);
		assertEquals(sf.processStatuses(), true);
		assertTrue(sf.verifyUpdateCancelTerminated(" New or Inprogress "));
		assertEquals(sf.clear(), true);
	}

	@Test(enabled = true, priority = 10) // not available
	public static void requestCancelled() throws Throwable {
		assertEquals(app.navigate(TestData.orgName, TestData.tenant), true);
		// assertEquals(app.searchApp("Outward E-Way Bills"), true);
		assertEquals(app.Apphomepage("Outward E-Way Bills", " enInvoice "), true);
		//assertEquals(app.allProcesses(), true);
		assertEquals(app.selectRecord(), true);
		assertEquals(sf.filters(), true);
		assertEquals(sf.processStatuses(), true);
		assertTrue(sf.verifyRequestCancelled(" New or Inprogress "));
		assertEquals(sf.clear(), true);
	}

	@Test(enabled = true, priority = 11) // passed   
	public static void customSearch() throws Throwable {
		assertEquals(app.navigate(TestData.orgName, TestData.tenant), true);
		// assertEquals(app.searchApp("Outward E-Way Bills"), true);
		assertEquals(app.Apphomepage("Outward E-Way Bills", " enInvoice "), true);
		//assertEquals(app.allProcesses(), true);
		assertEquals(app.selectRecord(), true);
		assertEquals(sf.filters(), true);
		assertEquals(sf.customSearch(), true);
		assertTrue(sf.verifyreportstatus());
		assertTrue(sf.downloadsucessmessage());
		assertEquals(sf.clear(), true);
	}

	@Test(enabled = true, priority = 12) // passed
	public static void searchfilters() throws Throwable {
		assertEquals(app.navigate(TestData.orgName, TestData.tenant), true);
		// assertEquals(app.searchApp("Outward E-Way Bills"), true);
		assertEquals(app.Apphomepage("Outward E-Way Bills", " enInvoice "), true);
		//assertEquals(app.allProcesses(), true);
		assertEquals(app.selectRecord(), true);
		assertEquals(sf.filters(), true);
		assertEquals(sf.filterdownload(), true);

	}

	@Test(enabled = true, priority = 13) // passed
	public static void filterByDate() throws Throwable {
		assertEquals(app.navigate(TestData.orgName, TestData.tenant), true);
		// assertEquals(app.searchApp("Outward E-Way Bills"), true);
		assertEquals(app.Apphomepage("Outward E-Way Bills", " enInvoice "), true);
		//assertEquals(app.allProcesses(), true);
		assertEquals(app.selectRecord(), true);
		assertEquals(sf.filters(), true);
		assertEquals(sf.filterByDate(), true);
		assertEquals(sf.clear(), true);

	}
}
