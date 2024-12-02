package com.ashokIt.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.ashokIt.DTO.Book;
import com.ashokIt.dao.IBookDAO;



public class BookService {
	private IBookDAO iBookDao;
	public BookService() {

		System.out.println("BookService::Constructor");
	}
	
	public void setiBookDao(IBookDAO iBookDao) {
		this.iBookDao = iBookDao;
	}
	public void insertDataFromFile(String filePath) throws FileNotFoundException, IOException{
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
		String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				Book book = new Book(Integer.parseInt(values[0]), values[1], Double.parseDouble(values[2]));
				iBookDao.saveBook(book);
				System.out.println("SUCCESS...");
			}
		}
	}
}
