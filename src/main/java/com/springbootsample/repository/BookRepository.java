package com.springbootsample.repository;

import java.util.List;

import com.springbootsample.model.Book;

public interface BookRepository {
	
	public Book saveBook(Book book);
	public boolean delete(Book book);
	public List<Book> getAllBooks();

}
