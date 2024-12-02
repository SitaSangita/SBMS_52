package com.ashokit.beans;

import java.io.IOException;
import java.util.List;

import comashokit.pojo.Student;

public interface IStudentDao {

	void inserDataInDataBase(Integer sid,String sName,String location);
	public List<Student> getStudent();
}
