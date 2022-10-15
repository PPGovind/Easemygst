package com.easemygst.automation.pom;

import java.time.LocalDate;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.easemygst.automation.common.TaxillaCommon;
import com.easemygst.automation.core.TestActions;

public class OutwardEWayBills {
	private TestActions action = null;

	By RequestState = By.xpath("(//span[@title='In Progress'])[1]");
	By Close = By.xpath("//i[text()='close']");
	By waybill = By.xpath("(//span[text()=' E-Way Bill # '])[1]");
	By waybillNumber = By.xpath("(//span[@class='col-6 no-padding feedValue'])[1]");
	By waybillStatus = By.xpath("//div[text()=' E-Way Bill Status ']");
	By waybillGenerated = By.xpath("//div[text()=' Generated ']");
	By EBN_No = By.xpath("//div[text()=' EBN No: ']");
	By EBN_Number = By
			.xpath("//div[text()=' EBN No: ']//following::div[@class='col-7 no-padding ni_headerDetailValue']");
	By MoreActions = By.xpath("//i[text()=' more_vert ']");
	By DownloadReport = By.xpath("//button[text()='Download Report']");
	By DownloadConsolidate = By.xpath("//button[text()='Consolidate']");
	By ClickHereToGenerateReport = By.xpath("//span[text()='Click here to generate reports']");
	By CalendarFromDate = By.xpath("(//button[@type='button'])[1]");
	By CalendarToDate = By.xpath("(//button[@type='button'])[2]");
	By ChooseYear = By.xpath("//button[@aria-label='Choose month and year']//span[@class='mat-button-wrapper']");
	By Year2021 = By.xpath("//div[text()=' 2021 ']");
	By Year2019 = By.xpath("//div[text()=' " + java.time.LocalDate.now().getYear() + " ']");
	By MonthMay = By.xpath("//div[text()=' NOV ']");
	By Day = By.xpath("//div[text()=' " + java.time.LocalDate.now().getDayOfMonth() + " ']");
	By SelectReport = By.xpath("//span[text()=' Conslidated XSLX Report ']");
	By Submit = By.xpath("//span[text()=' Submit ']");
	By Search = By.xpath("//span[text()=' Search ']");
	By ReportsGeneratedSuccessfully = By
			.xpath("//div[text()=' Reports are being generated. To check the status refer to ']");
	By ReportsDownloadedSuccessfully = By
			.xpath("//div[text()='Report has been downloaded. To refer the same reports click']");
	By SelectExtension = By.xpath("(//span[text()='Select Extension'])[1]");
	By DownloadReports = By.xpath("//span[text()=' Download Reports ']");
	By Spinner = By.xpath("//img[@alt='Loading...']");
	By SelectAll = By.xpath("//span[text()=' Select All ']");
	By ConsolidateNow = By.xpath("//span[text()=' Consolidate Now ']");
	By VehicleNumber = By.xpath("//input[@name='vehicleNumber']");
	By ShipFromState = By.xpath("(//span[text()='Select State'])[1]");
	By SelectState = By.xpath("//span[text()=' Andhra Pradesh ']");
	By ShipFromPlace = By.xpath("//input[@name='cityElemName']");
	By Consolidate = By.xpath("//span[text()=' Consolidate ']");
	By ConsolidationSuccessful = By.xpath(
			"//div[text()=' Consolidate E-Way bill is generated. Please go to Consolidated E-Way bills section ']");
	By ReportsDropdown = By.xpath("//span[text()='Reports']");
	By CEWBInvoice = By.xpath("//*[text()=' cloud_download']");
	By ReportHasBeenDownloaded = By.xpath("//*[text()='Report has been downloaded']");
	By DownloadErrorReport = By.xpath("//button[text()='Download Error Report']");
	By Errorreportmailsentsuccessfully = By.xpath("//span[text()='Error report mail sent successfully']");
	By Checkbox = By.xpath("(//mat-checkbox[@name='checkEwb'])[3]");
	By JsonDownload = By.xpath("//button[text()='JSON Download']");
	By AllProcess = By.xpath("(//span[text()=' All Processes '])[1]");
	By ViewReports = By.xpath("//span[text()='View Reports']");
	By Reports = By.xpath("(//td[@title='Report Generated']/following::span[text()='Reports'])[1]");
	By ListOfReports = By.xpath("(//div[@role='menu']//div//span//span//a//mat-icon)");

	public OutwardEWayBills(TestActions action) {
		this.action = action;
	}

	public boolean selectRecordCheckbox() throws Throwable {
		action.waitFor(1);
		boolean passed = false;
		//passed = action.waitFor(AllProcess, 20, true);
		//passed = action.clickOn(AllProcess);
		passed = action.waitFor(Checkbox, 20, true);
		passed = action.clickOn(Checkbox);

		return passed;

	}

	public boolean reportsDropdown() throws Throwable {
		action.waitFor(1);
		boolean passed = false;
		passed = action.waitFor(ReportsDropdown, 20, true);
		passed = action.clickOn(ReportsDropdown);

		return passed;

	}

	public boolean downloadCEWBInvoice() throws Throwable {
		action.waitFor(1);
		boolean passed = false;
		passed = action.waitFor(CEWBInvoice, 20, true);
		passed = action.clickOn(CEWBInvoice);
		action.waitFor(3);
		action.refresh();

		return passed;

	}

	public boolean verifyReportDownloadSuccessful() throws Throwable {

		boolean passed = false;
		passed = action.waitFor(ReportHasBeenDownloaded, 20, true);
		passed = action.countOf(ReportHasBeenDownloaded) > 0;
		action.waitFor(2);

		return passed;

	}

	public boolean verifyErrorReportMail() throws Throwable {

		boolean passed = false;
		passed = action.waitFor(Errorreportmailsentsuccessfully, 20, true);
		passed = action.countOf(Errorreportmailsentsuccessfully) > 0;
		action.waitFor(2);

		return passed;

	}

	public boolean verifyEBN() throws Throwable {

		boolean passed = false;
		passed = action.waitFor(EBN_Number, 20, true);
		passed = action.countOf(EBN_Number) > 0;
		action.waitFor(2);

		return passed;

	}

	public boolean verifyEwbStatus(String status) throws Throwable {

		boolean passed = false;
		passed = action.waitFor(TaxillaCommon.eWBStatus(status), 20, true);
		passed = action.countOf(TaxillaCommon.eWBStatus(status)) > 0;
		action.waitFor(2);

		return passed;

	}

	public boolean navigateToDownloadReport() throws Throwable {
		action.waitFor(1);
		boolean passed = false;
		passed = action.waitFor(MoreActions, 20, true);
		passed = action.clickOn(MoreActions);
		passed = action.waitFor(DownloadReport, 20, true);
		passed = action.clickOn(DownloadReport);

		return passed;

	}

	public boolean navigateToConsolidateReport() throws Throwable {
		action.waitFor(1);
		boolean passed = false;
		passed = action.waitFor(MoreActions, 20, true);
		passed = action.clickOn(MoreActions);
		passed = action.waitFor(DownloadConsolidate, 20, true);
		passed = action.clickOn(DownloadConsolidate);

		return passed;

	}

	public boolean navigateToJsonDownload() throws Throwable {
		action.waitFor(1);
		boolean passed = false;
		passed = action.waitFor(MoreActions, 20, true);
		passed = action.clickOn(MoreActions);
		passed = action.waitFor(JsonDownload, 20, true);
		passed = action.clickOn(JsonDownload);

		return passed;

	}

	public boolean downloadErrorReport() throws Throwable {
		action.waitFor(1);
		boolean passed = false;
		passed = action.waitFor(MoreActions, 20, true);
		passed = action.clickOn(MoreActions);
		passed = action.waitFor(DownloadErrorReport, 20, true);
		passed = action.clickOn(DownloadErrorReport);

		return passed;

	}

	public boolean downloadReport() throws Throwable {
		action.waitFor(1);
		boolean passed = false;
		passed = action.waitFor(CalendarFromDate, 20, true);
		passed = action.clickOn(CalendarFromDate);
		passed = action.waitFor(ChooseYear, 20, true);
		passed = action.clickOn(ChooseYear);
		passed = action.waitFor(Year2021, 20, true);
		passed = action.clickOn(Year2021);
		passed = action.waitFor(MonthMay, 20, true);
		passed = action.clickOn(MonthMay);
		passed = action.waitFor(Day, 20, true);
		passed = action.clickOn(Day);
		passed = action.waitFor(CalendarToDate, 20, true);
		passed = action.clickOn(CalendarToDate);
		passed = action.waitFor(Day, 20, true);
		passed = action.clickOn(Day);
		passed = action.waitFor(Submit, 20, true);
		passed = action.clickOn(Submit);
		return passed;

	}

	public boolean searchConsolidateReport() throws Throwable {
		action.waitFor(1);
		boolean passed = false;
		passed = action.waitFor(CalendarFromDate, 20, true);
		passed = action.clickOn(CalendarFromDate);
		passed = action.waitFor(ChooseYear, 20, true);
		passed = action.clickOn(ChooseYear);
		passed = action.waitFor(Year2021, 20, true);
		passed = action.clickOn(Year2021);
		passed = action.waitFor(MonthMay, 20, true);
		passed = action.clickOn(MonthMay);
		passed = action.waitFor(Day, 20, true);
		passed = action.clickOn(Day);
		passed = action.waitFor(CalendarToDate, 20, true);
		passed = action.clickOn(CalendarToDate);
		passed = action.waitFor(Day, 20, true);
		passed = action.clickOn(Day);
		passed = action.waitFor(Search, 20, true);
		passed = action.clickOn(Search);
		return passed;

	}

	public boolean selectAllRecords() throws Throwable {
		action.waitFor(1);
		boolean passed = false;
		passed = action.waitFor(SelectAll, 20, true);
		passed = action.clickOn(SelectAll);
		return passed;

	}

	public boolean clickOnConsolidateNow() throws Throwable {
		action.waitFor(1);
		boolean passed = false;
		action.scrollIntoElement(ConsolidateNow);
		passed = action.waitFor(ConsolidateNow, 20, true);
		passed = action.clickOn(ConsolidateNow);
		return passed;

	}

	public boolean transportDetails() throws Throwable {
		action.waitFor(1);
		boolean passed = false;
		passed = action.waitFor(VehicleNumber, 20, true);
		passed = action.sendDataTo(VehicleNumber, "AP39CC7832");
		passed = action.waitFor(ShipFromState, 20, true);
		passed = action.clickOn(ShipFromState);
		passed = action.waitFor(SelectState, 20, true);
		passed = action.clickOn(SelectState);
		passed = action.waitFor(ShipFromPlace, 20, true);
		passed = action.sendDataTo(ShipFromPlace, "Vishakapatnam");
		passed = action.waitFor(Consolidate, 20, true);
		passed = action.clickOn(Consolidate);
		return passed;

	}

	public boolean verifyConsolidationSuccessful() throws Throwable {

		boolean passed = false;
		passed = action.waitFor(ConsolidationSuccessful, 20, true);
		passed = action.countOf(ConsolidationSuccessful) > 0;
		passed = action.waitFor(Close, 20, true);
		passed = action.clickOn(Close);
		action.waitFor(2);

		return passed;

	}

	public boolean generateReports() throws Throwable {
		action.waitFor(1);
		boolean passed = false;
		passed = action.waitFor(ClickHereToGenerateReport, 20, true);
		if (action.countOf(ClickHereToGenerateReport) > 0) {
			passed = action.clickOn(ClickHereToGenerateReport);
		}
		passed = action.waitFor(SelectExtension, 20, true);
		if (action.countOf(SelectExtension) > 0) {
			passed = action.clickOn(SelectExtension);
		}
		passed = action.waitFor(SelectReport, 20, true);
		if (action.countOf(SelectReport) > 0) {
			passed = action.clickOn(SelectReport);
		}
		passed = action.waitFor(DownloadReports, 20, true);
		if (action.countOf(DownloadReports) > 0) {
			passed = action.clickOn(DownloadReports);

		}
		passed = action.waitFor(ViewReports, 20, true);
		if (action.countOf(ViewReports) > 0) {
			passed = action.clickOn(ViewReports);
		}
		passed = action.waitFor(Reports, 20, true);
		if (action.countOf(Reports) > 0) {
			passed = action.clickOn(Reports);
		}
		action.waitFor(3);
		for (int i = 1; i <= action.getElementsize(ListOfReports); i++) {
			passed = action.waitFor(TaxillaCommon.ReportDownload(i), 20, true);
			passed = action.clickOn(TaxillaCommon.ReportDownload(i));

		}
		action.waitFor(3);
		action.refresh();

		return passed;

	}
	
	public boolean verifyReportDownload() throws Throwable {

		boolean passed = false;
		passed = action.waitFor(ReportsDownloadedSuccessfully, 20, true);
		passed = action.countOf(ReportsDownloadedSuccessfully) > 0;
		action.waitFor(2);

		return passed;

	}

}
