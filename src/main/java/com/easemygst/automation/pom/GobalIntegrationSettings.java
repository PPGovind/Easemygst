package com.easemygst.automation.pom;

import org.openqa.selenium.By;

import com.easemygst.automation.common.TaxillaCommon;
import com.easemygst.automation.core.RandomData;
import com.easemygst.automation.core.TestActions;

public class GobalIntegrationSettings {
	private static RandomData random = new RandomData();
	private TestActions action = null;
	private RandomData RD = null;

	By Ftp = By.xpath("//div[@role='tab']//div[text()=' FTP ']");
	By AddConfig = By.xpath("//mat-icon[@title='Add configuration']");
	By Name = By.xpath("//input[@name='Name']");
	By ServerAddr = By.xpath("//input[@name='Server Address']");
	By Port = By.xpath("//input[@name='Port']");
	By Maxconnection = By.xpath("//input[@name='Maximum No. of Connections']");
	By FolderPath = By.xpath("//input[@name='Folder Path']");
	By UserName = By.xpath("//input[@name='User Name']");
	By Pwd = By.xpath("//input[@name='Password']");
	By textarea = By.xpath("//textarea[@name='Encrypted Key']");
	By SshFTP1 = By.xpath("(//span[@class='mat-ripple-element mat-radio-persistent-ripple'])[3]");
	By SshFTP2 = By.xpath("(//input[@class='mat-radio-input'])[4]");
	By Addkey1 = By.xpath("(//input[@class='mat-radio-input'])[5]");
	By Addkey2 = By.xpath("(//input[@class='mat-radio-input'])[6]");
	By Cancel = By.xpath("//span[text()=' Cancel ']");
	By Delete = By.xpath("//span[text()=' Delete ']");
	By Testconnection = By.xpath("//span[text()=' Test Connection ']");
	By Save = By.xpath("//span[text()=' Save ']");
	By Msg = By.xpath("//span[text()='Connected successfully']");
	By quickclick = By.xpath("//*[@id=\"newsEventsFaqs\"]/div[1]/div");

	public GobalIntegrationSettings(TestActions action) {
		this.action = action;
	}

	public GobalIntegrationSettings(RandomData RD) {
		this.RD = RD;
	}
	
	public boolean quickclick() throws Throwable {
		Boolean passed = false;
		passed = action.waitFor(quickclick, 20, true);
		passed = action.clickUsingJs(quickclick);
		return passed;
	}
	
	
	
	public boolean IntSetings() throws Throwable {
		Boolean passed = false;
		passed = action.waitFor(TaxillaCommon.QuickLinks.Integrations, 20, true);
		passed = action.clickOn(TaxillaCommon.QuickLinks.Integrations);
		return passed;
	}	
	public boolean AddCon() throws Throwable {
		Boolean passed = false;
		passed = action.waitFor(AddConfig, 20, true);
		passed = action.clickOn(AddConfig);
		return passed;
	}

	public boolean Name() throws Throwable {
		Boolean passed = false;
		passed = action.waitFor(Name, 20, true);
		passed = action.sendDataTo(Name, "SFTP" + random.nextString());
		return passed;
	}
	
	public boolean SerAddr(String SerAddr) throws Throwable {
		Boolean passed = false;
		passed = action.waitFor(ServerAddr, 20, true);
		passed = action.sendDataTo(ServerAddr, SerAddr);
		return passed;
	}
		
	public boolean Port(String pt) throws Throwable {
		Boolean passed = false;
		passed = action.waitFor(Port, 20, true);
		passed = action.sendDataTo(Port, pt);
		return passed;
	}
		
	public boolean MaxConn(String mc) throws Throwable {
		Boolean passed = false;
		passed = action.waitFor(Maxconnection, 20, true);
		passed = action.sendDataTo(Maxconnection, mc);
		return passed;
	}
	
	public boolean FolPath(String fp) throws Throwable {
		Boolean passed = false;
		passed = action.waitFor(FolderPath, 20, true);
		passed = action.sendDataTo(FolderPath, fp);
		return passed;
	}
	
	public boolean UserName(String un) throws Throwable {
		Boolean passed = false;
		passed = action.waitFor(UserName, 20, true);
		passed = action.sendDataTo(UserName, un);
		return passed;
	}
		
	public boolean Pwd(String pw) throws Throwable {
		Boolean passed = false;
		passed = action.waitFor(Pwd, 20, true);
		passed = action.sendDataTo(Pwd, pw);
		return passed;
	}	
		
	public boolean SshFTP1() throws Throwable {
		Boolean passed = false;
		passed = action.waitFor(SshFTP1, 20, true);
		passed = action.clickOn(SshFTP1);
		return passed;
	}
	
	public boolean AddKey() throws Throwable {
		Boolean passed = false;
		passed = action.waitFor(Addkey1, 20, true);
		passed = action.clickOn(Addkey1);
		return passed;
	}
	
	public boolean TxtArea(String txta) throws Throwable {
		Boolean passed = false;
		passed = action.waitFor(textarea, 20, true);
		passed = action.sendDataTo(textarea, txta);
		return passed;
	}
		
	public boolean TestConn() throws Throwable {
		Boolean passed = false;
		passed = action.waitFor(Testconnection, 20, true);
		passed = action.clickOn(Testconnection);
		return passed;
	}	
		
	

	public boolean verifyconnectionStatus(String status) throws Throwable {

		boolean passed = false;
		passed = action.waitFor(TaxillaCommon.eWBStatus(status), 20, true);
		passed = action.countOf(TaxillaCommon.eWBStatus(status)) > 0;
		action.waitFor(2);
        return passed;

	}

}
