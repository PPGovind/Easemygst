package com.easemygst.automation.common;

import org.openqa.selenium.By;

public class TaxillaCommon {

	public static class LevelOne {
		public static final By Home = By.xpath("//*[text()=' Sign In ']");
		public static final By AppHomeIcon = By.xpath("//mat-icon[text()=' home ']");
		public static final By Org = By.xpath("//img[@alt='enComply']//following::img[1]");
		public static final By Apps = By.xpath("//img[@alt='enComply']//following::img[2]");
		public static final By SearchApp = By.xpath("//input[@data-placeholder='Search App']");
		public static final By SwitchUI = By.xpath("//img[@alt='enComply']//following::img[3]");
		public static final By Dashboard = By.xpath("//span[text()='Dashboard']");
		public static final By Settings = By.xpath("//img[@alt='enComply']//following::img[4]");
		public static final By WorkQ = By.xpath("//span[@class='btnDisplayText'][text()='WorkQ ']");
		public static final By RequestLogs = By.xpath("//img[@alt='Request Logs']");
		public static final By SearchOrg = By.xpath("//input[@data-placeholder='Search Organization']");
		public static final By SearchTenant = By.xpath("//input[@data-placeholder='Search tenant']");

	}

	public static class Home {

		public static final By SearchApps = By.xpath("//input[@data-placeholder='Search Apps']");
		public static final By Filters = By.xpath("//span[text()='Filters']");

	}

	public static class Search {
		public static final By Filters = By.xpath("//span[text()='Filters']");
		public static final By SearchFilters = By.xpath("//span[text()=' Search Filters ']");
		public static final By processStatuses = By.xpath("//span[text()=' Process Statuses ']");
		public static final By customSearch = By.xpath("//span[text()=' Custom Search ']");
		public static final By FilterByDate = By.xpath("//span[text()=' Filter By Date ']");
		public static final By ApplyFilter = By.xpath("//span[text()=' Apply Filter ']");
		public static final By ClearFilter = By.xpath("//span[text()='Clear Filters']");
		public static final By Clear = By.xpath("//span[text()='Clear']");
		public static final By CloseFilter = By.xpath("//div[@title='Close Filters']");
		public static final By Rules = By.xpath("//div[text()='Rules']");
		public static final By AddSearchcriteria = By.xpath("(//mat-icon[text()='add'])[1]");
		public static final By RemoveSearchCriteria = By.xpath("(//mat-icon[text()='remove'])[1]");
		public static final By PleaseSelectOne1 = By.xpath("(//mat-select[@role='combobox'])[1]");
		public static final By PleaseSelectOne2 = By.xpath("(//mat-select[@role='combobox'])[2]");
		public static final By PleaseSelectOne3 = By.xpath("(//mat-select[@role='combobox'])[3]");
		public static final By PleaseSelectOne4 = By.xpath("(//mat-select[@role='combobox'])[5]");
		public static final By Entervalue = By.xpath("//input[@data-placeholder='Enter Value']");
		public static final By Addsearchcriteriasort = By.xpath("(//mat-icon[text()='add'])[2]");
		public static final By RemoveSearchCriteriaSort = By.xpath("(//mat-icon[text()='remove'])[2]");
		public static final By Search = By.xpath("//span[text()=' Search ']");
		public static final By Download = By.xpath("//span[text()=' Download ']");
		public static final By SaveFilterButton = By.xpath("//span[text()=' Save Filter ']");
		public static final By ResetCriteria = By.xpath("//span[text()='Reset Criteria']");
		public static final By SaveFilter = By.xpath("//div[text()='Save Filter']");
		public static final By EnterFilterName = By.xpath("//input[@data-placeholder='Enter Filter Name']");
		public static final By EditFilterName = By.xpath("//mat-icon[text()='mode_edit']");
		public static final By SaveAndSearch = By.xpath("//span[text()=' Save and Search ']");
		public static final By ClearFilters = By.xpath("//span[text()='Clear Filters']");
		public static final By Apply = By.xpath("//span[text()=' Apply ']");
		public static final By SelectStatus = By
				.xpath("//span[contains(@class,'mat-select-placeholder mat-select-min-line')]");
		public static final By SelectFilter = By.xpath("//mat-label[text()=' Select Filter ']");
		public static final By SearchIcon = By.xpath("//i[text()='search']");
		public static final By Initiate = By.xpath("(//material-button[@class='ng-star-inserted']//button//span)[1]");

	}

	public static class QuickLinks {

		public static final By OrganizationManagement = By.xpath("//div[text()='Organization Management ']");
		public static final By UserManagement = By.xpath("//div[text()='User Management ']");
		public static final By RolesAndPermissions = By.xpath("//div[text()='Roles & Permissions ']");
		public static final By Locations = By.xpath("//div[text()='Locations ']");
		public static final By MasterDataManagement = By.xpath("//div[text()='Master Data Management ']");
		public static final By Integrations = By.xpath("//div[text()='Integrations ']");
		public static final By SubscriptionApproval = By.xpath("//div[text()='Subscription Approval ']");
		public static final By VDMSettings = By.xpath("//div[text()='VDM Settings ']");

	}

	public static class ManageApps {

		public static final By MyApps = By.xpath("//div[text()='My Apps ']");
		public static final By AppsPendingApproval = By.xpath("//div[text()='Apps Pending Approval ']");
		public static final By AllApps = By.xpath("//div[text()='All Apps ']");

	}

	public static class SettingsDropdownList {

		public static final By AccessAPI = By.xpath("//span[text()='Access API']");
		public static final By ActiveTokens = By.xpath("//span[text()='Active Tokens']");
		public static final By ResetUserPassword = By.xpath("//span[text()='Reset User Password']");
		public static final By Notifications = By.xpath("//span[text()='Notifications']");
		public static final By ScheduleJob = By.xpath("//span[text()='Schedule Job']");
		public static final By IndexData = By.xpath("//span[text()='Index Data']");
		public static final By ManageApps = By.xpath("//span[text()='Manage Apps']");
		public static final By EventSubscriptions = By.xpath("//span[text()='Event Subscriptions']");
		public static final By IdentityProviders = By.xpath("//span[text()='Identity Providers']");
		public static final By ProviderOrganizations = By.xpath("//span[text()='Provider Organizations']");

	}

	public static By eWBStatus(String element) {
		return By.xpath("//div[text()='" + element + "']");
	}
	
	public static By appCategory(String element) {
		return By.xpath("//div[text()='" + element + "']");
	}


	public static By switchLocation(String element) {

		return By.xpath("//span[text()='" + element + "']");
	}

	public static By switchTenant(String element) {

		return By.xpath("//div[@class='tenantsList']/following::span[text()='" + element + "']");
	}

	public static By switchOrganization(String element) {

		return By.xpath("(//span[text()='" + element + "'])[1]");
	}

	public static By ReportDownload(int i) {

		return By.xpath("(//div[@role='menu']//div//span//span//a//mat-icon)[" + i + "]");
	}

	public static By Filterstatus(String element) {
		return By.xpath("//span[text()='" + element + "']");
	}

	public static By checkStatus(int i) {

		return By.xpath("//span[text()=' E-Way Bill Status '][" + i + "]");
	}

	public static By selectListOfRecords(int i) {

		return By.xpath("(//div[@class='invoiceFeedItem_details row'])[" + i + "]");
	}
	
	public static By selectListOfbulkRecords(int i) {

		return By.xpath("(//span[@class='mat-option-text'])[" + i + "]");
	}
	
	public static By reportStatus(String element) {

		return By.xpath("(//td[text()='" + element + "'])[1]");
	}

}
