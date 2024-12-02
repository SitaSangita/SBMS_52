package com.ashokit.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ashokit.dao.IVehcileDao;
import com.ashokit.dto.Vehcile;
import com.mysql.cj.result.Row;


public class ExcelReportService {
	private IVehcileDao iVehcileDao;
	
	public ExcelReportService(IVehcileDao iVehcileDao) {
		this.iVehcileDao=iVehcileDao;
		System.out.println("ExcelReportService::Constructor");

	}
	 public void exportVehcileToExcel(List<Vehcile> vehciles) throws IOException {
		// List<Vehcile> vehciles = new ArrayList<>();
	        // Create a workbook and a sheet in the Excel file
	        Workbook workbook = new XSSFWorkbook();
	        Sheet sheet = workbook.createSheet("Vehcile");

	        // Create header row in the sheet
	        org.apache.poi.ss.usermodel.Row headerRow = sheet.createRow(0);
	        headerRow.createCell(0).setCellValue("vId");
	        headerRow.createCell(1).setCellValue("vName");
	        headerRow.createCell(2).setCellValue("vPrice");

	        // Populate data rows with employee details
	        int rowNum = 1;
	        for (Vehcile vehcile :vehciles) {
	            org.apache.poi.ss.usermodel.Row row = sheet.createRow(rowNum++);
	            row.createCell(0).setCellValue(vehcile.getvId());
	            row.createCell(1).setCellValue(vehcile.getvName());
	            row.createCell(2).setCellValue(vehcile.getvPrice());
	            rowNum++;
	        }
	        

	        // Write the workbook to an output file
	        try (FileOutputStream fileOut = new FileOutputStream("D:\\AshokIT\\Vehcile.xlsx")) {
	            workbook.write(fileOut);
	            
	            System.out.println("Data successfully imported");
	        } finally {
	            workbook.close();
	        }
	    }

}
