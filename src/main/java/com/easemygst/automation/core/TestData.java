package com.easemygst.automation.core;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestData {
	public static String userName = "";
	public static String passWord = "";
	public static String autURL = "";
	public static String securityQ1= "";
	public static String securityQ2= "";
	public static String eWaybillTestData="";
	public static String consolidatedEWBTestData="";
	public static String eWBErrorReportTestData="";
	public static String panIndia="";
	public static String panIndiaLevel1="";
	public static String panIndiaLevel2="";
	public static String orgName="";	
	public static String tenant="";	
	static String FileName = "src//test//resources//Config.properties";
	static String TestDataFile = "src//test//resources//TestData.properties";
	static Properties properties = new Properties();

	private static String getData(String dataName) {
		try {

			properties.load(new FileInputStream(FileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		String data = properties.getProperty(dataName);

		System.out.println(dataName + " : " + data);

		return data;
	}
	private static String getTestData(String dataName) {
		try {

			properties.load(new FileInputStream(TestDataFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
		String data = properties.getProperty(dataName);

		System.out.println(dataName + " : " + data);

		return data;
	}

	public static void loadTestData() {
		userName = getData("userName");
		passWord = getData("passWord");
		autURL = getData("autURL");
		securityQ1 = getData("securityQ1");
		securityQ2 = getData("securityQ2");
		eWaybillTestData = getTestData("eWaybillTestData");
		consolidatedEWBTestData = getTestData("consolidatedEWBTestData");
		eWBErrorReportTestData = getTestData("eWBErrorReportTestData");
		panIndia = getTestData("panIndia");
		panIndiaLevel1 = getTestData("panIndiaLevel1");
		panIndiaLevel2 = getTestData("panIndiaLevel2");
		tenant = getTestData("tenant");
		orgName = getTestData("orgName");
		

	}

}
