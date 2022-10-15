package com.easemygst.automation.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.easemygst.automation.common.TaxillaCommon;
import com.easemygst.automation.core.TestActions;

public class Apps {

	private TestActions action = null;

	By SelectApp = By.xpath("//span[@class='appDisplayName']");
	By ProcessNow = By.xpath("//button[@title='Process Now']");
	By AllProcesses = By.xpath("//button[@title='All Processes']");
	By SelectTransformation = By.xpath("//div[text()=' File Upload ']//following::span[1]");
	By SearchTransformation = By
			.xpath("//em[text()='--Please select--']//following::input[@data-placeholder='Search']");
	By SelectTransformationDropdown = By
			.xpath("//mat-option[@class='mat-option mat-focus-indicator ng-star-inserted']");
	By ChooseFile = By.xpath("//span[text()='Choose File']");
	By InitiateProcess = By.xpath("(//span[text()=' Initiate Process '])[1]");
	By View = By.xpath("(//*[text()='visibility'])[1]");
	By SelectFirstRecord = By.xpath("(//div[@class='feedMainDiv'])[1]");
	By Refresh = By.xpath("//i[text()='refresh']");
	By RequestLogRefresh = By.xpath("//mat-icon[text()='refresh']");
	By Refresh2 = By.xpath("//i[@title='Click here to get latest data']");
	By verticaldots = By.xpath("//mat-icon[text()='more_vert']");
	By Appcategory = By.xpath("//span[text()=' enInvoice ']");
	By Apphome = By.xpath("//span[text()='App Home']");
	By RequestState = By.xpath("//tbody//tr[1]//td[5]//span[text()=' Request Completed ']");
	By RequestTerminated = By.xpath("//tbody//tr[1]//td[5]//span[text()=' Terminated ']");
	By RequestInprogress = By.xpath("//tbody//tr[1]//td[5]//span[text()=' In Progress ']");

	public Apps(TestActions action) {
		this.action = action;
	}

	public boolean navigate(String orgName, String tenant) {

		boolean passed = false;
		action.waitFor(2);
		passed = action.waitFor(TaxillaCommon.LevelOne.Org, 40, true);
		passed = action.clickOn(TaxillaCommon.LevelOne.Org);
		passed = action.waitFor(TaxillaCommon.LevelOne.SearchOrg, 40, true);
		passed = action.sendDataTo(TaxillaCommon.LevelOne.SearchOrg, orgName);
		passed = action.Backspace(TaxillaCommon.LevelOne.SearchOrg);
		passed = action.clickOn(TaxillaCommon.switchOrganization(orgName));
		passed = action.waitFor(TaxillaCommon.LevelOne.SearchTenant, 40, true);
		passed = action.sendDataTo(TaxillaCommon.LevelOne.SearchTenant, tenant);
		passed = action.Backspace(TaxillaCommon.LevelOne.SearchTenant);
		passed = action.clickOn(TaxillaCommon.switchTenant(tenant));
		passed = action.waitFor(TaxillaCommon.LevelOne.Apps, 40, true);
		passed = action.clickOn(TaxillaCommon.LevelOne.Apps);
		return passed;

	}

	public boolean searchApp(String appName) {
		boolean passed = false;

		passed = action.waitFor(TaxillaCommon.LevelOne.SearchApp, 40, true);
		passed = action.sendDataTo(TaxillaCommon.LevelOne.SearchApp, appName);
		action.waitFor(5);

		passed = action.waitFor(SelectApp, 20, true);
		passed = action.clickOn(SelectApp);

		return passed;
	}

	public boolean Apphomepage(String appName, String appcategory) {

		boolean passed = false;
		passed = action.waitFor(Appcategory, 20, true);
		passed = action.clickOn(Appcategory);
		action.waitFor(5);
		passed = action.waitFor(TaxillaCommon.LevelOne.SearchApp, 40, true);
		passed = action.sendDataTo(TaxillaCommon.LevelOne.SearchApp, appName);
		action.waitFor(5);
		passed = action.waitFor(verticaldots, 20, true);
		passed = action.clickOn(verticaldots);
		action.waitFor(5);
		passed = action.waitFor(AllProcesses, 20, true);
		passed = action.clickOn(AllProcesses);

		return passed;

	}

	public boolean Apphomepage_1(String appName, String appcategory) {

		boolean passed = false;
		passed = action.waitFor(Appcategory, 20, true);
		passed = action.clickOn(Appcategory);
		action.waitFor(5);
		passed = action.waitFor(TaxillaCommon.LevelOne.SearchApp, 40, true);
		passed = action.sendDataTo(TaxillaCommon.LevelOne.SearchApp, appName);
		action.waitFor(5);
		passed = action.waitFor(verticaldots, 20, true);
		passed = action.clickOn(verticaldots);
		action.waitFor(5);
		passed = action.waitFor(ProcessNow, 20, true);
		passed = action.clickOn(ProcessNow);

		return passed;

	}

	public boolean processNow() {

		boolean passed = false;
		action.waitFor(1);
		passed = action.waitFor(ProcessNow, 20, true);
		passed = action.clickOn(ProcessNow);

		return passed;

	}

	public boolean allProcesses() {

		boolean passed = false;
		action.waitFor(1);
		passed = action.waitFor(AllProcesses, 20, false);
		passed = action.clickOn(AllProcesses);

		return passed;

	}

	public boolean initiateProcess(String filename, String transformation) throws Throwable {
		action.waitFor(1);
		boolean passed = false;
		passed = action.waitFor(SelectTransformation, 20, true);
		passed = action.clickOn(SelectTransformation);
		passed = action.waitFor(SearchTransformation, 20, true);
		passed = action.sendDataTo(SearchTransformation, transformation);
		passed = action.waitFor(SelectTransformationDropdown, 20, true);
		passed = action.clickOn(SelectTransformationDropdown);
		passed = action.waitFor(ChooseFile, 20, true);
		passed = action.waitForClickable(ChooseFile, 20);
		passed = action.clickOn(ChooseFile);
		passed = action.uploadFile(filename);
		passed = action.waitFor(InitiateProcess, 20, true);
		passed = action.clickOn(InitiateProcess);
		action.waitFor(2);

		return passed;

	}

	public boolean viewRequest() throws Throwable {
		action.waitFor(1);
		boolean passed = false;
		passed = action.waitFor(View, 20, true);
		passed = action.clickOn(View);

		return passed;

	}

	public boolean selectRecord() throws Throwable {
		action.waitFor(1);
		boolean passed = false;
		passed = action.waitFor(Refresh, 20, true);
		while (action.countOf(SelectFirstRecord) == 0) {
			passed = action.clickOn(Refresh);
			action.waitFor(3);
		}
		passed = action.waitFor(SelectFirstRecord, 20, true);
		passed = action.clickOn(SelectFirstRecord);

		return passed;

	}

	public boolean selectRequestLogs() throws Throwable {
		action.waitFor(1);
		boolean passed = false;
		passed = action.waitFor(TaxillaCommon.LevelOne.RequestLogs, 20, true);
		passed = action.clickOn(TaxillaCommon.LevelOne.RequestLogs);

		return passed;

	}

	public boolean requestState() throws Throwable {
		action.waitFor(1);
		boolean passed = false;
		passed = action.waitFor(RequestLogRefresh, 20, true);
		passed = action.clickOn(RequestLogRefresh);
		while ((action.countOf(RequestState) == 0) && (action.countOf(RequestTerminated) == 0)) {
			action.waitFor(5);
			passed = action.clickOn(RequestLogRefresh);
			action.waitFor(5);
		}
		passed = action.waitFor(RequestState, 20, true);
		passed = action.countOf(RequestState) > 0;

		return passed;

	}

	public boolean refresh() throws Throwable {
		action.waitFor(1);
		boolean passed = false;
		passed = action.waitFor(Refresh2, 20, true);
		passed = action.clickOn(Refresh2);
		return passed;

	}

	public boolean outwardRequestState() throws Throwable {
		action.waitFor(1);
		boolean passed = false;
		passed = action.waitFor(RequestLogRefresh, 20, true);
		passed = action.clickOn(RequestLogRefresh);
		/*
		 * while ((action.countOf(RequestState) == 0) &&
		 * (action.countOf(RequestTerminated) == 0)) { action.waitFor(5); passed =
		 * action.clickOn(RequestLogRefresh); action.waitFor(5); }
		 */
		passed = action.waitFor(RequestInprogress, 20, true);
		passed = action.countOf(RequestInprogress) > 0;

		return passed;

	}
}
