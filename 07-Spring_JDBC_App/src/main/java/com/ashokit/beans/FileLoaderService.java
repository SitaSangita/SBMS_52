package com.ashokit.beans;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.ashokit.dao.IBookRepo;
import com.ashokit.dta.Book;

public class FileLoaderService {

	private IBookRepo bookRepo;

	public void setBookRepo(IBookRepo bookRepo) {
		this.bookRepo = bookRepo;
	}

	public void loadDataFromFile(String filePath) {
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				Book book = new Book(Integer.parseInt(values[0]), values[1], Double.parseDouble(values[2]));
				bookRepo.saveBook(book);
				System.out.println("SUCCESS...");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}