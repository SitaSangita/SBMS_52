package com.ashokit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashokit.beans.UserService;

public class MyApp {

	public static void main(String[] args) {

		ApplicationContext ctxt=
				new ClassPathXmlApplicationContext("Beans.xml");

		UserService userService = ctxt.getBean(UserService.class);
		userService.registration();
	}

}
