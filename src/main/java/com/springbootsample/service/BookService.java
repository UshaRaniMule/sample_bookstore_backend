package com.springbootsample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springbootsample.model.Book;


public interface BookService {
	
	Book saveBook(Book book);

	List<Book> getAllBooks();
}
