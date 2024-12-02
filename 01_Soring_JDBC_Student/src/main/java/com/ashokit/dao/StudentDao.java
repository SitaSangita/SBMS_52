package com.ashokit.dao;

import com.ashokit.beans.Student;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student student);
}
