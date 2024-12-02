package com.ashokit.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashokit.beans.Resturant;

public class MyApp {

	public static void main(String[] args) {

		ApplicationContext ctxt=
				new ClassPathXmlApplicationContext("Spring_Beans.xml");
		Resturant resturant = ctxt.getBean(Resturant.class);
		resturant.bill();
	}

}
