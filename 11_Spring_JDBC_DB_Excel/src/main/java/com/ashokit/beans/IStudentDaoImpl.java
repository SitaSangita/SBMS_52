package com.ashokit.beans;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.ashokit.mapper.StudentRowMapper;

import comashokit.pojo.Student;

import org.springframework.jdbc.core.JdbcTemplate;

public class IStudentDaoImpl implements IStudentDao{
	private JdbcTemplate jdbcTemplate;
	public IStudentDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	@Override
	public void inserDataInDataBase(Integer sId, String sName, String location) {

		String sql="insert into student01 values(?,?,?)";
		jdbcTemplate.update(sql,ps->{
			ps.setInt(1,sId);
			ps.setString(2, sName);
			ps.setString(3,location);
		});
	}
	@Override
	public List<Student> getStudent() {
		String sql="Select * from student01";
		List<Student> students=jdbcTemplate.query(sql,new StudentRowMapper());
		return students;
	}
}