package com.day3;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OmrBranch {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Administrator\\eclipse-workspace\\MavenProject\\ExcelSheets\\Omrbranch.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
	Workbook workbook = new XSSFWorkbook(stream);
	
	Sheet sheet = workbook.getSheet("Sheet1");
	
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
		
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
		
		CellType type = cell.getCellType();
		
		switch (type) {
		case STRING:
		 String value = cell.getStringCellValue();
		 System.out.println(value);
			
			break;
		
		case NUMERIC:
		
		double d = cell.getNumericCellValue();
		long round = Math.round(d);
		if(round==d) {
			String valueOf = String.valueOf(round);
			System.out.println(valueOf);
		} else {
			String valueOf = String.valueOf(d);
			System.out.println(valueOf);
		
			break; 
			
		}}}}}}
			
			
		
	
