package com.ashokit.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ashokit.dta.Book;

public class BookRepoImpl implements IBookRepo{

	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public void saveBook(Book book) {
		
		String query="INSERT INTO bookdetails(bookid, bookname, bookprice) VALUES (?, ?, ?)";
		int update = jdbcTemplate.update(query,book.getBookId(),book.getBookName(),book.getBookPrice());
		if(update>=1)
		{
			System.out.println("Book inserted into Table || book "+book);
		}
		else {
			System.out.println("Book data is updated... || book "+book);
		}
	}
}