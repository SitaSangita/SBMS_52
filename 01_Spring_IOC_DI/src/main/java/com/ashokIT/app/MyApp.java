package com.ashokIT.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashokIT.beans.UserService;

public class MyApp {

	public static void main(String[] args) {

		ApplicationContext ctxt=
				new ClassPathXmlApplicationContext("Spring-Beans.xml");
		
		UserService service = ctxt.getBean(UserService.class);
		service.saveUser("Sangita","Setha",245893);
	}

}
