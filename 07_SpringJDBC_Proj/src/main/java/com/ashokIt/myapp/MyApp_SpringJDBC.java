package com.ashokIt.myapp;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashokIt.service.BookService;

public class MyApp_SpringJDBC {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		System.out.println("Spring JDBC Proram Started");
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("Beans.xml");
		
		BookService bookService = ctxt.getBean(BookService.class);
		
		String filePath="E:/data.txt";
		bookService.insertDataFromFile(filePath);
	}

}
