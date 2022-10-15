package com.easemygst.automation.pom;

import org.openqa.selenium.By;

import com.easemygst.automation.common.TaxillaCommon;
import com.easemygst.automation.core.TestActions;

public class SearchFunctionality {
	private TestActions action = null;

	By EWayBillStatus = By.xpath("//span[text()=' E-Way Bill Status ']");
	By ListOfStatus = By.xpath("(//div[@role='listbox']//mat-option//span)");
	By ListOfRecords = By.xpath("//div[@class='invoiceFeedItem_details row']");
	By EwayBillGenerated = By.xpath("//span[text()=' Generated ']");
	By EwayBillRejected = By.xpath("//span[text()=' Rejected ']");
	By EwayBillClosed = By.xpath("//span[text()=' Closed ']");
	By EwayBillCancelled = By.xpath("//span[text()=' Cancelled ']");
	By EwayBillUpdated = By.xpath("//span[text()=' Updated ']");
	By EwayBillExtended = By.xpath("//span[text()=' Extended ']");
	By BillStatus = By.xpath("(//div[@class='ni_headerStatusValue'])[1]");
	By EwayBillNeworinprogress = By.xpath("//span[text()=' New or Inprogress ']");
	By PostexecutedApiCompleted = By.xpath("//span[text()=' Post-excute E-waybill Api Completed ']");
	By PreexecutedApiCompleted = By.xpath("//span[text()=' Pre-excute E-waybill Api Completed ']");
	By updatedCancelGenerate = By.xpath("//span[text()=' Update Cancel Eway Bill:generate ']");
	By updatedCancelTerminated = By.xpath("//span[text()=' Update Cancel Eway Bill Terminated ']");
	By requestCancelled = By.xpath("//span[text()=' Request Cancelled ']");
	By SupplyType = By.xpath("//span[text()='Supply Type']");
	By Equal = By.xpath("//span[text()=' EQ ']");
	By Entervalue = By.xpath("//input[@data-placeholder='Enter value']");
	By waybillNumber = By.xpath("(//span[@class='col-6 no-padding feedValue'])[1]");
	By supplierName = By.xpath("//span[contains(text(),' Supplier Name ')]");
	By Ascending = By.xpath("//span[contains(text(),'Ascending')]");
	By isbulkreport = By.xpath("//span[@class='bulkReportCheckBoxCls']");
	By SelectTransformation = By.xpath("(//span[contains(text(),'Select Transformation')])[1]");
	By bulkreports = By.xpath("(//span[@class='mat-option-text'])");
	By Viewreports = By.xpath("//span[text()=' View Reports ']");
	By Background = By.xpath("//body[@class='enInvoiceMainContainer']");
	By Refresh = By.xpath("//mat-icon[text()='refresh']");
	By reportstatus = By.xpath("(//tbody//tr//td[text()=' Report Generated '])[1]");
	By newreport = By.xpath("(//tbody//tr//td)[2]");
	By pending = By.xpath("(//td[text()=' Pending '])[1]");
	By downloadlink = By.xpath("(//span[text()='CEWB-Report(XSLX)'])[1]");
	By sucessmessage = By.xpath("//span[text()='Report has been downloaded']");
	By close = By.xpath("//i[text()='close']");
	By Filtermessage = By.xpath("//span[text()='General Details has been updated']");
	By Selectfilters = By.xpath("(//span[@class='mat-option-text'])[2]");
	By FromDate = By.xpath("//div[text()=' 1 ']");
	By ToDate = By.xpath("//div[text()=' 21 ']");
	By CalendarFromDate = By.xpath("(//button[@type='button'])[1]");
	By CalendarToDate = By.xpath("(//button[@type='button'])[3]");
	By StartTime = By.xpath("(//button[@type='button'])[2]");
	By EndTime = By.xpath("(//button[@type='button'])[4]");
	By Ok = By.xpath("//span[text()='Ok']");
	By cewbreport = By.xpath("//span[text()=' CEWB-Report(XSLX) ']");

	public SearchFunctionality(TestActions action) {
		this.action = action;
	}

	public boolean clear() throws Throwable {
		action.waitFor(3);
		boolean passed = false;
		passed = action.waitFor(TaxillaCommon.Search.Clear, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.Clear);
		action.waitFor(3);
		return passed;

	}

	public boolean filters() throws Throwable {
		action.waitFor(1);
		boolean passed = false;
		passed = action.waitFor(TaxillaCommon.Search.Filters, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.Filters);
		return passed;

	}

	public boolean ewbBillStatus() throws Throwable {
		action.waitFor(1);
		boolean passed = false;
		passed = action.waitFor(EWayBillStatus, 20, true);
		passed = action.clickOn(EWayBillStatus);
		return passed;
	}

	public boolean verifyEWBGenerated(String status) throws Throwable {
		action.waitFor(2);
		boolean passed = false;
		passed = action.waitFor(TaxillaCommon.Search.SelectStatus, 20, true);
		action.waitFor(1);
		passed = action.clickOn(TaxillaCommon.Search.SelectStatus);
		passed = action.waitFor(EwayBillGenerated, 20, true);
		passed = action.clickOn(EwayBillGenerated);
		action.waitFor(1);

		for (int i = 1; i <= action.getElementsize(ListOfRecords); i++) {

			passed = action.waitFor(TaxillaCommon.selectListOfRecords(i), 20, true);
			passed = action.clickOn(TaxillaCommon.selectListOfRecords(i));
			passed = action.isTextAvailable(status);
		}

		return passed;
	}

	public boolean verifyEWBRejected(String status) throws Throwable {
		action.waitFor(3);
		boolean passed = false;
		passed = action.waitFor(TaxillaCommon.Search.SelectStatus, 20, true);
		action.waitFor(1);
		passed = action.clickOn(TaxillaCommon.Search.SelectStatus);
		passed = action.waitFor(EwayBillRejected, 20, true);
		passed = action.clickOn(EwayBillRejected);
		action.waitFor(1);

		for (int i = 1; i <= action.getElementsize(ListOfRecords); i++) {

			passed = action.waitFor(TaxillaCommon.selectListOfRecords(i), 20, true);
			passed = action.countOf(TaxillaCommon.selectListOfRecords(i)) > 0;

		}

		return passed;
	}

	/*
	 * public boolean verifyEWBClosed() throws Throwable { action.waitFor(3);
	 * boolean passed = true; passed =
	 * action.waitFor(TaxillaCommon.Search.SelectStatus, 20, true);
	 * action.waitFor(1); passed =
	 * action.clickOn(TaxillaCommon.Search.SelectStatus); passed =
	 * action.waitFor(EwayBillClosed, 20, true); passed =
	 * action.clickOn(EwayBillClosed); action.waitFor(1);
	 * 
	 * for (int i = 1; i <= action.getElementsize(ListOfRecords); i++) {
	 * 
	 * passed = action.waitFor(TaxillaCommon.selectListOfRecords(i), 20, true);
	 * passed = action.countOf(TaxillaCommon.selectListOfRecords(i)) > 0;
	 * 
	 * }
	 * 
	 * return passed; }
	 */
	public boolean verifyEWBCancelled(String status) throws Throwable {
		action.waitFor(2);
		boolean passed = false;
		passed = action.waitFor(TaxillaCommon.Search.SelectStatus, 20, true);
		action.waitFor(1);
		passed = action.clickOn(TaxillaCommon.Search.SelectStatus);
		passed = action.waitFor(EwayBillCancelled, 20, true);
		passed = action.clickOn(EwayBillCancelled);
		action.waitFor(1);

		for (int i = 1; i <= action.getElementsize(ListOfRecords); i++) {

			passed = action.waitFor(TaxillaCommon.selectListOfRecords(i), 20, true);
			passed = action.clickOn(TaxillaCommon.selectListOfRecords(i));
			passed = action.isTextAvailable(status);
		}

		return passed;
	}

	public boolean verifyEWBUpdated(String status) throws Throwable {
		action.waitFor(2);
		boolean passed = false;
		passed = action.waitFor(TaxillaCommon.Search.SelectStatus, 20, true);
		action.waitFor(1);
		passed = action.clickOn(TaxillaCommon.Search.SelectStatus);
		passed = action.waitFor(EwayBillUpdated, 20, true);
		passed = action.clickOn(EwayBillUpdated);
		action.waitFor(1);

		for (int i = 1; i <= action.getElementsize(ListOfRecords); i++) {

			passed = action.waitFor(TaxillaCommon.selectListOfRecords(i), 20, true);
			passed = action.clickOn(TaxillaCommon.selectListOfRecords(i));
			passed = action.isTextAvailable(status);
		}

		return passed;
	}

	public boolean verifyEWBExtended(String status) throws Throwable {
		action.waitFor(2);
		boolean passed = false;
		passed = action.waitFor(TaxillaCommon.Search.SelectStatus, 20, true);
		action.waitFor(1);
		passed = action.clickOn(TaxillaCommon.Search.SelectStatus);
		passed = action.waitFor(EwayBillExtended, 20, true);
		passed = action.clickOn(EwayBillExtended);
		action.waitFor(1);

		for (int i = 1; i <= action.getElementsize(ListOfRecords); i++) {

			passed = action.waitFor(TaxillaCommon.selectListOfRecords(i), 20, true);
			passed = action.clickOn(TaxillaCommon.selectListOfRecords(i));
			passed = action.isTextAvailable(status);
		}

		return passed;
	}

	public boolean verifyEWBNeworInprogress(String status) throws Throwable {
		action.waitFor(2);
		boolean passed = false;
		passed = action.waitFor(TaxillaCommon.Search.SelectStatus, 20, true);
		action.waitFor(1);
		passed = action.clickOn(TaxillaCommon.Search.SelectStatus);
		passed = action.waitFor(EwayBillNeworinprogress, 20, true);
		passed = action.clickOn(EwayBillNeworinprogress);
		action.waitFor(1);

		for (int i = 1; i <= action.getElementsize(ListOfRecords); i++) {

			passed = action.waitFor(TaxillaCommon.selectListOfRecords(i), 20, true);
			passed = action.clickOn(TaxillaCommon.selectListOfRecords(i));
			passed = action.isTextAvailable(status);
		}

		return passed;
	}

	public boolean processStatuses() throws Throwable {
		action.waitFor(1);
		boolean passed = false;
		passed = action.waitFor(TaxillaCommon.Search.processStatuses, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.processStatuses);
		return passed;
	}

	public boolean verifyPostexecutedApiCompleted() throws Throwable {
		action.waitFor(2);
		boolean passed = false;
		passed = action.waitFor(TaxillaCommon.Search.SelectStatus, 20, true);
		action.waitFor(1);
		passed = action.clickOn(TaxillaCommon.Search.SelectStatus);
		passed = action.waitFor(PostexecutedApiCompleted, 20, true);
		passed = action.clickOn(PostexecutedApiCompleted);
		passed = action.waitFor(TaxillaCommon.Search.ApplyFilter, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.ApplyFilter);
		action.waitFor(1);

		for (int i = 1; i <= action.getElementsize(ListOfRecords); i++) {

			passed = action.waitFor(TaxillaCommon.selectListOfRecords(i), 20, true);
			passed = action.clickOn(TaxillaCommon.selectListOfRecords(i));

			if ((action.countOf(EwayBillExtended) > 0) || (action.countOf(EwayBillGenerated) > 0)) {
				action.waitFor(5);
				passed = action.countOf(BillStatus) > 0;
			}

		}

		return passed;
	}

	public boolean verifyPreexecutedApiCompleted(String status) throws Throwable {
		action.waitFor(2);
		boolean passed = false;
		passed = action.waitFor(TaxillaCommon.Search.SelectStatus, 20, true);
		action.waitFor(1);
		passed = action.clickOn(TaxillaCommon.Search.SelectStatus);
		passed = action.waitFor(PreexecutedApiCompleted, 20, true);
		passed = action.clickOn(PreexecutedApiCompleted);
		passed = action.waitFor(TaxillaCommon.Search.ApplyFilter, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.ApplyFilter);
		action.waitFor(1);

		for (int i = 1; i <= action.getElementsize(ListOfRecords); i++) {

			passed = action.waitFor(TaxillaCommon.selectListOfRecords(i), 20, true);
			passed = action.clickOn(TaxillaCommon.selectListOfRecords(i));
			passed = action.isTextAvailable(status);
		}

		return passed;
	}

	public boolean verifyUpdateCancelGenerate(String status) throws Throwable {
		action.waitFor(2);
		boolean passed = false;
		passed = action.waitFor(TaxillaCommon.Search.SelectStatus, 20, true);
		action.waitFor(1);
		passed = action.clickOn(TaxillaCommon.Search.SelectStatus);
		passed = action.waitFor(updatedCancelGenerate, 20, true);
		passed = action.clickOn(updatedCancelGenerate);
		passed = action.waitFor(TaxillaCommon.Search.ApplyFilter, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.ApplyFilter);
		action.waitFor(1);

		for (int i = 1; i <= action.getElementsize(ListOfRecords); i++) {

			passed = action.waitFor(TaxillaCommon.selectListOfRecords(i), 20, true);
			passed = action.clickOn(TaxillaCommon.selectListOfRecords(i));
			passed = action.isTextAvailable(status);
		}

		return passed;
	}

	public boolean verifyUpdateCancelTerminated(String status) throws Throwable {
		action.waitFor(2);
		boolean passed = false;
		passed = action.waitFor(TaxillaCommon.Search.SelectStatus, 20, true);
		action.waitFor(1);
		passed = action.clickOn(TaxillaCommon.Search.SelectStatus);
		passed = action.waitFor(updatedCancelTerminated, 20, true);
		passed = action.clickOn(updatedCancelTerminated);
		passed = action.waitFor(TaxillaCommon.Search.ApplyFilter, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.ApplyFilter);
		action.waitFor(1);

		for (int i = 1; i <= action.getElementsize(ListOfRecords); i++) {

			passed = action.waitFor(TaxillaCommon.selectListOfRecords(i), 20, true);
			passed = action.clickOn(TaxillaCommon.selectListOfRecords(i));
			passed = action.isTextAvailable(status);
		}

		return passed;
	}

	public boolean verifyRequestCancelled(String status) throws Throwable {
		action.waitFor(2);
		boolean passed = false;
		passed = action.waitFor(TaxillaCommon.Search.SelectStatus, 20, true);
		action.waitFor(1);
		passed = action.clickOn(TaxillaCommon.Search.SelectStatus);
		passed = action.waitFor(requestCancelled, 20, true);
		passed = action.clickOn(requestCancelled);
		passed = action.waitFor(TaxillaCommon.Search.ApplyFilter, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.ApplyFilter);
		action.waitFor(1);

		for (int i = 1; i <= action.getElementsize(ListOfRecords); i++) {

			passed = action.waitFor(TaxillaCommon.selectListOfRecords(i), 20, true);
			passed = action.clickOn(TaxillaCommon.selectListOfRecords(i));
			passed = action.isTextAvailable(status);
		}

		return passed;
	}

	public boolean customSearch() throws Throwable {
		action.waitFor(1);
		boolean passed = false;
		passed = action.waitFor(TaxillaCommon.Search.customSearch, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.customSearch);
		passed = action.waitFor(TaxillaCommon.Search.AddSearchcriteria, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.AddSearchcriteria);
		passed = action.waitFor(Entervalue, 20, true);
		passed = action.sendDataTo(Entervalue, "Outward");
		passed = action.waitFor(TaxillaCommon.Search.Addsearchcriteriasort, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.Addsearchcriteriasort);
		passed = action.waitFor(TaxillaCommon.Search.PleaseSelectOne3, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.PleaseSelectOne3);
		action.scrollIntoElement(supplierName);
		passed = action.waitFor(supplierName, 20, true);
		passed = action.clickOn(supplierName);
		passed = action.waitFor(TaxillaCommon.Search.PleaseSelectOne4, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.PleaseSelectOne4);
		action.scrollIntoElement(Ascending);
		passed = action.waitFor(Ascending, 20, true);
		passed = action.clickOn(Ascending);
		// passed = action.waitFor(TaxillaCommon.Search.Filters, 20, true);
		// passed = action.clickOn(TaxillaCommon.Search.Filters);
		passed = action.waitFor(TaxillaCommon.Search.Download, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.Download);
//		passed = action.waitFor(isbulkreport, 20, true);
//		passed = action.clickOn(isbulkreport);
		passed = action.waitFor(SelectTransformation, 20, true);
		passed = action.clickOn(SelectTransformation);
//		action.waitFor(3);
//
//		for (int i = 1; i <= action.getElementsize(bulkreports); i++) {
//
//			passed = action.waitFor(TaxillaCommon.selectListOfbulkRecords(i), 20, true);
//			passed = action.clickOn(TaxillaCommon.selectListOfbulkRecords(i));
//
//		}

//		passed = action.clickOn(Background);
		passed = action.waitFor(cewbreport, 20, true);
		passed = action.clickOn(cewbreport);
		passed = action.waitFor(TaxillaCommon.Search.Initiate, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.Initiate);
//		passed = action.waitFor(TaxillaCommon.Search.Download, 20, true);
//		passed = action.clickOn(TaxillaCommon.Search.Download);
		passed = action.waitFor(Viewreports, 20, true);
		passed = action.clickOn(Viewreports);
        return passed;
	}

	public boolean verifyreportstatus() throws Throwable {
		action.waitFor(1);
		boolean passed = false;
		while (action.countOf(pending) == 1) {
			action.waitFor(2);
			passed = action.clickOn(Refresh);
			action.waitFor(5);
		}
		passed = action.waitFor(reportstatus, 20, true);
		passed = action.countOf(reportstatus) > 0;

		return passed;

	}

	public boolean downloadsucessmessage() throws Throwable {

		boolean passed = false;
		passed = action.waitFor(downloadlink, 20, true);
		passed = action.clickOn(downloadlink);
		passed = action.waitFor(sucessmessage, 20, true);
		passed = action.countOf(sucessmessage) > 0;
		action.waitFor(2);
		passed = action.waitFor(close, 20, true);
		passed = action.clickOn(close);
		passed = action.waitFor(close, 20, true);
		passed = action.clickOn(close);

		return passed;

	}

	public boolean Searchfilters() throws Throwable {
		action.waitFor(1);
		boolean passed = false;
		passed = action.waitFor(TaxillaCommon.Search.customSearch, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.customSearch);
		passed = action.waitFor(TaxillaCommon.Search.AddSearchcriteria, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.AddSearchcriteria);
		passed = action.waitFor(Entervalue, 20, true);
		passed = action.sendDataTo(Entervalue, "Outward");
		passed = action.waitFor(TaxillaCommon.Search.Addsearchcriteriasort, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.Addsearchcriteriasort);
		passed = action.waitFor(TaxillaCommon.Search.PleaseSelectOne3, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.PleaseSelectOne3);
		action.scrollIntoElement(supplierName);
		passed = action.waitFor(supplierName, 20, true);
		passed = action.clickOn(supplierName);
		passed = action.waitFor(TaxillaCommon.Search.PleaseSelectOne4, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.PleaseSelectOne4);
		action.scrollIntoElement(Ascending);
		passed = action.waitFor(Ascending, 20, true);
		passed = action.clickOn(Ascending);
		passed = action.waitFor(TaxillaCommon.Search.SaveFilterButton, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.SaveFilterButton);
		passed = action.waitFor(TaxillaCommon.Search.EnterFilterName, 20, true);
		passed = action.sendDataTo(TaxillaCommon.Search.EnterFilterName, "T1");
		passed = action.waitFor(TaxillaCommon.Search.SaveAndSearch, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.SaveAndSearch);
		passed = action.waitFor(Filtermessage, 20, true);
		passed = action.countOf(Filtermessage) > 0;
		passed = action.waitFor(TaxillaCommon.Search.Clear, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.Clear);

		return passed;
	}

	public boolean filterdownload() throws Throwable {
		action.waitFor(1);
		boolean passed = true;
		passed = action.waitFor(TaxillaCommon.Search.SearchFilters, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.SearchFilters);
		passed = action.waitFor(TaxillaCommon.Search.PleaseSelectOne1, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.PleaseSelectOne1);
		passed = action.waitFor(Selectfilters, 20, true);
		passed = action.clickOn(Selectfilters);
		passed = action.waitFor(TaxillaCommon.Search.ApplyFilter, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.ApplyFilter);
		passed = action.waitFor(TaxillaCommon.Search.Clear, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.Clear);

		return passed;
	}

	public boolean filterByDate() throws Throwable {
		action.waitFor(1);
		boolean passed = true;
		passed = action.waitFor(TaxillaCommon.Search.FilterByDate, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.FilterByDate);
		passed = action.waitFor(CalendarFromDate, 20, true);
		passed = action.clickOn(CalendarFromDate);
		passed = action.waitFor(FromDate, 20, true);
		passed = action.clickOn(FromDate);
		passed = action.waitFor(StartTime, 20, true);
		passed = action.clickOn(StartTime);
		passed = action.waitFor(Ok, 20, true);
		passed = action.clickOn(Ok);
		passed = action.waitFor(CalendarToDate, 20, true);
		passed = action.clickOn(CalendarToDate);
		passed = action.waitFor(ToDate, 20, true);
		passed = action.clickOn(ToDate);
		passed = action.waitFor(EndTime, 20, true);
		passed = action.clickOn(EndTime);
		passed = action.waitFor(Ok, 20, true);
		passed = action.clickOn(Ok);
		passed = action.waitFor(TaxillaCommon.Search.Apply, 20, true);
		passed = action.clickOn(TaxillaCommon.Search.Apply);
		return passed;
	}

}
