package com.ashokit.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import comashokit.pojo.Student;

public class ExcelFileGenerator {
	public ExcelFileGenerator() {

		System.out.println("ExcelFileGenerator");
	}
	public void excelFileGenerator(List<Student> student) throws IOException {
		SXSSFWorkbook workBook=new SXSSFWorkbook();
		Sheet sheet=workBook.createSheet();
		Row headerRow=sheet.createRow(0);
		headerRow.createCell(0).setCellValue("SID");
		headerRow.createCell(1).setCellValue("SName");
		headerRow.createCell(2).setCellValue("Location");
		int dataRowIndex=1;
		for(Student s:student) {
			Row dataRow=sheet.createRow(dataRowIndex);
			dataRow.createCell(0).setCellValue(s.getSId());
			dataRow.createCell(1).setCellValue(s.getSName());
			dataRow.createCell(2).setCellValue(s.getLocation());
			dataRowIndex++;
		}
		File f=new File("Stundets.xlsx");
		FileOutputStream fos=new FileOutputStream(f);
		workBook.write(fos);
		fos.close();
		workBook.close();
		
	}

}
