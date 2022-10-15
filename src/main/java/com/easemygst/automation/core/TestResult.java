package com.easemygst.automation.core;

import org.testng.ITestResult;
import com.easemygst.automation.core.ReportGenerator;
import com.easemygst.automation.core.TestActions;

public class TestResult {
	/***
	 * Variable to store Test Status
	 */
	static String testStatus;

	/***
	 * Method called on afterMethod of each test class to generate result and create
	 * document.
	 * 
	 * @param testCase
	 *            The testCase name, based on which report will be generated.
	 * @param result
	 *            The Object of ITestResult, based on which the Test Result will be
	 *            processed.
	 */
	public static void processTestResult(String testCase, ITestResult result) {
		ReportGenerator.generateReport(testCase);
		testStatus = result.getStatus() == ITestResult.SUCCESS ? "PASSED" : "FAILED";

		TestActions.log("Test Status : " + testStatus);
		TestActions.log("*****COMPLETED '" + testCase + "' EXECUTION***** \n");
	}

}
