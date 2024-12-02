package com.nt.Core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class StudentDitails {

	//private static final String Student = null;

	public static void main(String[] args) {

		ApplicationContext ctxt=new ClassPathXmlApplicationContext("Beans.xml");
				/*new FileSystemXmlApplicationContext("D:\\AshokIT\\some.xml");
		*/
				ApplicationContext ctxt2 = ctxt;
		Student st = ctxt2.getBean("student",Student.class);
		st.displayInfo();

		int a=10;
		int b=20;
		
		Student st01 = ctxt2.getBean("student01",Student.class);
		st.displayInfo();

		// Student;
		
		//Student bean = (Student)ctxt2.getBean(Student);
	}

}
