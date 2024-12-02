package com.ashokit.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashokit.beans.SpringLifeCycle;

public class MyApp {

	public static void main(String[] args) {

		ApplicationContext ctxt=
				new ClassPathXmlApplicationContext("Beans.xml");
		SpringLifeCycle springLifeCycle = ctxt.getBean(SpringLifeCycle.class);
		ConfigurableApplicationContext cptxt=(ConfigurableApplicationContext) ctxt;
		
		springLifeCycle.doService();
		cptxt.close();
	}

}
