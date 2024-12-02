package com.ashokit.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashokit.beans.Car;

public class MyApp {

	public static void main(String[] args) {

		ApplicationContext ctxt=
				new ClassPathXmlApplicationContext("Spring_Beans.xml");
		
		Car car = ctxt.getBean(Car.class);
		car.drive();
		
	}

}
