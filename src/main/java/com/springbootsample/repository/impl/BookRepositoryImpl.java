package com.springbootsample.repository.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbootsample.model.Book;
import com.springbootsample.repository.BookRepository;


@Repository
@Transactional
public class BookRepositoryImpl implements BookRepository{
    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public Book saveBook(Book book) {
    	System.out.println("PRINT INSIDE THE SAVE BOOK");
        Integer isSuccess = (Integer)getSession().save(book);
       
        return getSession().get(Book.class, isSuccess);
                
    }

    public boolean delete(Book book) {
        getSession().delete(book);
        return true;
    }

    @SuppressWarnings("unchecked")
    public List<Book> getAllBooks() {
        return getSession().createQuery("from Book").list();
    }
}