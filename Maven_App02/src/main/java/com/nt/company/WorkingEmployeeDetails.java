package com.nt.company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WorkingEmployeeDetails {

	public static void main(String[] args) {

		ApplicationContext ctxt=
				new ClassPathXmlApplicationContext("beans.xml");
		PartTimeEmployee prt = ctxt.getBean(PartTimeEmployee.class);
		prt.start();
		RegularEmployee rge = ctxt.getBean(RegularEmployee.class);
		rge.start();
	}

}
