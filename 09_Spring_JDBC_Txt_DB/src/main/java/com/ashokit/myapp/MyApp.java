package com.ashokit.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashokit.beans.VehcileService;

public class MyApp {

	public static void main(String[] args) throws Exception {

		ApplicationContext ctxt=new ClassPathXmlApplicationContext("Beans.xml");
	
		VehcileService vehcileService = ctxt.getBean(VehcileService.class);
		vehcileService.saveVehcileData();
	}

}
