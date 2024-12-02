package com.ashokit.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import comashokit.pojo.Student;

public class StudentRowMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

		Student s=new Student();
		s.setSId(rs.getInt(1));
		s.setSName(rs.getString(2));
		s.setLocation(rs.getString(3));
		return s;
	}
}
