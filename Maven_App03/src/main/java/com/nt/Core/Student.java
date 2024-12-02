package com.nt.Core;

public class Student {
	private int a;
	private int b;
	private int id;
	private String studentName;
	public void setId(int id) {
		this.id = id;
		System.out.println("Student Id::");
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
		System.out.println("Student Name");
	}
	
	public void displayInfo() {
		
		System.out.println("StudentName   :: " + studentName+ " \nId   :: "+id);
	}
	

}
