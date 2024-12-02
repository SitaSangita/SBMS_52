package com.ashokIt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ashokIt.DTO.Book;

public class BookDAOImpl implements IBookDAO{

	private  JdbcTemplate jdbcTemplate;
	
	 public BookDAOImpl() {

		 System.out.println("Object Created for BookDAOImpl");
	 }
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		System.out.println("Setter method executed in BookDaoImpl class");
	}
	

	@Override
	public void saveBook(Book book) {

		String query="INSERT INTO books (bookid, bookname, bookprice) VALUES (?, ?, ?)";
		int update = jdbcTemplate.update(query,book.getBookId(),book.getBookName(),book.getBookPrice());
		if(update>=1)
		{
			System.out.println("Book inserted into Table || book "+book);
		}
		else {
			System.out.println("Book data is updated... || book "+book);
		}
		
	
		System.out.println("Data stored inside data base successfully");
	}
	

}
