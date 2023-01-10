package com.springbootsample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootsample.model.Book;
import com.springbootsample.repository.BookRepository;
import com.springbootsample.service.BookService;
@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.saveBook(book);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.getAllBooks();
	}

}
