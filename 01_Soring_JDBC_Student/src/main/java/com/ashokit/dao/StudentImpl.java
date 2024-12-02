package com.ashokit.dao;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ashokit.beans.Student;



public class StudentImpl implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	@Override
	public int insert(Student student)  {
		String query="insert into student(id,name,course) values (?,?,?)";

		int result=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCourse());
		return result;
	}
	@Override
	public int change(Student student) {

		//updating query
		String query="update student set name=? ,course=?,id=?";
		int update = this.jdbcTemplate.update(query ,student.getName(),student.getId(), student.getCourse() );
		
		return update;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
