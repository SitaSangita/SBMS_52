package com.ashokit.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashokit.beans.Student;
import com.ashokit.dao.StudentDao;
import com.ashokit.dao.StudentImpl;

public class App {

	public static void main(String[] args) {

		System.out.println("Main Started");
		ApplicationContext ctxt=
				new ClassPathXmlApplicationContext("Beans.xml");
	
	
		StudentImpl studentImpl = ctxt.getBean("studentImpl",StudentImpl.class);
		Student student=new Student();
		student.setId(103);
		student.setName("Dolly");
		student.setCourse("Java");
		int insert = studentImpl.insert(student);
		System.out.println(insert);
	
	}
	

}
