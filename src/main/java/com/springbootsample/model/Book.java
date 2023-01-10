package com.springbootsample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="books")
@Data
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="book_name")
	private String bookname;
	@Column(name="author_name")
	private String authorname;
	@Column(name="book_price")
	private String bookprice;
	@Column(name="date_of_publition")
	private String dateofpublition;
	
	
}
