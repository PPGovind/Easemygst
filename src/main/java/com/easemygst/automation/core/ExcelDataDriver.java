package com.easemygst.automation.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataDriver {
	private static File file;
	private static FileInputStream inputStream;
	private static XSSFWorkbook workBook;
	private static XSSFSheet sheet;
	private static RandomData random = new RandomData();
	static boolean initialized = false;

	public static void WriteData(String ColumnName, String filename) throws Exception {
		file = new File(".//src//test//resources//testData//" + filename);
		inputStream = new FileInputStream(file);

		workBook = new XSSFWorkbook(inputStream);
		sheet = workBook.getSheet("EWB Input Data");
		FileOutputStream fout = new FileOutputStream(".//src//test//resources//testData//" + filename);

		Row row = sheet.getRow(0);
		int lastrow = sheet.getLastRowNum();
		short lastcolumnused = row.getLastCellNum();
		for (int i = 0; i < lastcolumnused; i++) {
			if (row.getCell(i).getStringCellValue().equalsIgnoreCase(ColumnName)) {
				for (int j = 1; j <= lastrow; j++) {
					sheet.getRow(j).getCell(i).setCellType(CellType.STRING);
					sheet.getRow(j).getCell(i).setCellValue("Inv"+random.nextString());

				}
				break;
			}
		}
		
		workBook.write(fout);
		fout.flush();
		fout.close();
	}

}