package com.springbootsample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootsample.model.Book;
import com.springbootsample.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {

	@Autowired
	private BookService bookService;
	@PostMapping("/save")
	public ResponseEntity<Book> saveBook(@RequestBody Book book){
		
		
		return new ResponseEntity<Book>(bookService.saveBook(book),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Book>> getAllBooks(){
		
		
		return new ResponseEntity<List<Book>>(bookService.getAllBooks(),HttpStatus.OK);
		
	}
	
}
