package com.easemygst.automation.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.easemygst.automation.core.ExcelDataDriver;
import com.easemygst.automation.core.TestActions;
import com.easemygst.automation.core.TestData;
import com.easemygst.automation.core.TestResult;
import com.easemygst.automation.pom.Apps;
import com.easemygst.automation.pom.OutwardEWayBills;
import org.testng.ITestResult;

public class Outward_EWayBills extends TestActions {
	static TestActions action = CommonLogin.action;
	static String testCase;
	static String testStatus;
	static OutwardEWayBills ewb = new OutwardEWayBills(action);
	static Apps app = new Apps(action);

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
	public static void eWaybillV12A() throws Throwable {
		testCase = "eWaybillV12A";
		assertEquals(app.navigate(TestData.orgName, TestData.tenant), true);
		action.getScreenShot(testCase);
		// assertEquals(app.searchApp("Outward E-Way Bills"), true);
		// action.getScreenShot(testCase);
		assertEquals(app.Apphomepage_1("Outward E-Way Bills"," enInvoice "), true);
		// assertEquals(app.processNow(), true);
		action.getScreenShot(testCase);
		ExcelDataDriver.WriteData("Document No", TestData.eWaybillTestData);
		assertEquals(app.initiateProcess(TestData.eWaybillTestData, "E-waybill-Inbound-1.03"), true);
		action.getScreenShot(testCase);
		assertEquals(app.viewRequest(), true);
		action.getScreenShot(testCase);
		assertEquals(app.selectRecord(), true);
		action.getScreenShot(testCase);
		assertTrue(ewb.verifyEBN());
		action.getScreenShot(testCase);
		assertTrue(ewb.verifyEwbStatus(" Generated "));
		action.getScreenShot(testCase);
		assertEquals(ewb.navigateToDownloadReport(), true);
		action.getScreenShot(testCase);
		assertEquals(ewb.downloadReport(), true);
		action.getScreenShot(testCase);
		assertEquals(ewb.generateReports(), true);
		action.getScreenShot(testCase);
		// assertTrue(ewb.verifyReportDownload());

	}

	@Test(enabled = false, priority = 1)
	public static void consolidatedEWayBills() throws Throwable {
		testCase = "consolidatedEWayBills";
		assertEquals(app.navigate(TestData.orgName, TestData.tenant), true);
		action.getScreenShot(testCase);
		// assertEquals(app.searchApp("Outward E-Way Bills"), true);
		assertEquals(app.Apphomepage_1("Outward E-Way Bills"," enInvoice "), true);
		//assertEquals(app.Apphomepage("Outward E-Way Bills"), true);
		action.getScreenShot(testCase);
		// assertEquals(app.processNow(), true);
		// action.getScreenShot(testCase);
		ExcelDataDriver.WriteData("Document No", TestData.consolidatedEWBTestData);
		assertEquals(app.initiateProcess(TestData.consolidatedEWBTestData, "E-waybill-Inbound-1.03"), true);
		action.getScreenShot(testCase);
		assertEquals(app.viewRequest(), true);
		action.getScreenShot(testCase);
		assertEquals(app.selectRecord(), true);
		action.getScreenShot(testCase);
		assertTrue(ewb.verifyEBN());
		action.getScreenShot(testCase);
		assertTrue(ewb.verifyEwbStatus(" Generated "));
		action.getScreenShot(testCase);
		assertEquals(ewb.navigateToConsolidateReport(), true);
		action.getScreenShot(testCase);
		assertEquals(ewb.searchConsolidateReport(), true);
		action.getScreenShot(testCase);
		assertEquals(ewb.selectAllRecords(), true);
		action.getScreenShot(testCase);
		assertEquals(ewb.clickOnConsolidateNow(), true);
		action.getScreenShot(testCase);
		assertEquals(ewb.transportDetails(), true);
		action.getScreenShot(testCase);
		assertTrue(ewb.verifyConsolidationSuccessful());
		action.getScreenShot(testCase);
		assertEquals(app.selectRecord(), true);
		action.getScreenShot(testCase);
		assertEquals(app.refresh(), true);
		action.getScreenShot(testCase);
		assertTrue(ewb.verifyEwbStatus(" Generated "));
		action.getScreenShot(testCase);
		assertEquals(ewb.reportsDropdown(), true);
		action.getScreenShot(testCase);
		assertEquals(ewb.downloadCEWBInvoice(), true);
		action.getScreenShot(testCase);
		// assertTrue(ewb.verifyReportDownloadSuccessful());

	}

	@Test(enabled = false, priority = 2)
	public static void eWayBillErrorReport() throws Throwable {
		testCase = "eWayBillErrorReport";
		assertEquals(app.navigate(TestData.orgName, TestData.tenant), true);
		action.getScreenShot(testCase);
		// assertEquals(app.searchApp("Outward E-Way Bills"), true);
		// assertEquals(app.processNow(), true);
		//assertEquals(app.Apphomepage("Outward E-Way Bills"), true);
		assertEquals(app.Apphomepage_1("Outward E-Way Bills"," enInvoice "), true);
		action.getScreenShot(testCase);
		ExcelDataDriver.WriteData("Document No", TestData.eWBErrorReportTestData);
		action.getScreenShot(testCase);
		assertEquals(app.initiateProcess(TestData.eWBErrorReportTestData, "E-waybill-Inbound-1.03"), true);
		action.getScreenShot(testCase);
		assertEquals(app.viewRequest(), true);
		action.getScreenShot(testCase);
		assertEquals(app.selectRecord(), true);
		action.getScreenShot(testCase);
		assertTrue(ewb.verifyEBN());
		action.getScreenShot(testCase);
		assertTrue(ewb.verifyEwbStatus(" New or Inprogress "));
		action.getScreenShot(testCase);
		assertEquals(ewb.downloadErrorReport(), true);
		action.getScreenShot(testCase);
		assertEquals(ewb.downloadReport(), true);
		action.getScreenShot(testCase);
		assertTrue(ewb.verifyErrorReportMail());
		action.getScreenShot(testCase);

	}

	@Test(enabled = false, priority = 3)
	public static void jsonDownload() throws Throwable {
		testCase = "jsonDownload";
		assertEquals(app.navigate(TestData.orgName, TestData.tenant), true);
		action.getScreenShot(testCase);
		// assertEquals(app.searchApp("Outward E-Way Bills"), true);
		//assertEquals(app.Apphomepage("Outward E-Way Bills"), true);
		assertEquals(app.Apphomepage_1("Outward E-Way Bills"," enInvoice "), true);
		action.getScreenShot(testCase);
		assertEquals(ewb.selectRecordCheckbox(), true);
		action.getScreenShot(testCase);
		assertEquals(ewb.navigateToJsonDownload(), true);
		action.getScreenShot(testCase);

	}

}
