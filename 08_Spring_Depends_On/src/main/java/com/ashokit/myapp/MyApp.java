package com.ashokit.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		ApplicationContext ctxt=new ClassPathXmlApplicationContext("Beans.xml");
	}

}