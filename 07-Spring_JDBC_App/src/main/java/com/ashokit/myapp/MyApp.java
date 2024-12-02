package com.ashokit.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashokit.beans.FileLoaderService;

public class MyApp {

	
	public static void main(String[] args) {
		ApplicationContext cont= new ClassPathXmlApplicationContext("Beans.xml");
		FileLoaderService bean = cont.getBean(FileLoaderService.class);
		
		bean.loadDataFromFile("src/main/resources/books.txt");
	}
}