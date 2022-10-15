package com.easemygst.automation.common;

import org.openqa.selenium.By;

public class LeftLink {
	
	
	public static class AppConfiguration {
		public static final By AppHome = By.xpath("//a[text()='App Home']");
		public static final By SetupAttributes = By.xpath("//a[text()='Setup Attributes']");
		public static final By InboundIntegrations = By.xpath("//a[text()='Inbound Integrations']");
		public static final By OutboundIntegrations = By.xpath("//a[text()='Outbound Integrations']");
		public static final By MastersScheduler = By.xpath("//a[text()='Masters Scheduler']");
		public static final By Workflow = By.xpath("//a[text()='Workflow']");
		public static final By Transformations = By.xpath("//a[text()='Transformations']");
		public static final By RestAPIExplorer = By.xpath("//a[text()='Rest API Explorer']");
		public static final By CollaborationConfiguration = By.xpath("//a[text()='Collaboration Configuration']");
		
	}

}
