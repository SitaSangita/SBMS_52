package com.ashokit.myapp;

import java.io.IOException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashokit.dto.Vehcile;
import com.ashokit.service.ExcelReportService;

public class MyApp {

	public static void main(String[] args) throws IOException {

		System.out.println("Main Started");
		ApplicationContext ctxt=
				new ClassPathXmlApplicationContext("Beans.xml");
		ExcelReportService excelReportService = ctxt.getBean(ExcelReportService.class);
		//.exportVehcileToExcel(new);
		System.out.println("Main method Ends....");
	}

}
