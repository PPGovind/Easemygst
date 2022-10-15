package com.easemygst.automation.pom;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.easemygst.automation.common.TaxillaCommon;
import com.easemygst.automation.core.TestActions;

public class Ewb_PanIndia {
	private TestActions action = null;
	private static String DocNumber = null;
	By StatewideLoc = By.xpath("(//div[@class='tenantsList'])[2]//button[2]");
	By OutwardLoc = By.xpath("//span[text()='Autotest | Autotestone | AutotestTwo ']");
	By EWBStatewide = By.xpath("//span[text()=' EWB-Statewide ']");
	By DocumentNumber = By.xpath("//span[text()=' Document No: ']/following::div[1]");
	By PanIndiaOutward = By.xpath("//span[text()=' Outward E-Way Bills ']");

	public Ewb_PanIndia(TestActions action) {
		this.action = action;
	}

	public boolean ewdStatewide(String location) throws Throwable {

		boolean passed = false;
		passed = action.waitFor(TaxillaCommon.LevelOne.Org, 20, true);
		passed = action.clickOn(TaxillaCommon.LevelOne.Org);
		passed = action.waitFor(TaxillaCommon.switchLocation(location), 20, true);
		passed = action.clickOn(TaxillaCommon.switchLocation(location));
		passed = action.waitFor(EWBStatewide, 20, true);
		passed = action.clickOn(EWBStatewide);
		

		return passed;

	}

	public boolean panIndiaOutward(String location) throws Throwable {

		boolean passed = false;
		passed = action.waitFor(TaxillaCommon.LevelOne.Org, 20, true);
		passed = action.clickOn(TaxillaCommon.LevelOne.Org);
		passed = action.waitFor(TaxillaCommon.switchLocation(location), 20, true);
		passed = action.clickOn(TaxillaCommon.switchLocation(location));
		passed = action.waitFor(PanIndiaOutward, 20, true);
		passed = action.clickOn(PanIndiaOutward);
		action.waitFor(2);

		return passed;

	}

	public boolean documentNumber() throws Throwable {

		boolean passed = false;

		passed = action.waitFor(DocumentNumber, 20, true);
		if (action.countOf(DocumentNumber) > 0) {
			DocNumber = action.getTextFromPage(DocumentNumber);
		}
		action.waitFor(2);

		return passed;

	}

	public boolean verifyDocNumber() throws Throwable {

		boolean passed = false;

		passed = action.waitFor(DocumentNumber, 20, true);
		if (action.countOf(DocumentNumber) > 0) {
			if (DocNumber.contentEquals(action.getTextFromPage(DocumentNumber))) {

				System.out.println(action.getTextFromPage(DocumentNumber));
			} else {
				Assert.fail();
			}
		}

		action.waitFor(2);

		return passed;

	}
}
