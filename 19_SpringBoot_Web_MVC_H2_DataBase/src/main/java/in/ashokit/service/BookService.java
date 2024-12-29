package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.Book;

public interface BookService {
	public boolean saveBook(Book bookObj);
	public List<Book> getAllBooks();



}
